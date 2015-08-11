package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
*/
public class Solution {
    public static void main(String[] args) throws TooShortStringException
    {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Дядя Вася - лучший алкоголик в мире"));
        System.out.println(getPartOfString("Микулинское пиво необходимо для жизни !"));
        System.out.println(getPartOfString("Дурацкая задачка не работает"));
    }
    public static String getPartOfString(String string) throws TooShortStringException
    {
        try
        {
            int first = string.indexOf(" ");
            int last = first;
            for (int i = 0; i < 4; i++)
            {
                last = string.indexOf(" ", last + 1);
            }

            return string.substring(first + 1, last);

        }catch (Exception e)
        {
            throw new TooShortStringException();
        }

    }

    public static class TooShortStringException extends  Exception {
    }
}
