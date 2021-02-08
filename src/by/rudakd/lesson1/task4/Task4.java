package by.rudakd.lesson1.task4;

/*Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.*/

public class Task4 {
    public static void main(String[] args) {
        int num = 107;
        if (num < 1000 && num > 99) System.out.println("Число " + num + " является трехзначным");
        else System.out.println("Число " + num + " не является трехзначным");
        if (num % 10 == 7) System.out.println("Последняя цифра числа " + num + " является семеркой");
        else System.out.println("Последняя цифра числа " + num + " не является семеркой");
        if (num % 2 == 0) System.out.println("Число " + num + " четное");
        else System.out.println("Число " + num + " нечетное");
    }
}
