package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zloymen on 21.07.2015.
 */
public class Cook extends Observable implements Observer
{
    private String name;

    public Cook(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return  name;
    }

    @Override
    public void update(Observable o, Object arg)
    {
        ConsoleHelper.writeMessage("Start cooking - " + (Order) arg + ", cooking time " +((Order) arg).getTotalCookingTime() + "min");
        setChanged();
        notifyObservers(arg);
    }
}
