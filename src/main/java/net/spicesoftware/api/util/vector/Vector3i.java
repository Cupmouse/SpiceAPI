package net.spicesoftware.api.util.vector;

import net.spicesoftware.api.util.DeepCopyable;

import java.io.Serializable;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * x, y, zを{@code int}で保持する３次元ベクタークラスです。
 *
 * @since 2015/01/15
 */
public final class Vector3i implements DeepCopyable, Serializable {

    public static final Vector3i ZERO = new Vector3i(0, 0, 0);
    public final int x;
    public final int y;
    public final int z;

    public Vector3i(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int volume() {
        return x * y * z;
    }

    public double dot(Vector3i vector3i) {
        nullNot(vector3i);
        return x * vector3i.x + y * vector3i.y + z * vector3i.z;
    }

    public Vector3i cross(Vector3i vector3i) {
        nullNot(vector3i);
        return new Vector3i(
                y * vector3i.z - z * vector3i.y,
                z * vector3i.x - x * vector3i.z,
                x * vector3i.y - y * vector3i.x
        );
    }

    public double lengthSquared() {
        return x * x + y * y + z * z;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    public Vector3i add(int x, int y, int z) {
        return new Vector3i(this.x + x, this.y + y, this.z + z);
    }

    public Vector3i add(Vector3i vector3i) {
        nullNot(vector3i);
        return new Vector3i(x + vector3i.x, y + vector3i.y, z + vector3i.z);
    }

    public Vector3i subtract(int x, int y, int z) {
        return new Vector3i(this.x - x, this.y - y, this.z - z);
    }

    public Vector3i subtract(Vector3i vector3i) {
        nullNot(vector3i);
        return new Vector3i(x - vector3i.x, y - vector3i.y, z - vector3i.z);
    }

    public Vector3i multiply(int scalar) {
        return new Vector3i(x * scalar, y * scalar, z * scalar);
    }

    public Vector3d toVector3d() {
        return new Vector3d(x, y, z);
    }

    public Vector3f toVector3f() {
        return new Vector3f(x, y, z);
    }

    public Vector2d toVector2d() {
        return new Vector2d(x, y);
    }

    public Vector2f toVector2f() {
        return new Vector2f(x, y);
    }

    public Vector2i toVector2i() {
        return new Vector2i(x, y);
    }

    @Override
    public Vector3i copyDeeply() {
        return new Vector3i(x, y, z);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            Vector3i vector3i = (Vector3i) obj;
            return vector3i.x == x && vector3i.y == y && vector3i.z == z;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vector3i{x=" + x + ",y=" + y + ",z=" + z;
    }
}
