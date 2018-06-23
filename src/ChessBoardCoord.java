
//the (x, y) coord in app mainFrame, easy to draw
public class ChessBoardCoord {
    private int xCoord;
    private int yCoord;

    public ChessBoardCoord(int xCoord, int yCoord){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getXCoord() {
        return xCoord;
    }

    public int getYCoord() {
        return yCoord;
    }


    //give a row, column index from 1 to 15, return real screen coordination to draw
    public static ChessBoardCoord getCoordByNums(int row, int column, int width){
        return new ChessBoardCoord(column * width, row * width);
    }
}
