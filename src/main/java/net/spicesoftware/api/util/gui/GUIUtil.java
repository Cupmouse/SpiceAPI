package net.spicesoftware.api.util.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;

/**
 * @since 2015/07/05
 */
public class GUIUtil {

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
