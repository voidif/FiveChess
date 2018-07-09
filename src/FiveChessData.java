import java.awt.*;

public class FiveChessData {

    public static final int CHESSBOARD_ROWNUMS = 15;

    private static final int WHITE = -1;
    private static final int BLACK = 1;
    private static int currentColor = BLACK;

    //debug
    private static boolean isDebug = true;


    private int[][] chessBoard;

    public FiveChessData(){
        chessBoard = new int[CHESSBOARD_ROWNUMS][CHESSBOARD_ROWNUMS];
    }

    //add a chess to board and switch color
    //@paras: chess coordination
    public void step(Point coord){
        chessBoard[coord.x - 1][coord.y - 1] = currentColor;
        currentColor = - currentColor;
        //debug
        if(isDebug){
            printData();
        }
    }

    public void printData(){
        for(int i = 0; i < chessBoard.length; i ++){
            for(int tmp : chessBoard[i]){
                System.out.print(tmp + " ");
            }
            System.out.println(" ");
        }
    }
}
