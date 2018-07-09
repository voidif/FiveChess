import javax.swing.*;
import java.awt.geom.Line2D;

public class Main {

    //15 x 20 + 20 + 20 = 340(chessboard length)

    public static void main(String[] args){

        FiveChessData myFiveChess = new FiveChessData();
        JFrame mainWindow = new ChessBoardFrame(myFiveChess);

        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


}
