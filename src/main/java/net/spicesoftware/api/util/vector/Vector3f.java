package net.spicesoftware.api.util.vector;

import net.spicesoftware.api.DeepCopyable;

import java.io.Serializable;

/**
 * @since 2014/12/21
 */
public final class Vector3f implements DeepCopyable, Serializable {

    public static final Vector3f ZERO = new Vector3f(0, 0, 0);
    public final float x;
    public final float y;
    public final float z;

    public Vector3f(float x, float y, float z) {
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

    public Vector3f add(float x, float y, float z) {
        return new Vector3f(this.x + x, this.y + y, this.z + z);
    }

    public Vector3f add(Vector3f vector3f) {
        return new Vector3f(x + vector3f.x, y + vector3f.y, z + vector3f.z);
    }

    public Vector3f subtract(float x, float y, float z) {
        return new Vector3f(this.x - x, this.y - y, this.z - z);
    }

    public Vector3f subtract(Vector3f vector3f) {
        return new Vector3f(x - vector3f.x, y - vector3f.y, z - vector3f.z);
    }

    public Vector3f multiply(float scalar) {
        return new Vector3f(x * scalar, y * scalar, z * scalar);
    }

    public Vector3d toVector3d() {
        return new Vector3d(x, y, z);
    }

    public Vector3i toVector3i() {
        return new Vector3i((int) x, (int) y, (int) z);
    }

    public Vector2d toVector2d() {
        return new Vector2d(x, y);
    }

    public Vector2f toVector2f() {
        return new Vector2f(x, y);
    }

    public Vector2i toVector2i() {
        return new Vector2i((int) x, (int) y);
    }

    @Override
    public Vector3f copyDeeply() {
        return new Vector3f(x, y, z);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            Vector3f vector3f = (Vector3f) obj;
            return vector3f.x == x && vector3f.y == y && vector3f.z == z;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vector3f{x=" + x + ",y=" + y + ",z=" + z;
    }
}
