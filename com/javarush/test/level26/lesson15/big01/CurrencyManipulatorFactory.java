package com.javarush.test.level26.lesson15.big01;

import java.util.Map;
import java.util.TreeMap;


/**
 * Created by zloymen on 05.07.2015.
 */
public class CurrencyManipulatorFactory
{
    static CurrencyManipulatorFactory ourInstance = new CurrencyManipulatorFactory();
    static private Map<String,CurrencyManipulator> store = new TreeMap<>();
    static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode){
        if (!store.containsKey(currencyCode))
        {
            CurrencyManipulator new_manup = new CurrencyManipulator(currencyCode);
            store.put(currencyCode, new_manup);
        }
        return store.get(currencyCode);
    }
    private CurrencyManipulatorFactory(){}
}
