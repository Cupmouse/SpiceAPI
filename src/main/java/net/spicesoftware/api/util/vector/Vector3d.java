package net.spicesoftware.api.util.vector;

import net.spicesoftware.api.Copyable;

import java.io.Serializable;

/**
 * @since 2015/01/15
 */
public final class Vector3d implements Copyable, Serializable {

    public static final Vector3d ZERO = new Vector3d(0, 0, 0);
    public final double x;
    public final double y;
    public final double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lengthSquared() {
        return x * x + y * y + z * z;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    public Vector3d add(double x, double y, double z) {
        return new Vector3d(this.x + x, this.y + y, this.z + z);
    }

    public Vector3d add(Vector3d vector3d) {
        return new Vector3d(x + vector3d.x, y + vector3d.y, z + vector3d.z);
    }

    public Vector3d subtract(double x, double y, double z) {
        return new Vector3d(this.x - x, this.y - y, this.z - z);
    }

    public Vector3d subtract(Vector3d vector3d) {
        return new Vector3d(x - vector3d.x, y - vector3d.y, z - vector3d.z);
    }

    public Vector3d multiply(double scalar) {
        return new Vector3d(x * scalar, y * scalar, z * scalar);
    }

    public Vector3f toVector3f() {
        return new Vector3f((float) x, (float) y, (float) z);
    }

    public Vector3i toVector3i() {
        return new Vector3i((int) x, (int) y, (int) z);
    }

    public Vector2d toVector2d() {
        return new Vector2d(x, y);
    }

    public Vector2f toVector2f() {
        return new Vector2f((float) x, (float) y);
    }

    public Vector2i toVector2i() {
        return new Vector2i((int) x, (int) y);
    }

    @Override
    public Vector3d copy() {
        return new Vector3d(x, y, z);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            Vector3d vector3d = (Vector3d) obj;
            return vector3d.x == x && vector3d.y == y && vector3d.z == z;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vector3d{x=" + x + ",y=" + y + ",z=" + z;
    }
}
