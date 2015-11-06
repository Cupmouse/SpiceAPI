package net.spicesoftware.api.util.vector;

import java.io.Serializable;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * x, yを{@code float}で保持する２次元ベクタークラスです。
 *
 * @since 2015/01/15
 */
public final class Vector2f implements Serializable {

    public static final Vector2f ZERO = new Vector2f(0, 0);
    public final float x;
    public final float y;

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float area() {
        return x * y;
    }

    public float dot(Vector2f vector2f) {
        nullNot(vector2f);
        return x * vector2f.x + y * vector2f.y;
    }

    public float cross(Vector2f vector2f) {
        nullNot(vector2f);
        return x * vector2f.y - y * vector2f.x;
    }

    public double lengthSquared() {
        return x * x + y * y;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    public Vector2f add(float x, float y) {
        return new Vector2f(this.x + x, this.y + y);
    }

    public Vector2f add(Vector2f vector2f) {
        nullNot(vector2f);
        return new Vector2f(x + vector2f.x, y + vector2f.y);
    }

    public Vector2f subtract(float x, float y) {
        return new Vector2f(this.x - x, this.y - y);
    }

    public Vector2f subtract(Vector2f vector2f) {
        nullNot(vector2f);
        return new Vector2f(x - vector2f.x, y - vector2f.y);
    }

    public Vector2f multiply(float scalar) {
        return new Vector2f(x * scalar, y * scalar);
    }

    public Vector2d toVector2d() {
        return new Vector2d(x, y);
    }

    public Vector2i toVector2i() {
        return new Vector2i((int) x, (int) y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            Vector2f vector2f = (Vector2f) obj;
            return vector2f.x == x && vector2f.y == y;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vector2f{x=" + x + ",y=" + y + "}";
    }
}
