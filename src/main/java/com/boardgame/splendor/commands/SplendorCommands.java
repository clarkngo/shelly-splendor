package com.boardgame.splendor.commands;

import com.boardgame.splendor.model.DevelopmentCard;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.Random;

@ShellComponent
public class SplendorCommands {

    private static final DevelopmentCard[] ALL_CARDS = DevelopmentCard.values();
    private static final Random RANDOM = new Random();

    @ShellMethod(key = "random", value = "I will draw random card")
    public String getRandomCard() {
        return ALL_CARDS[RANDOM.nextInt(ALL_CARDS.length)].toString();
    }
}
