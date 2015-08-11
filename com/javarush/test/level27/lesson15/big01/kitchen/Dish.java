package com.javarush.test.level27.lesson15.big01.kitchen;

import java.util.Arrays;

/**
 * Created by zloymen on 05.07.2015.
 */
public enum Dish
{
    Fish(25), Steak(30), Soup(15), Juice(5), Water(3);
    private int duration;

    Dish(int i)
    {
        this.duration = i;
    }

    public int getDuration()
    {
        return duration;
    }

    public static String allDishesToString(){
        if (values().length == 0) return "";

        return Arrays.toString(values()).substring(1, Arrays.toString(values()).length() - 1);
    }
}
