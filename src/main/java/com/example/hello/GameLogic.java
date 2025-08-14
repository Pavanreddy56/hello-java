package com.example.hello;

public class GameLogic {

    public String startAdventure() {
        return "You are standing in front of a castle. Do you enter or walk away?";
    }

    public String makeMove(String choice) {
        if (choice.equalsIgnoreCase("enter")) {
            return "You enter the castle and find a treasure chest!";
        } else if (choice.equalsIgnoreCase("walk away")) {
            return "You walk away safely, but miss out on the treasure.";
        } else {
            return "Invalid choice. Please try again.";
        }
    }
}
