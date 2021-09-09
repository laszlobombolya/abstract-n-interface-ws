package com.codecool.solid_adventures.game;

import com.codecool.solid_adventures.game.gameCharacters.Dragon;
import com.codecool.solid_adventures.game.gameCharacters.Elf;
import com.codecool.solid_adventures.game.gameCharacters.Fox;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // We have a board and characters can move on it
        Game game = new Game();
        game.initCharacters();
        game.playRound();
    }
}
