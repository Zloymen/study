package com.javarush.test.level22.lesson07.task03;

import java.util.Date;

/* Форматирование даты
Исправить метод getFormattedString так, чтобы он возвращал строку с параметрами для форматирования.
Должен быть вывод аналогичный следующему:
31:10:13 15:59:59
*/
public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format(getFormattedString(), date, date, date, date, date, date));
        //должен быть вывод аналогичный следующему
        //31:10:13 15:59:59 - dd:MM:yy hh:mm:ss
    }

    public static String getFormattedString() {
        return "%1$te:%1$tm:%1$ty - %1$tT%n%2$te:%2$tm:%2$ty - %2$tT%n%3$te:%3$tm:%3$ty - %3$tT%n%4$te:%4$tm:%4$ty - %4$tT%n%5$te:%5$tm:%5$ty - %5$tT%n%6$te:%6$tm:%6$ty - %6$tT%n";
    }
}
