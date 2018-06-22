import javax.swing.*;
import java.awt.geom.Line2D;

public class Main {

    //15 x 20 + 20 + 20 = 340(chessboard length)

    public static void main(String[] args){
        JFrame mainWindow = new JFrame();
        FiveChessData myFiveChess = new FiveChessData();

        mainWindow.setSize(340, 340);
        mainWindow.setVisible(true);
    }

    public static void drawChessBoard(JFrame window, int length){
        int width = length / FiveChessData.CHESSBOARD_LENGTH;

        for(int i = 1; i <= FiveChessData.CHESSBOARD_LENGTH; i ++){
            Line2D.Double segment = new Line2D.Double(i * width, width,
                    i * width, FiveChessData.CHESSBOARD_LENGTH * width);
            window.add(segment);
        }
    }
}
