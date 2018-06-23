import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;



public class ChessBoardComponent extends JComponent{


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;


        for(int i = 1; i <= FiveChessData.CHESSBOARD_ROWNUMS; i ++){
            //draw the row
            ChessBoardCoord begin = ChessBoardCoord.getCoordByNums(i, 1, ChessBoardFrame.width);
            ChessBoardCoord end = ChessBoardCoord.getCoordByNums(i, 15, ChessBoardFrame.width);
            Line2D.Double segment = new Line2D.Double(begin.getXCoord(), begin.getYCoord(),
                    end.getXCoord(), end.getYCoord());
            g2.draw(segment);


            //draw the column
            begin = ChessBoardCoord.getCoordByNums(1, i, ChessBoardFrame.width);
            end = ChessBoardCoord.getCoordByNums(15, i, ChessBoardFrame.width);
            segment = new Line2D.Double(begin.getXCoord(), begin.getYCoord(),
                    end.getXCoord(), end.getYCoord());
            g2.draw(segment);
        }
    }
}
