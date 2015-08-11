package com.javarush.test.level26.lesson15.big01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by zloymen on 05.07.2015.
 */
public class ConsoleHelper
{
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void writeMessage(String message){System.out.println(message);}
    public static String readString(){
        try
        {
            String str = reader.readLine();
            return str;
        }catch (Exception e){return null;}
    }
}
