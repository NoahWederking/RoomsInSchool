public class ClassRoom extends BasicRoom{

    private int blackBoardSize;
    final String inch = "inches";
    private String wallColor;

    public ClassRoom(int blackBoardSize,String wallColor, int){
        setWallColor(wallColor);
        setBlackBoardSize(blackBoardSize);
        System.out.println("Classroom walls are " + getWallColor() + " and the blackboard is " + getBlackBoardSize() +
           " " + inch);

    }
    public void setBlackBoardSize(int blackBoardSize){
        this.blackBoardSize = blackBoardSize;
    }

    public void setWallColor(String wallColor){
        this.wallColor = wallColor;
    }

    public int getBlackBoardSize(){
        return blackBoardSize;
    }
    public String getWallColor(){
        return wallColor;
    }



}
