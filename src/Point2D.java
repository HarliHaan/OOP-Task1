public class Point2D {
    float x;
    float y;
    public Point2D(){
        this.x = 0;
        this.y = 0;
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
    }
    public float[] getXY() {
        float[] xy = {this.x, this.y};
        return xy;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }

    public float[] setXY() {
        float[] xy = {this.x, this.y};
        return xy;
    }
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    public void setXY(int i, int i1) {
    }
}
