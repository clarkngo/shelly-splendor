package com.boardgame.splendor.util;

import com.boardgame.splendor.model.DevelopmentCard;
import lombok.experimental.UtilityClass;


@UtilityClass
public class CardArt {

    String ge = String.valueOf('♦'); // gem symbol
    public String generateCardArt(DevelopmentCard d) {
        String g = TextColor.mapGemColorToTextColor(d.getGemColor()) + ge + TextColor.RESET;
        String wh = TextColor.WHITE + "(" + d.getCostWhite() + ")" + TextColor.RESET;
        String re = TextColor.RED + "(" + d.getCostRed() + ")" + TextColor.RESET;
        String gr = TextColor.GREEN + "(" + d.getCostGreen() + ")" + TextColor.RESET;
        String be = TextColor.BLUE + "(" + d.getCostBlue() + ")" + TextColor.RESET;
        String bk = TextColor.BLACK + "(" + d.getCostBlack() + ")" + TextColor.RESET;
        String cardArt =
                "+--------------+\n" +
                "|           "+g+g+" |\n" +
                "|          "+g+g+g+g+"|\n" +
                "|              |\n" +
                "|"+wh+"           |\n" +
                "|"+re+"           |\n" +
                "|"+gr+"           |\n" +
                "|"+be+"           |\n" +
                "|"+bk+"           |\n" +
                "+--------------+";

        return cardArt;
    }

}
