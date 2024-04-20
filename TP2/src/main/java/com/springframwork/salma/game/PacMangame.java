package com.springframwork.salma.game;

public class PacMangame implements GamingConsole{
    @Override
    public void Up() {
        System.out.println("pacup");
    }

    @Override
    public void Down() {
        System.out.println("pacdown");
    }

    @Override
    public void Left() {
        System.out.println("pacleft");
    }

    @Override
    public void Right() {
        System.out.println("pacright");
    }
}
