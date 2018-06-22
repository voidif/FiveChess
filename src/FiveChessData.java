public class FiveChessData {

    public static final int CHESSBOARD_LENGTH = 15;

    private static final int WHITE = 1;
    private static final int BLACK = 2;



    private int[][] chessBoard;

    public FiveChessData(){
        chessBoard = new int[CHESSBOARD_LENGTH][CHESSBOARD_LENGTH];
    }
}
