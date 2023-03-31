package com.pythonbot.Learnspringframework;

public class AppGaminBasic {
    public static void main(String[] args) {
        var marioGame= new MarioGame();
        var gameRunner= new GameRunner(marioGame);
        gameRunner.run();
    }
}
