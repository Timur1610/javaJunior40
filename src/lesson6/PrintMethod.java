package lesson6;

import java.util.Random;
import java.util.Scanner;

public class PrintMethod {
    public static void evenNumbers(int[][] arr1) {
        int numberOfEvenNumbers = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 59);
                if (arr1[i][j] % 2 == 0) {
                    numberOfEvenNumbers += 1;
                }
            }
        }
        System.out.print(numberOfEvenNumbers + " ");

    } // задача 1

    public static void smallestOfAllNumbers(int[] arr2) {
        Random random = new Random();
        int smallNumber = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(40);
            if (arr2[i]<smallNumber){
                smallNumber = arr2[i];
            }
        }
        System.out.println(smallNumber);
    } // задача 2

    public static void fillArr(int[] arr3) {
        Random random = new Random();
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = random.nextInt(40);
            System.out.print(arr3[i] + "; ");
        }

    } // задача 3

    public static void nameOfTheMonthFromTheNum(int[] month) {
        System.out.println("Введите названеие месяца или его порядковый номер");
        Scanner scanner = new Scanner(System.in);
        String monthOrNum = scanner.next();

        if (monthOrNum.equals("1")) {
            System.out.println("Первый месяц года - ЯНВАРЬ");
        } else if (monthOrNum.equalsIgnoreCase("Январь")) {
            System.out.println("Январь - это ПЕРВЫЙ месяц в году");
        } else if (monthOrNum.equals("2")) {
            System.out.println("Второй месяц года - ФЕВРАЛЬ");
        } else if (monthOrNum.equalsIgnoreCase("Январь")) {
            System.out.println("Февраль - это ВТОРОЙ месяц в году");
        } else if (monthOrNum.equals("3")) {
            System.out.println("Третий месяц года - МАРТ");
        } else if (monthOrNum.equalsIgnoreCase("Март")) {
            System.out.println("Март - это ТРЕТИЙ месяц в году");
        } else if (monthOrNum.equals("4")) {
            System.out.println("Четвёрный месяц года - АПРЕЛЬ");
        } else if (monthOrNum.equalsIgnoreCase("Апрель")) {
            System.out.println("Апрель - это ЧЕТВЁРТЫЙ месяц в году");
        } else if (monthOrNum.equals("5")) {
            System.out.println("Пятый месяц года - МАЙ");
        } else if (monthOrNum.equalsIgnoreCase("Май")) {
            System.out.println("Май - это ПЯТЫЙ месяц в году");
        } else if (monthOrNum.equals("6")) {
            System.out.println("Шестой месяц года - ИЮНЬ");
        } else if (monthOrNum.equalsIgnoreCase("Июнь")) {
            System.out.println("Июнь - это ШЕСТОЙ месяц в году");
        } else if (monthOrNum.equals("7")) {
            System.out.println("Седьмой месяц года - ИЮЛЬ");
        } else if (monthOrNum.equalsIgnoreCase("Июль")) {
            System.out.println("Июль - это СЕДЬМОЙ месяц в году");
        } else if (monthOrNum.equals("8")) {
            System.out.println("Восьмой месяц года - АВГУСТ");
        } else if (monthOrNum.equalsIgnoreCase("Август")) {
            System.out.println("Август - это ВОСЬМОЙ месяц в году");
        } else if (monthOrNum.equals("9")) {
            System.out.println("Девятый месяц года - СЕНТЯБРЬ");
        } else if (monthOrNum.equalsIgnoreCase("Сентябрь")) {
            System.out.println("Сентябрь - это ДЕВЯТЫЙ месяц в году");
        } else if (monthOrNum.equals("10")) {
            System.out.println("Десятый месяц года - ОКТЯБРЬ");
        } else if (monthOrNum.equalsIgnoreCase("Октябрь")) {
            System.out.println("Октябрь - это ДЕСЯТЫЙ месяц в году");
        } else if (monthOrNum.equals("11")) {
            System.out.println("Одиннадцатый месяц года - НОЯБРЬ");
        } else if (monthOrNum.equalsIgnoreCase("Ноябрь")) {
            System.out.println("Ноябрь - это ОДИННАДЦАТый месяц в году");
        } else if (monthOrNum.equals("12")) {
            System.out.println("Двенадцатый месяц года - ДЕКАБРЬ");
        } else if (monthOrNum.equalsIgnoreCase("Декабрь")) {
            System.out.println("Декабрь - это ДВЕНАДЦАТЫЙ месяц в году");
        } else {
            System.out.println("Вы ввели что-то не то");
        }
    } // задача 4

    public static void whatKindOfTriangle(){
       Scanner scanner = new Scanner(System.in);
       String storona1 = scanner.next();
       String storona2 = scanner.next();
       String storona3 = scanner.next();

       int a = Integer.parseInt(storona1);
       int b = Integer.parseInt(storona2);
       int c = Integer.parseInt(storona3);


       if (a + c <= b || b + c <= a || a + b <= c ) {
           System.out.println("Треугольник не существует");
       } else {
           if (a == b && b == c && a == c) {
               System.out.println("Треугольник равносторонний");
           } else {
               if (a != b && a != c && b != c) {
                   System.out.println("Треугольник разносторонний");
               } else {
                   System.out.println("Треугольник равнобедренный");
               }
           }
       }
   } // задача 5



}