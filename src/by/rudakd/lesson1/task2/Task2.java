package by.rudakd.lesson1.task2;

//Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n.

public class Task2 {
    public static void main(String[] args) {
        int convertNumber = 1234;
        int unit = convertNumber/1000 % 10;
        int doz = convertNumber / 100 % 10 * 10;
        int hund = convertNumber / 10 % 10 * 100;
        int thous = convertNumber % 10 * 1000;
        int authNum = unit + doz + hund + thous;
        System.out.println("Authentic number =  " + authNum);
    }
}
