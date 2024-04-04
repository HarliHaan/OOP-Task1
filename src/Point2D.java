public class Point2D {
// two float fields
    float x;
    float y;
// non-arguments constructor which will set x, y fields to 0
    public Point2D(){
        this.x = 0;
        this.y = 0;
    }
// two-arguments constructor: float x, float y
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;

    }
// getter methods which will be responsible for returning x, y fields values
    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }
// get xy method which will return x, y values as two-element array
    public float[] getXY() {
        float[] xy = {this.x, this.y};
        return xy;

    }
// setter methods which will be responsible for setting x, y fields values
    public void setX(float x) {
        this.x = x;
    }
// set x, y method which will be responsible for setting x and y
    public void setY(float y) {
        this.y = y;
    }

    public float[] setXY() {
        float[] xy = {this.x, this.y};
        return xy;
    }
// toString method which should return string in the following format: (x, y)
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public void setXY(int i, int i1) {
    }
}
