package com.javarush.test.level30.lesson02.home01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* Конвертер систем счислений
Реализуйте логику метода convertNumberToOtherNumerationSystem, который должен переводить число number.getDigit()
из одной системы счисления(numerationSystem) в другую (expectedNumerationSystem)
бросьте NumberFormatException, если переданное число некорректно, например, число "120" с системой счисления 2
Валидация для - number.getDigit() - целое не отрицательное
Метод main не участвует в тестировании
*/
public class Solution {
    public static ArrayList<Character> validChar = new ArrayList<Character>();
    static {
        validChar.add('0');
        validChar.add('1');
        validChar.add('2');
        validChar.add('3');
        validChar.add('4');
        validChar.add('5');
        validChar.add('6');
        validChar.add('7');
        validChar.add('8');
        validChar.add('9');
        validChar.add('a');
        validChar.add('b');
        validChar.add('c');
        validChar.add('d');
        validChar.add('e');
        validChar.add('f');
    }

    public static void main(String[] args) {
        Number number = new Number(NumerationSystemType._10, "6");
        Number result = convertNumberToOtherNumerationSystem(number, NumerationSystemType._2);
        System.out.println(result.toString());    //expected 110
    }

    public static Number convertNumberToOtherNumerationSystem(Number number, NumerationSystem expectedNumerationSystem) {

        String numberInStringRepresentation = number.getDigit();
        int radix = number.getNumerationSystem().getNumerationSystemIntValue();

        if (!isValid(numberInStringRepresentation, radix))
            throw new NumberFormatException();

        BigInteger longRepresentation = new BigInteger(numberInStringRepresentation, radix);

        int expectedRadix = expectedNumerationSystem.getNumerationSystemIntValue();

        return new Number(expectedNumerationSystem, longRepresentation.toString(expectedRadix));
    }

    public static boolean isValid(String number, int radix) {
        List<Character> currValidChar = validChar.subList(0, radix);

        for (char ch : number.toLowerCase().toCharArray()) {
            if (!currValidChar.contains(ch)) {
                return false;
            }
        }

        return true;
    }
}

