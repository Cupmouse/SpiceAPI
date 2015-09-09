package net.spicesoftware.api.util;

/**
 * ２つのオブジェクトを関連付けて保持するためのクラスです。
 *
 * @since 2014/10/06
 */
public final class Pair<A, B> {

    public final A a;
    public final B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public static <A, B> Pair of(A a, B b) {
        Validate.nullNot(a, b);
        return new Pair(a, b);
    }

    @Override
    public int hashCode() {
        return 31 * a.hashCode() + b.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            Pair pair = (Pair) obj;
            return pair.a.equals(a) && pair.b.equals(b);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pair{a=" + a + ",b=" + b + "}";
    }
}
