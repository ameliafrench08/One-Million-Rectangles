public class Rectangle {
    int length;
    int width;
    int topLeftX;
    int topLeftY;

    public Rectangle(int length, int width, int topLeftX, int topLeftY){
        this.length = length;
        this.width = width;
        this.topLeftX = topLeftX;
        this.topLeftY = topLeftY;
    }

    public int getRightX(){
        return topLeftX + length;
    }

    public int getBottomY(){
        return topLeftY - width;
    }

    public int getTopLeftX(){
        return topLeftX;
    }

    public int getTopLeftY(){
        return topLeftY;
    }

    public boolean intersect(Rectangle otherRectangle){
        if (otherRectangle.getTopLeftX() == topLeftX){
            return true;
        }

        if (otherRectangle.getRightX() == getRightX()){
            return true;
        }

        if (otherRectangle.getTopLeftY() == topLeftY){
            return true;
        }

        if (otherRectangle.getBottomY() == getBottomY()){
            return true;
        }

        // CHECK EACH POINT OF RANDOM TRIANGLE WHICH IS THIS ONE FOR THIS CLASS:

        // CHECKING TOP RIGHT:

        if (getRightX() >= otherRectangle.getTopLeftX() && getRightX() <= otherRectangle.getRightX() && getTopLeftY() >= otherRectangle.getBottomY() && getTopLeftY() <= otherRectangle.getTopLeftY()){
            return true;
        }

        // CHECKING TOP LEFT:

        if (getTopLeftX() >= otherRectangle.getTopLeftX() && getTopLeftX() <= otherRectangle.getRightX() && getTopLeftY() >= otherRectangle.getBottomY() && getTopLeftY() <= otherRectangle.getTopLeftY()){
            return true;
        }

        // CHECKING BOTTOM RIGHT:

        if (getRightX() >= otherRectangle.getTopLeftX() && getRightX() <= otherRectangle.getRightX() && getBottomY() >= otherRectangle.getBottomY() && getBottomY() <= otherRectangle.getTopLeftY()){
            return true;
        }

        // CHECKING BOTTOM LEFT:

        if (getTopLeftX() >= otherRectangle.getTopLeftX() && getTopLeftX() <= otherRectangle.getRightX() && getBottomY() >= otherRectangle.getBottomY() && getBottomY() <= otherRectangle.getTopLeftY()){
            return true;
        }

        return false;
    }
}
