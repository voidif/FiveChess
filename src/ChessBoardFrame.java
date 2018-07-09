import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChessBoardFrame extends JFrame {

    private FiveChessData myFiveChessData;
    private ChessBoardComponent mComponent;

    public ChessBoardFrame(FiveChessData data){

        myFiveChessData = data;
        mComponent = new ChessBoardComponent();

        setSize(DrawData.LENGTH, DrawData.LENGTH);
        add(mComponent);
        setVisible(true);

        addMouseListener(new ChessMouseAdapter());
    }

    class ChessMouseAdapter extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            Point position = e.getPoint();
            position = ChessBoardCoord.getIndexByMousePostion(position);

            ChessBoardCoord drawPosition = ChessBoardCoord.getCoordByNums(position);

            mComponent.drawChess(drawPosition);
            //add to chessBoard data
            myFiveChessData.step(position);
        }

    }
}
