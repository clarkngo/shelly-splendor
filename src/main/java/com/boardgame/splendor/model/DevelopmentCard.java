package com.boardgame.splendor.model;

import com.boardgame.splendor.util.CardArt;
import com.boardgame.splendor.util.TextColor;
import org.w3c.dom.Text;

public enum DevelopmentCard {
    // Level 1
    CARD1(1, GemColor.BLACK, 0, 1, 1, 1, 1, 0),
    CARD2(1, GemColor.BLACK, 0, 1, 2, 1, 1, 0),
    CARD3(1, GemColor.BLACK, 0, 2, 2, 0, 1, 0),
    CARD4(1, GemColor.BLACK, 0, 0, 0, 1, 3, 1),
    CARD5(1, GemColor.BLACK, 0, 0, 0, 2, 1, 0),
    CARD6(1, GemColor.BLACK, 0, 2, 0, 2, 0, 0),
    CARD7(1, GemColor.BLACK, 0, 0, 0, 3, 0, 0),
    CARD8(1, GemColor.BLACK, 1, 0, 4, 0, 0, 0),
    CARD9(1, GemColor.BLUE, 0, 1, 0, 1, 1, 1),
    CARD10(1, GemColor.BLUE, 0, 1, 0, 1, 2, 1),
    // Add more cards...
    // Level 3
    CARD71(3, GemColor.RED, 3, 3, 5, 3, 0, 3),
    CARD72(3, GemColor.RED, 4, 0, 0, 7, 0, 0),
    CARD73(3, GemColor.RED, 4, 0, 0, 3, 6, 3),
    CARD74(3, GemColor.RED, 5, 0, 0, 7, 3, 0),
    CARD75(3, GemColor.BLUE, 3, 3, 0, 3, 3, 5),
    CARD76(3, GemColor.BLUE, 4, 7, 0, 0, 0, 0),
    CARD77(3, GemColor.BLUE, 4, 6, 3, 0, 0, 3),
    CARD78(3, GemColor.BLUE, 5, 7, 3, 0, 0, 0),
    CARD79(3, GemColor.WHITE, 3, 0, 3, 3, 5, 3),
    CARD80(3, GemColor.WHITE, 4, 0, 0, 0, 0, 7),
    CARD81(3, GemColor.WHITE, 4, 3, 0, 0, 3, 6),
    CARD82(3, GemColor.WHITE, 5, 3, 0, 0, 0, 7),
    CARD83(3, GemColor.GREEN, 3, 5, 3, 0, 3, 3),
    CARD84(3, GemColor.GREEN, 4, 0, 7, 0, 0, 0),
    CARD85(3, GemColor.GREEN, 4, 3, 6, 3, 0, 0),
    CARD86(3, GemColor.GREEN, 5, 0, 7, 3, 0, 0),
    CARD87(3, GemColor.RED, 3, 3, 5, 3, 0, 3),
    CARD88(3, GemColor.RED, 4, 0, 0, 7, 0, 0),
    CARD89(3, GemColor.RED, 4, 0, 3, 6, 3, 0),
    CARD90(3, GemColor.RED, 5, 0, 0, 7, 3, 0);

    private final int level;
    private final GemColor gemColor;
    private final int points;
    private final int costWhite;
    private final int costBlue;
    private final int costGreen;
    private final int costRed;
    private final int costBlack;

    DevelopmentCard(int level, GemColor gemColor, int points, int costWhite, int costBlue, int costGreen, int costRed, int costBlack) {
        this.level = level;
        this.gemColor = gemColor;
        this.points = points;
        this.costWhite = costWhite;
        this.costBlue = costBlue;
        this.costGreen = costGreen;
        this.costRed = costRed;
        this.costBlack = costBlack;
    }

    // Add getters if needed

    public int getLevel() {
        return level;
    }

    public GemColor getGemColor() {
        return gemColor;
    }

    public int getPoints() {
        return points;
    }

    public int getCostWhite() {
        return costWhite;
    }

    public int getCostBlue() {
        return costBlue;
    }

    public int getCostGreen() {
        return costGreen;
    }

    public int getCostRed() {
        return costRed;
    }

    public int getCostBlack() {
        return costBlack;
    }

    @Override
    public String toString() {
        return String.format("Level: %d, Gem Color: %s, Points: %d, Cost (W/Blk/G/R/Blue): %s/%s/%s/%s/%s\n%s",
                this.getLevel(),
                this.getGemColor(),
                this.getPoints(),
                TextColor.WHITE + this.getCostWhite() + TextColor.RESET,
                TextColor.BLACK + this.getCostBlack() + TextColor.RESET,
                TextColor.GREEN + this.getCostGreen() + TextColor.RESET,
                TextColor.RED + this.getCostRed() + TextColor.RESET,
                TextColor.BLUE + this.getCostBlue() + TextColor.RESET,
                CardArt.generateCardArt(this));
    }
}

