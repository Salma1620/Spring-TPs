package com.springframwork.salma.game;

public class GameRunner {
    GamingConsole gamingConsole;
    public GameRunner(GamingConsole gamingConsole) {
        this.gamingConsole=gamingConsole;
    }

    public void run() {
        System.out.println("running game: "+gamingConsole);
        gamingConsole.Up();
        gamingConsole.Down();
        gamingConsole.Left();
        gamingConsole.Right();
    }
}
