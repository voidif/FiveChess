
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;



public class ChessBoardComponent extends JComponent{

    private boolean isBlack = true;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;


        for(int i = 1; i <= FiveChessData.CHESSBOARD_ROWNUMS; i ++){
            //draw the row
            ChessBoardCoord begin = ChessBoardCoord.getCoordByNums(i, 1, DrawData.WIDTH);
            ChessBoardCoord end = ChessBoardCoord.getCoordByNums(i, 15, DrawData.WIDTH);
            Line2D.Double segment = new Line2D.Double(begin.getXCoord(), begin.getYCoord(),
                    end.getXCoord(), end.getYCoord());
            g2.draw(segment);


            //draw the column
            begin = ChessBoardCoord.getCoordByNums(1, i, DrawData.WIDTH);
            end = ChessBoardCoord.getCoordByNums(15, i, DrawData.WIDTH);
            segment = new Line2D.Double(begin.getXCoord(), begin.getYCoord(),
                    end.getXCoord(), end.getYCoord());
            g2.draw(segment);
        }
    }
    
    public void drawChess(ChessBoardCoord position) {
        Graphics g = getGraphics();
        Graphics2D g2 = (Graphics2D)g;
        if(isBlack){
            g2.setColor(Color.BLACK);
        } else{
            g2.setColor(Color.WHITE);
        }
        isBlack = !isBlack;


        int radius = DrawData.CHESS_RADIUS;
        Ellipse2D.Double chess = new Ellipse2D.Double(position.getXCoord() - radius, position.getYCoord() - radius,
                2 * radius, 2 * radius);
        g2.fill(chess);
    }
}

