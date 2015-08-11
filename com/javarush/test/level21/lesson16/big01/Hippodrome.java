package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by zloymen on 05.05.2015.
 */
public class Hippodrome
{
    private ArrayList<Horse> horses=new ArrayList<Horse>();
    public static Hippodrome game;


    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public static  void main (String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        Horse h1 = new Horse("h1", 3, 0);
        Horse h2 = new Horse("h2", 3, 0);
        Horse h3 = new Horse("h3", 3, 0);
        game.getHorses().add(h1);
        game.getHorses().add(h2);
        game.getHorses().add(h3);

        game.run();
    }
    public  void  run() throws InterruptedException
    {
        for (int i = 0; i < 100; i++)
        {
            move();
            print();
            Thread.sleep(500);
        }
        printWinner();
    }
    public  void  move() {
        for(Horse horse:getHorses())  horse.move();
    }
    public  void print()
    {
        for(Horse horse:getHorses())  horse.print();
        System.out.println();
        System.out.println();
    }
    public Horse getWinner()
    {
        Horse winner=getHorses().get(0);
        for (Horse horse: getHorses())
        {
            if(winner.getDistance()<horse.getDistance()) winner=horse;
        }
        return winner;
    }
    public void printWinner()
    {
        System.out.println("Winner is "+getWinner().getName()+"!");
    }
}
