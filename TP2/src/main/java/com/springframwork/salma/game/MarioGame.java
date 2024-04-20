package com.springframwork.salma.game;

public class MarioGame implements GamingConsole {
    public  void Up(){
        System.out.println("Jump");
    }
    public  void Down(){
        System.out.println("go into a hole");
    }
    public  void Left(){
        System.out.println("go back");
    }
    public  void Right(){
        System.out.println("accelerate");
    }
}
