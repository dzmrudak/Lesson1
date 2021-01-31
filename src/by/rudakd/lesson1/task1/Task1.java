package by.rudakd.lesson1.task1;

/*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.*/

public class Task1 {
    public static void main(String[] args) {
        int s = 4500;
        int sec = s % 60;
        int min = (s - sec) / 60;
        int m = min % 60;
        int hr = (min - m) / 60;
        int h = hr % 24;
        int day = (hr - h) / 24;
        int d = day % 7;
        int week = (day - d) / 7;
        System.out.println("A: 4500 secs = " + min + " min(s) " + sec + " sec(s)");
        System.out.println("B: 4500 secs = " + hr + " hr(s) " + m + " min(s) " + sec + " sec(s)");
        System.out.println("C: 4500 secs = " + day + " day(s) " + h + " hr(s) " + m + " min(s) " + sec + " sec(s)");
        System.out.println("D: 4500 secs = " + week + " week(s) " + d + " day(s) " + h + " hr(s) " + m + " min(s) " + sec + " sec(s)");
    }
}
