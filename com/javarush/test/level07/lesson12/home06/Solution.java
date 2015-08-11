package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grand_mother1 = new Human("Бабушка мамки",false,55,null,null),grand_mother2 = new Human("Бабушка папки",false,55,null,null);
        Human grand_father1 = new Human("Дедушка мамки",true,60,null,null),grand_father2 = new Human("Дедушка папки",true,60,null,null);
        Human father = new Human("Папка",true,30,grand_father2,grand_mother2),mother = new Human("Мамка",false,25,grand_father1,grand_mother1);
        Human child1 = new Human("Старший",true,7,father,mother), child2 = new Human("средний",true,5,father,mother), child3 = new Human("младший",true,3,father,mother);
        System.out.println(grand_father1);System.out.println(grand_father2);
        System.out.println(grand_mother1);System.out.println(grand_mother2);
        System.out.println(father);System.out.println(mother);
        System.out.println(child1);System.out.println(child2);System.out.println(child3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
