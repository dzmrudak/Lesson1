package by.rudakd.lesson1.task5;

/*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.*/

public class Task5 {
    public static void main(String[] args) {

        double width = 3;
        double length = 4;
        double r = 2.5;

        //Чтобы круг полностью закрывал прямоугольник, необходимо, чтобы радиус круга был больше либо равен
        //поовине диагонали прямоугольника, поэтому вводим переменную, определяющую эту величину
        double halfRectDiag = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2)) / 2;

        if (r >= halfRectDiag) {
            System.out.println("Круг полностью закрывает прямоугольник");
        }
        else System.out.println("Круг не полностью закрывает прямоугольник");
    }
}
