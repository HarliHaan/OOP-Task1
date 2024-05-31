public class Point3D extends Point2D {
    private float z;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return this.z;
    }
    public float[] getXYZ() {
        float[] xyz = {this.x, this.y, this.z};
        return xyz;
    }
    public float setZ() {
        return this.z;
    }
    public float[] setXYZ() {
        float[] xyz = {this.x, this.y, this.z};
        return xyz;
    }
    @Override
    public String toString() {
        return String.format("(%f,%f,%f)", x, y, z);
    }
    public void setXYZ(int i, int i1, int i2) {
    }
}