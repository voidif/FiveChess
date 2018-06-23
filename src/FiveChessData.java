public class FiveChessData {

    public static final int CHESSBOARD_ROWNUMS = 15;

    private static final int WHITE = 1;
    private static final int BLACK = 2;



    private int[][] chessBoard;
    private int[][] chessBoardCoord;

    public FiveChessData(){
        chessBoard = new int[CHESSBOARD_ROWNUMS][CHESSBOARD_ROWNUMS];
    }
}
