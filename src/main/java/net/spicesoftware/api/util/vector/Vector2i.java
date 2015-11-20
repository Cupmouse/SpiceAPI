package net.spicesoftware.api.util.vector;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * x, yを{@code int}で保持する２次元ベクタークラスです。
 *
 * @since 2015/01/15
 */
public final class Vector2i {

    public static final Vector2i ZERO = new Vector2i(0, 0);
    public final int x;
    public final int y;

    public Vector2i(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int area() {
        return x * y;
    }

    public int dot(Vector2i vector2i) {
        nullNot(vector2i);
        return x * vector2i.x + y * vector2i.y;
    }

    public int cross(Vector2i vector2i) {
        nullNot(vector2i);
        return x * vector2i.y - y * vector2i.x;
    }

    public double lengthSquared() {
        return x * x + y * y;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    public Vector2i add(int x, int y) {
        return new Vector2i(this.x + x, this.y + y);
    }

    public Vector2i add(Vector2i vector2i) {
        nullNot(vector2i);
        return new Vector2i(x + vector2i.x, y + vector2i.y);
    }

    public Vector2i subtract(int x, int y) {
        return new Vector2i(this.x - x, this.y - y);
    }

    public Vector2i subtract(Vector2i vector2i) {
        nullNot(vector2i);
        return new Vector2i(x - vector2i.x, y - vector2i.y);
    }

    public Vector2i multiply(int scalar) {
        return new Vector2i(x * scalar, y * scalar);
    }

    public Vector2d toVector2d() {
        return new Vector2d((double) x, (double) y);
    }

    public Vector2f toVector2f() {
        return new Vector2f((float) x, (float) y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            Vector2i vector2i = (Vector2i) obj;
            return vector2i.x == x && vector2i.y == y;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vector2i{x=" + x + ",y=" + y + "}";
    }
}
