import figur.*;

import java.io.PrintStream;
import java.util.Random;

public class Main {

    private static String x;

    public static void main(String[] args) {
        Shape[] array = new Shape[10];
        double x;
        double y;
        double size;
        String name;

        Random ran = new Random();

//Заполнение массива рандомными фигурами
        System.out.println("\nЗаполнение массива рандомными фигурами\n");

        for (int i=0; i<10; i++) {
            x = (Math.round((Math.random()-0.5)*1000.0))/100.0; //случайное число в диапазоне от -5 до 5 с 2 цифрами после запятой
            y = (Math.round((Math.random()-0.5)*1000.0))/100.0;
            size = (Math.round(Math.random()*1000.0))/100.0; //случайное число в диапазоне от 0 до 10 с 2 цифрами после запятой
            name = String.valueOf(i);

            switch (ran.nextInt(3)) {

                //квадрат
                case 0:{
                    array[i]= new Square(x,y,size,name);
                    System.out.println("Параметры фигуры " + (i+1) + ": x = " + x + ", y = " + y + ", длина стороны = " + size + ". Это квадрат");
                    break;
                }

                //круг
                case 1:{
                    array[i]= new Circle(x,y,size,name);
                    System.out.println("Параметры фигуры " + (i+1) + ": x = " + x + ", y = " + y + ", радиус = " + size + ". Это круг");
                    break;
                }

                //треугольник
                case 2:{
                    array[i]= new Triangle(x,y,size,name);
                    System.out.println("Параметры фигуры " + (i+1) + ": x = " + x + ", y = " + y + ", длина стороны = " + size + ". Это треугольник");
                    break;
                }
            }
        }

//Рандомное изменение размера фигур в массиве
        System.out.println("\nРандомное изменение размера фигур в массиве \n");

        System.out.println("Имя фигуры    Старый размер    Новый размер");
        for (int i=0; i<10; i++) {
            System.out.print(array[i].getName());
            System.out.printf("%18.2f",array[i].getSize());

            array[i].resize(Math.random());

            System.out.printf("%16.2f",array[i].getSize());
            System.out.println("");

        }
//Сортировка фигур по возрастанию площади
        System.out.println("\nСортировка фигур по возрастанию площади \n");

        System.out.println("Начальное расположение");
        System.out.println("Имя фигуры    Площадь");
        for (int i=0; i<10; i++) {

            System.out.print(array[i].getName());
            System.out.printf("%20.4f",array[i].area());
            System.out.println("");
        }

        Shape fig;

        for (int j=0; j<9; j++) {
            for (int i=(j+1); i<10; i++) {
                if (array[j].area() > array[i].area()) {
                    fig = array[j];
                    array[j] = array[i];
                    array[i] = fig;
                }
            }
        }

        System.out.println("\nРасположение после сортировки");
        System.out.println("Имя фигуры    Площадь");
        for (int i=0; i<10; i++) {

            System.out.print(array[i].getName());
            System.out.printf("%20.4f",array[i].area());
            System.out.println("");
        }

    }
}