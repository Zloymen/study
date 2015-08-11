package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Order;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by zloymen on 05.07.2015.
 */
public class Tablet extends Observable
{
    private final int number;
    public static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number)
    {
        this.number = number;
    }


    public void createOrder(){
        try
        {
            Order order = new Order(this);
            ConsoleHelper.writeMessage(order.toString());
            if (order.isEmpty()) return;
            setChanged();
            notifyObservers(order);
        }catch (IOException e){
            logger.log(Level.SEVERE,"Console is unavailable.");
        }
    }

    @Override
    public String toString()
    {
        return "Tablet{" +"number=" + number +'}';
    }
}
