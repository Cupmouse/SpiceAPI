package net.spicesoftware.api.util.gui;

import net.spicesoftware.api.decoration.fill.RGB24Color;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;

/**
 * @since 2015/07/05
 */
public final class GUIUtil {

    private GUIUtil() {
    }

    public static Color toAWTColor(RGB24Color color) {
        return new Color(color.r, color.g, color.b);
    }

    public static void copyToClipboard(String s) {
        StringSelection stringSelection = new StringSelection(s);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, stringSelection);
    }

    public static void playSystemWarningSound() {
        Toolkit.getDefaultToolkit().beep();
        playSystemSound("OptionPane.warningSound");
    }

    public static void playSystemSound(String name) {
        UIManager.put("AuditoryCues.playList", name);
    }
}
