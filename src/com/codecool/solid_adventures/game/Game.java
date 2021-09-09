package com.codecool.solid_adventures.game;

import com.codecool.solid_adventures.game.gameCharacters.Dragon;
import com.codecool.solid_adventures.game.gameCharacters.Elf;
import com.codecool.solid_adventures.game.gameCharacters.Fox;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Object> characters = new ArrayList<>();

    public void initCharacters(){
        characters.add(new Elf());
        characters.add(new Dragon());
        characters.add(new Fox());
    }

    public void playRound(){
        for(var gameCharacter : characters){
            if(gameCharacter instanceof Elf){
                ((Elf)gameCharacter).run();
            } else if(gameCharacter instanceof Dragon){
                ((Dragon)gameCharacter).fly();
            }
            else if(gameCharacter instanceof Fox){
                ((Fox)gameCharacter).leap();
            }
        }
    }
}
