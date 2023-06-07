package gr.aueb.cf.ch11;

public class ImmutablePoint3D {
    private final ImmutablePoint point;
    private final int z;

    public ImmutablePoint3D() {
        this.point =new ImmutablePoint();
        this.z =0;
    }

    public ImmutablePoint getPoint() {
        return point;
    }

    public int getZ() {
        return z;
    }
}
