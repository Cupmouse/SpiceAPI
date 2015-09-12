package net.spicesoftware.api.util;

/**
 * @since 2015/09/07
 */
public final class Validate {

    private Validate() {
    }

    /*
    パラメータの真偽値
     */

    /**
     * 指定された{@code boolean}が<b>真である</b>かを検証します。
     *
     * @param b 検証する真偽値
     * @throws IllegalArgumentException 指定された真偽値が偽である場合
     */
    public static void truE(boolean b) {
        if (!b) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された2つの{@code boolean}がどちらも<b>真である</b>かを検証します。
     *
     * @param bA 検証する真偽値
     * @param bB 検証する真偽値
     * @throws IllegalArgumentException 指定された真偽値が偽である場合
     */
    public static void truE(boolean bA, boolean bB) {
        if (!bA || !bB) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された複数の{@code boolean}がすべて<b>真である</b>かを検証します。
     *
     * @param booleans 検証する複数の真偽値
     * @throws IllegalArgumentException 指定された複数の真偽値の中に偽のものがある場合
     */
    public static void truE(boolean... booleans) {
        if (booleans == null) {
            throw new IllegalArgumentException();
        }

        for (boolean b : booleans) {
            if (!b) {
                throw new IllegalArgumentException();
            }
        }
    }

    /**
     * 指定された{@code boolean}が<b>偽である</b>かを検証します。
     *
     * @param b 検証する真偽値
     * @throws IllegalArgumentException 指定された真偽値が真である場合
     */
    public static void falsE(boolean b) {
        if (b) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された2つの{@code boolean}がどちらも<b>偽である</b>かを検証します。
     *
     * @param bA 検証する真偽値
     * @param bB 検証する真偽値
     * @throws IllegalArgumentException 指定された2つの真偽値がどちらも真である場合
     */
    public static void falsE(boolean bA, boolean bB) {
        if (bA || bB) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された複数の{@code boolean}がすべて<b>偽である</b>かを検証します。
     *
     * @param booleans 検証する複数の真偽値
     * @throws IllegalArgumentException 指定された複数の真偽値の中に真である物がある場合
     */
    public static void falsE(boolean... booleans) {
        if (booleans == null) {
            throw new IllegalArgumentException();
        }

        for (boolean b : booleans) {
            if (b) {
                throw new IllegalArgumentException();
            }
        }
    }

    /*
    Nullチェック
     */

    /**
     * 指定された{@link Object}が{@code null}<b>でない</b>かを検証します。
     *
     * @param o 検証する{@link Object}
     * @throws NullPointerException 指定された{@link Object}がnullである場合
     */
    public static void nullNot(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
    }

    /**
     * 指定された2つの{@link Object}がどちらも{@code null}<b>でない</b>かを検証します。
     *
     * @param oA 検証する{@link Object}
     * @param oB 検証する{@link Object}
     * @throws NullPointerException 指定された2つの{@link Object}の1つ以上がnullである場合
     */
    public static void nullNot(Object oA, Object oB) {
        if (oA == null || oB == null) {
            throw new NullPointerException();
        }
    }

    /**
     * 指定された複数の{@link Object}がすべて{@code null}<b>でない</b>かを検証します。
     *
     * @param objects 検証する複数の{@link Object}
     * @throws IllegalArgumentException 配列がnullの場合
     * @throws  NullPointerException 指定された複数の{@link Object}の中にnullであるものがある場合
     */
    public static void nullNot(Object... objects) {
        if (objects == null) {
            throw new IllegalArgumentException();
        }

        for (Object o : objects) {
            if (o == null) {
                throw new NullPointerException();
            }
        }
    }

    /**
     * 指定された{@link Object}が{@code null}<b>である</b>かを検証します。
     *
     * @param o 検証する{@link Object}
     * @throws IllegalArgumentException 指定された{@link Object}がnullでない場合
     */
    public static void nulL(Object o) {
        if (o != null) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された2つの{@link Object}がどちらも{@code null}<b>である</b>かを検証します。
     *
     * @param oA 検証する{@link Object}
     * @param oB 検証する{@link Object}
     * @throws IllegalArgumentException 指定された2つの{@link Object}の1つ以上がnullでない場合
     */
    public static void nulL(Object oA, Object oB) {
        if (oA != null || oB != null) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された複数の{@link Object}がすべて{@code null}<b>である</b>かを検証します。
     *
     * @param objects 検証する複数の{@link Object}
     * @throws IllegalArgumentException 指定された複数の{@link Object}の中にnullでないものがある場合。もしくは、配列がnullの場合
     */
    public static void nulL(Object... objects) {
        if (objects == null) {
            throw new IllegalArgumentException();
        }

        for (Object o : objects) {
            if (o != null) {
                throw new IllegalArgumentException();
            }
        }
    }

    /*
    大きさ比較
     */

    /**
     * 指定された2つの値、第一引数が第二引数より<b>大きい</b>か検証します。
     * 値が同じ場合は通りません。
     *
     * @param value 検証する値
     * @param compareTo 比べる値
     * @throws IllegalArgumentException 指定された第一引数が第二引数以下の場合
     */
    public static void larger(int value, int compareTo) {
        if (value <= compareTo) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された2つの値、第一引数が第二引数より<b>以上</b>か検証します。
     *
     * @param value 検証する値
     * @param compareTo 比べる値
     * @throws IllegalArgumentException 指定された第一引数が第二引数未満の場合
     */
    public static void largerEqual(int value, int compareTo) {
        if (value < compareTo) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された2つの値、第一引数が第二引数より<b>小さい</b>か検証します。
     * 値が同じ場合は通りません。
     *
     * @param value 検証する値
     * @param compareTo 比べる値
     * @throws IllegalArgumentException 指定された第一引数が第二引数以上の場合
     */
    public static void smaller(int value, int compareTo) {
        if (value >= compareTo) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された2つの値、第一引数が第二引数より<b>以下</b>か検証します。
     *
     * @param value 検証する値
     * @param compareTo 比べる値
     * @throws IllegalArgumentException 指定された第一引数が第二引数を超過する場合
     */
    public static void smallerEqual(int value, int compareTo) {
        if (value > compareTo) {
            throw new IllegalArgumentException();
        }
    }

    /*
    範囲内の検査
     */

    /**
     * 指定された範囲内に指定された値が<b>含まれない</b>か検証します。
     * （v < s || e < v）
     *
     * @param rangeStart 範囲の開始
     * @param rangeEnd 範囲の終了
     * @param value 検証する値
     * @throws IllegalArgumentException 指定された範囲内に指定された値が含まれない場合（s <= v <= e）
     */
    public static void rangeNotIn(int value, int rangeStart, int rangeEnd) {
        if (rangeStart <= value && value <= rangeEnd) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された範囲内に指定された値が<b>含まれる</b>か検証します。
     * （s <= v <= e）
     *
     * @param rangeStart 範囲の開始
     * @param rangeEnd 範囲の終了
     * @param value 検証する値
     * @throws IllegalArgumentException 指定された範囲内に指定された値が含まれない場合（v < s || e < v）
     */
    public static void rangeIn(int value, int rangeStart, int rangeEnd) {
        if (value < rangeStart || rangeEnd < value) {
            throw new IllegalArgumentException();
        }
    }

    /*
    値が正の値か０の場合に例外
     */

    /**
     * 指定された値が0未満であるか検証します。
     *
     * @param value 検証する値
     * @throws IllegalArgumentException 指定された値が、0以上の場合
     */
    public static void negative(int value) {
        if (value >= 0) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された2つの値が、どちらも0未満であるか検証します。
     * {@link #negative(int)}を各値で実行することと等価です。
     *
     * @param valueA 検証する値
     * @param valueB 検証する値
     * @throws IllegalArgumentException 指定された2つの値の1つ以上が、0以上の場合
     */
    public static void negative(int valueA, int valueB) {
        if (valueA >= 0 || valueB >= 0) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された複数の値が、すべて0未満であるか検証します。
     *
     * @param value 検証する複数の値
     * @throws IllegalArgumentException 指定された複数の値の中に、0以上のものがある場合。もしくは、配列がnullの場合
     */
    public static void negative(int... value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }

        for (int i : value) {
            if (i >= 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    /*
    値が負の値の時に例外
     */

    /**
     * 指定された値が<b>0以下である</b>か検証します。
     *
     * @param value 検証する値
     * @throws IllegalArgumentException 指定された値が、0を超過する場合
     */
    public static void zeroOrNegative(int value) {
        if (value > 0) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された2つの値が、どちらも<b>0以下である</b>か検証します。
     * {@link #zeroOrNegative(int)}を各値で実行することと等価です。
     *
     * @param valueA 検証する値
     * @param valueB 検証する値
     * @throws IllegalArgumentException 指定された2つの値の1つ以上が、0を超過する場合
     */
    public static void zeroOrNegative(int valueA, int valueB) {
        if (valueA > 0 || valueB > 0) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された複数の値が、すべて<b>0以下である</b>か検証します。
     *
     * @param value 検証する複数の値
     * @throws IllegalArgumentException 指定された複数の値の中に、0を超過するものがある場合。もしくは、配列がnullの場合
     */
    public static void zeroOrNegative(int... value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }

        for (int i : value) {
            if (i > 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    /*
    値が負の値か０の時に例外
     */

    /**
     * 指定された値が<b>0を超過する</b>か検証します。
     *
     * @param value 検証する値
     * @throws IllegalArgumentException 指定された値が、0以下の場合
     */
    public static void positive(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された2つの値が、どちらも<b>0を超過する</b>か検証します。
     * {@link #positive(int)}を各値で実行することと等価です。
     *
     * @param valueA 検証する値
     * @param valueB 検証する値
     * @throws IllegalArgumentException 指定された2つの値の1つ以上が、0以下の場合
     */
    public static void positive(int valueA, int valueB) {
        if (valueA <= 0 || valueB <= 0) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された複数の値が、すべて<b>0を超過する</b>か検証します。
     *
     * @param value 検証する複数の値
     * @throws IllegalArgumentException 指定された複数の値の中に、0以下のものがある場合。もしくは、配列がnullの場合
     */
    public static void positive(int... value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }

        for (int i : value) {
            if (i <= 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    /*
    値が負の値の時に例外
     */

    /**
     * 指定された値が<b>0以上である</b>か検証します。
     *
     * @param value 検証する値
     * @throws IllegalArgumentException 指定された値が、0未満の場合
     */
    public static void zeroOrPositive(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された2つの値が、どちらも<b>0以上である</b>か検証します。
     * {@link #zeroOrPositive(int)}を各値で実行することと等価です。
     *
     * @param valueA 検証する値
     * @param valueB 検証する値
     * @throws IllegalArgumentException 指定された2つの値の1つ以上が、0未満の場合
     */
    public static void zeroOrPositive(int valueA, int valueB) {
        if (valueA < 0 || valueB < 0) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 指定された複数の値が、すべて<b>0以上である</b>か検証します。
     *
     * @param value 検証する複数の値
     * @throws IllegalArgumentException 指定された複数の値の中に、0未満のものがある場合。もしくは、配列がnullの場合
     */
    public static void zeroOrPositive(int... value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }

        for (int i : value) {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    /*
    ある位置
     */

    /**
     * ある位置が、ある平面内の位置にあるか検証します。
     *
     * @param width 平面の幅
     * @param height 平面の高さ
     * @param x x位置
     * @param y y位置
     * @throws IllegalArgumentException 指定された位置が、指定された平面内にない場合
     */
    public static void position(int width, int height, int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            throw new IllegalArgumentException();
        }
    }
}
