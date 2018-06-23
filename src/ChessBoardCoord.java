import java.awt.*;

//the (x, y) coord in app mainFrame, easy to draw
public class ChessBoardCoord{
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


    //give a row, column index from 1 to 15, return real screen coordination to draw
    public static ChessBoardCoord getCoordByNums(Point index){
        return new ChessBoardCoord(index.y * DrawData.WIDTH, index.x * DrawData.WIDTH);
    }


    //get the row and column index by mouse clicked position
    public static Point getIndexByMousePostion(Point mousePosition){
        int columnLoc = mousePosition.x - DrawData.MOUSE_OFFSETX;
        int rowLoc = mousePosition.y - DrawData.MOUSE_OFFSETY;
        int column = (int)Math.round((double)columnLoc/(double)DrawData.WIDTH);
        int row = (int)Math.round((double)rowLoc/(double)DrawData.WIDTH);
        return new Point(row + 1, column + 1);
    }
}
