package com.javarush.test.level14.lesson08.bonus01;

import java.io.IOException;
import java.util.*;
import java.util.jar.JarException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        exceptions.add(new IOException());
        exceptions.add(new RuntimeException());
        exceptions.add(new ConcurrentModificationException());
        exceptions.add(new EmptyStackException());
        exceptions.add(new Exception());
        exceptions.add(new DuplicateFormatFlagsException(""));
        exceptions.add(new IllegalFormatFlagsException(""));
        exceptions.add(new MissingFormatArgumentException(""));
        exceptions.add(new JarException());
        //Add your code here

    }
}
