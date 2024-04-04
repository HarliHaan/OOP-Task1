public class Point3D extends Point2D {
// private float field z
    private float z;
// three-arguments constructor
    public Point3D(float x, float y, float z) {

        super(x, y);
        this.z = z;

    }
// getter
    public float getZ() {
        return this.z;
    }
// getXYZ method
    public float[] getXYZ() {
        float[] xyz = {this.x, this.y, this.z};
        return xyz;
    }
// setter
    public float setZ() {
        return this.z;
    }
// setXYZ method
    public float[] setXYZ() {
        float[] xyz = {this.x, this.y, this.z};
        return xyz;
    }
// toString method
    @Override
    public String toString() {
        return String.format("(%f,%f,%f)", x, y, z);


    }

    public void setXYZ(int i, int i1, int i2) {
    }
}