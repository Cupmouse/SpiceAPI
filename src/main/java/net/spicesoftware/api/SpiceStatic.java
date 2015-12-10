package net.spicesoftware.api;

import net.spicesoftware.api.registry.Registry;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * @since 2015/12/09
 */
public final class SpiceStatic {

    private SpiceStatic() {
    }

    /**
     * 後でリフレクションを利用してインスタンスが代入されます。
     */
    private static Spice spice;

    public static Spice getSpice() {
        nullNot(spice);
        return spice;
    }

    public static Registry getRegistry() {
        return spice.getRegistry();
    }
}
