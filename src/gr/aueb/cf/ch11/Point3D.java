package gr.aueb.cf.ch11;

/**
 * Immutable 3D Point.
 */

public final class Point3D {
    private final Point point;
    private final int z;

    public Point3D(){
        point = new Point();
        z =0;
    }

    public Point3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY()); // για να γίνει immutable
        this.z = z;
    }

    public Point getPoint() {
//        return point;
        return new Point(this.point.getX(),this.point.getY()); // για να γίνει immutable
    }

    public int getZ() {
        return z;
    }
}
