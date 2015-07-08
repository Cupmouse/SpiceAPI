package net.spicesoftware.api.text;

import net.spicesoftware.api.decoration.TextStyle;
import net.spicesoftware.api.util.DeepCopyable;

import javax.validation.constraints.Min;
import java.util.List;

/**
 * @since 2015/03/18
 */
public interface Text extends DeepCopyable {

    /**
     * この{@code Text}のすべての{@link TextElement}を返します。
     * このメソッドで返された{@link List}を編集すると編集内容が{@code Text}に反映されます。
     *
     * @return このテキストのすべてのテキストエレメント
     */
    List<TextElement> getAllTextElements();

    /**
     * この{@code Text}のすべての{@link TextElement}の数を返します。
     *
     * @return このテキストのすべてのテキストエレメントの数
     */
    @Min(0)
    int getNumberOfTextElements();

    /**
     * この{@code Text}の指定インデックス内の{@link TextElement}を返します。
     *
     * @param fromIndex 指定開始インデックス
     * @param toIndex   指定終了インデックス
     * @return
     * @throws IllegalArgumentException  指定されたインデックスが不正な場合
     * @throws IndexOutOfBoundsException 指定されたインデックスがこの{@code Text}の管理するインデックス番号を超えている場合
     */
    List<TextElement> getTextElements(int fromIndex, int toIndex) throws IllegalArgumentException, IndexOutOfBoundsException;

    /**
     * この{@code Text}の指定インデックスにある{@link TextElement}を返します。
     *
     * @param index 指定インデックス
     * @return このテキストの指定インデックスにあるテキストエレメント
     */
    TextElement getTextElement(int index);

    /*
    デフォルト設定
     */

    /**
     * この{@link Text}のデフォルトの{@link TextStyle}を返します。
     *
     * @return このテキストのデフォルトのテキストスタイル
     */
    TextStyle getDefaultTextStyle();

    /**
     * この{@link Text}のデフォルトの{@link TextStyle}をパラメータのものと置き換え、設定します。
     *
     * @param defaultTextStyle この{@code Text}のデフォルトに設定する{@link TextStyle}
     */
    void setDefaultTextStyle(TextStyle defaultTextStyle);

    /*
    append
     */

    /**
     * 現在の{@code Text}の指定インデックスにパラメータを{@link Object#toString()}した内容を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param object テキストビルダーの指定インデックスに追加する{@link Object}
     * @return このテキストビルダーのインスタンス
     * @see #append(TextStyle, Object) {@link TextStyle}を指定するメソッド
     */
    Text append(Object object);

    /**
     * 現在の{@code Text}の指定インデックスにパラメータを{@link Object#toString()}した内容を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param object    テキストビルダーの指定インデックスに追加する{@link Object}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     */
    Text append(TextStyle textStyle, Object object);

    /**
     * 現在の{@code Text}の指定インデックスに{@link Text}を追加します。
     *
     * @param text テキストビルダーの指定インデックスに追加する{@link Text}
     * @return このテキストビルダーのインスタンス
     */
    Text append(Text text);

    /**
     * 現在の{@code Text}の指定インデックスに{@link String}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param string テキストビルダーの指定インデックスに追加する{@link String}
     * @return このテキストビルダーのインスタンス
     * @see #append(TextStyle, String) {@link TextStyle}を指定するメソッド
     */
    Text append(String string);

    /**
     * 現在の{@code Text}の指定インデックスに{@link String}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param string    テキストビルダーの指定インデックスに追加する{@link String}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     */
    Text append(TextStyle textStyle, String string);

    /**
     * 現在の{@code Text}の指定インデックスに{@code boolean}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param b テキストビルダーの指定インデックスに追加する{@code boolean}
     * @return このテキストビルダーのインスタンス
     * @see #append(TextStyle, boolean) {@link TextStyle}を指定するメソッド
     */
    Text append(boolean b);

    /**
     * 現在の{@code Text}の指定インデックスに{@code boolean}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param b         テキストビルダーの指定インデックスに追加する{@code boolean}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     */
    Text append(TextStyle textStyle, boolean b);

    /**
     * 現在の{@code Text}の指定インデックスに{@code boolean}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param b テキストビルダーの指定インデックスに追加する{@code boolean}
     * @return このテキストビルダーのインスタンス
     * @see #append(TextStyle, byte) {@link TextStyle}を指定するメソッド
     */
    Text append(byte b);

    /**
     * 現在の{@code Text}の指定インデックスに{@code byte}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param b         テキストビルダーの指定インデックスに追加する{@code byte}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     */
    Text append(TextStyle textStyle, byte b);

    /**
     * 現在の{@code Text}の指定インデックスに{@code char}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param c テキストビルダーの指定インデックスに追加する{@code char}
     * @return このテキストビルダーのインスタンス
     * @see #append(TextStyle, char) {@link TextStyle}を指定するメソッド
     */
    Text append(char c);

    /**
     * 現在の{@code Text}の指定インデックスに{@code char}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param c         テキストビルダーの指定インデックスに追加する{@code char}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     */
    Text append(TextStyle textStyle, char c);

    /**
     * 現在の{@code Text}の指定インデックスに{@code short}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param s テキストビルダーの指定インデックスに追加する{@code short}
     * @return このテキストビルダーのインスタンス
     * @see #append(TextStyle, short) {@link TextStyle}を指定するメソッド
     */
    Text append(short s);

    /**
     * 現在の{@code Text}の指定インデックスに{@code short}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param s         テキストビルダーの指定インデックスに追加する{@code short}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     */
    Text append(TextStyle textStyle, short s);

    /**
     * 現在の{@code Text}の指定インデックスに{@code int}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param i テキストビルダーの指定インデックスに追加する{@code int}
     * @return このテキストビルダーのインスタンス
     * @see #append(TextStyle, int) {@link TextStyle}を指定するメソッド
     */
    Text append(int i);

    /**
     * 現在の{@code Text}の指定インデックスに{@code int}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param i         テキストビルダーの指定インデックスに追加する{@code int}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     */
    Text append(TextStyle textStyle, int i);

    /**
     * 現在の{@code Text}の指定インデックスに{@code long}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param l テキストビルダーの指定インデックスに追加する{@code long}
     * @return このテキストビルダーのインスタンス
     * @see #append(TextStyle, long) {@link TextStyle}を指定するメソッド
     */
    Text append(long l);

    /**
     * 現在の{@code Text}の指定インデックスに{@code long}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param l         テキストビルダーの指定インデックスに追加する{@code long}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     */
    Text append(TextStyle textStyle, long l);

    /**
     * 現在の{@code Text}の指定インデックスに{@code float}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param f テキストビルダーの指定インデックスに追加する{@code float}
     * @return このテキストビルダーのインスタンス
     * @see #append(TextStyle, float) {@link TextStyle}を指定するメソッド
     */
    Text append(float f);

    /**
     * 現在の{@code Text}の指定インデックスに{@code float}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param f         テキストビルダーの指定インデックスに追加する{@code float}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     */
    Text append(TextStyle textStyle, float f);

    /**
     * 現在の{@code Text}の指定インデックスに{@code double}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param d テキストビルダーの指定インデックスに追加する{@code double}
     * @return このテキストビルダーのインスタンス
     * @see #append(TextStyle, double) {@link TextStyle}を指定するメソッド
     */
    Text append(double d);

    /**
     * 現在の{@code Text}の指定インデックスに{@code double}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param d         テキストビルダーの指定インデックスに追加する{@code double}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     */
    Text append(TextStyle textStyle, double d);

    /*
    insert
     */

    /**
     * 現在の{@code Text}の指定インデックスにパラメータを{@link Object#toString()}した内容を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param index  挿入するインデックス
     * @param object テキストビルダーの指定インデックスに追加する{@link Object}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     * @see #insert(int, TextStyle, Object) {@link TextStyle}を指定するメソッド
     */
    Text insert(int index, Object object);

    /**
     * 現在の{@code Text}の指定インデックスにパラメータを{@link Object#toString()}した内容を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param index     挿入するインデックス
     * @param object    テキストビルダーの指定インデックスに追加する{@link Object}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     */
    Text insert(int index, TextStyle textStyle, Object object);

    /**
     * 現在の{@code Text}の指定インデックスに{@link Text}を追加します。
     *
     * @param index 挿入するインデックス
     * @param text  テキストビルダーの指定インデックスに追加する{@link Text}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     */
    Text insert(int index, Text text);

    /**
     * 現在の{@code Text}の指定インデックスに{@link String}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param index  挿入するインデックス
     * @param string テキストビルダーの指定インデックスに追加する{@link String}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     * @see #insert(int, TextStyle, String) {@link TextStyle}を指定するメソッド
     */
    Text insert(int index, String string);

    /**
     * 現在の{@code Text}の指定インデックスに{@link String}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param index     挿入するインデックス
     * @param string    テキストビルダーの指定インデックスに追加する{@link String}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     */
    Text insert(int index, TextStyle textStyle, String string);

    /**
     * 現在の{@code Text}の指定インデックスに{@code boolean}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param index 挿入するインデックス
     * @param b     テキストビルダーの指定インデックスに追加する{@code boolean}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     * @see #insert(int, TextStyle, boolean) {@link TextStyle}を指定するメソッド
     */
    Text insert(int index, boolean b);

    /**
     * 現在の{@code Text}の指定インデックスに{@code boolean}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param index     挿入するインデックス
     * @param b         テキストビルダーの指定インデックスに追加する{@code boolean}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     */
    Text insert(int index, TextStyle textStyle, boolean b);

    /**
     * 現在の{@code Text}の指定インデックスに{@code boolean}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param index 挿入するインデックス
     * @param b     テキストビルダーの指定インデックスに追加する{@code boolean}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     * @see #insert(int, TextStyle, byte) {@link TextStyle}を指定するメソッド
     */
    Text insert(int index, byte b);

    /**
     * 現在の{@code Text}の指定インデックスに{@code byte}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param index     挿入するインデックス
     * @param b         テキストビルダーの指定インデックスに追加する{@code byte}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     */
    Text insert(int index, TextStyle textStyle, byte b);

    /**
     * 現在の{@code Text}の指定インデックスに{@code char}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param index 挿入するインデックス
     * @param c     テキストビルダーの指定インデックスに追加する{@code char}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     * @see #insert(int, TextStyle, char) {@link TextStyle}を指定するメソッド
     */
    Text insert(int index, char c);

    /**
     * 現在の{@code Text}の指定インデックスに{@code char}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param index     挿入するインデックス
     * @param c         テキストビルダーの指定インデックスに追加する{@code char}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     */
    Text insert(int index, TextStyle textStyle, char c);

    /**
     * 現在の{@code Text}の指定インデックスに{@code short}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param index 挿入するインデックス
     * @param s     テキストビルダーの指定インデックスに追加する{@code short}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     * @see #insert(int, TextStyle, short) {@link TextStyle}を指定するメソッド
     */
    Text insert(int index, short s);

    /**
     * 現在の{@code Text}の指定インデックスに{@code short}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param index     挿入するインデックス
     * @param s         テキストビルダーの指定インデックスに追加する{@code short}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     */
    Text insert(int index, TextStyle textStyle, short s);

    /**
     * 現在の{@code Text}の指定インデックスに{@code int}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param index 挿入するインデックス
     * @param i     テキストビルダーの指定インデックスに追加する{@code int}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     * @see #insert(int, TextStyle, int) {@link TextStyle}を指定するメソッド
     */
    Text insert(int index, int i);

    /**
     * 現在の{@code Text}の指定インデックスに{@code int}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param index     挿入するインデックス
     * @param i         テキストビルダーの指定インデックスに追加する{@code int}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     */
    Text insert(int index, TextStyle textStyle, int i);

    /**
     * 現在の{@code Text}の指定インデックスに{@code long}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param index 挿入するインデックス
     * @param l     テキストビルダーの指定インデックスに追加する{@code long}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     * @see #insert(int, TextStyle, long) {@link TextStyle}を指定するメソッド
     */
    Text insert(int index, long l);

    /**
     * 現在の{@code Text}の指定インデックスに{@code long}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param index     挿入するインデックス
     * @param l         テキストビルダーの指定インデックスに追加する{@code long}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     */
    Text insert(int index, TextStyle textStyle, long l);

    /**
     * 現在の{@code Text}の指定インデックスに{@code float}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param index 挿入するインデックス
     * @param f     テキストビルダーの指定インデックスに追加する{@code float}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     * @see #insert(int, TextStyle, float) {@link TextStyle}を指定するメソッド
     */
    Text insert(int index, float f);

    /**
     * 現在の{@code Text}の指定インデックスに{@code float}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param index     挿入するインデックス
     * @param f         テキストビルダーの指定インデックスに追加する{@code float}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     */
    Text insert(int index, TextStyle textStyle, float f);

    /**
     * 現在の{@code Text}の指定インデックスに{@code double}を追加します。
     * 何も{@link net.spicesoftware.api.decoration.TextStyle}がつきません（デフォルト設定が適用されます）。
     *
     * @param index 挿入するインデックス
     * @param d     テキストビルダーの指定インデックスに追加する{@code double}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     * @see #insert(int, TextStyle, double) {@link TextStyle}を指定するメソッド
     */
    Text insert(int index, double d);

    /**
     * 現在の{@code Text}の指定インデックスに{@code double}を追加します。
     * パラメータに指定された{@link TextStyle}が適用されます。
     *
     * @param index     挿入するインデックス
     * @param d         テキストビルダーの指定インデックスに追加する{@code double}
     * @param textStyle 適用する{@link TextStyle}
     * @return このテキストビルダーのインスタンス
     * @throws IndexOutOfBoundsException 指定インデックスがこの{@code Text}の管理するインデックス番号を超える場合
     */
    Text insert(int index, TextStyle textStyle, double d);

    /*
    copyDeeply
     */

    @Override
    Text copyDeeply();
}
