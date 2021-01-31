package by.rudakd.lesson1.task3;

//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?

public class Task3 {
    public static void main(String[] args) {
        int number = 9630;
        int unit = number / 1000 % 10;
        int doz = number / 100 % 10;
        int hund = number / 10 % 10;
        int thous = number % 10;
        boolean numAreDifferent = unit != doz && unit != hund && unit != thous && doz != hund && doz != thous && hund != thous;
        System.out.println("Цифры различны между собой? Ответ: " + numAreDifferent);
    }
}
