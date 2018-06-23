import javax.swing.*;
import java.awt.geom.Line2D;

public class Main {

    //15 x 20 + 20 + 20 = 340(chessboard length)

    public static void main(String[] args){
        JFrame mainWindow = new ChessBoardFrame();
        FiveChessData myFiveChess = new FiveChessData();


        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(ChessBoardFrame.length, ChessBoardFrame.length);
        mainWindow.add(new ChessBoardComponent());
        mainWindow.setVisible(true);
    }


}
