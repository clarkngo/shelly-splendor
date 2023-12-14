package com.boardgame.splendor.util;

import com.boardgame.splendor.model.GemColor;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TextColor {
    public static final String BLACK = "\033[0;30m";
    public static final String WHITE = "\033[0;37m";
    public static final String BLUE = "\033[0;34m";
    public static final String GREEN = "\033[0;32m";
    public static final String RED = "\033[0;31m";
    public static final String RESET = "\033[0m";


    public static String mapGemColorToTextColor(GemColor gemColor) {
        switch (gemColor) {
            case BLACK:
                return TextColor.BLACK;
            case WHITE:
                return TextColor.WHITE;
            case BLUE:
                return TextColor.BLUE;
            case GREEN:
                return TextColor.GREEN;
            case RED:
                return TextColor.RED;
            default:
                throw new IllegalArgumentException("Unsupported GemColor: " + gemColor);
        }
    }
}
