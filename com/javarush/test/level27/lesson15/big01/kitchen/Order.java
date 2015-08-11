package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;
import com.javarush.test.level27.lesson15.big01.Tablet;

import java.io.IOException;
import java.util.List;

/**
 * Created by zloymen on 05.07.2015.
 */
public class Order
{
    private List<Dish> dishes;
    public Tablet tablet;

    public Order(Tablet tablet) throws IOException
    {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();

    }
    public int getTotalCookingTime()
    {
        int allTimeOrder = 0;
        for (int i = 0; i < dishes.size() ; i++)
        {
           allTimeOrder+=dishes.get(i).getDuration();
        }
        return  allTimeOrder;
    }
    public boolean isEmpty()
    {
        return dishes.isEmpty();
    }

    @Override
    public String toString() {
        if (dishes.isEmpty()) {
            return "";
        } else {
            return "Your order: " + dishes  + " of " + tablet;
        }
    }
}
