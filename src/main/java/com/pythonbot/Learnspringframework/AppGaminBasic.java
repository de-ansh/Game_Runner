package com.pythonbot.Learnspringframework;

public class AppGaminBasic {
    public static void main(String[] args) {
        //var game= new SuperContraGame();
        //var game= new MarioGame();
        var game= new PacmanGame();
        var gameRunner= new GameRunner(game);
        gameRunner.run();
    }
}
