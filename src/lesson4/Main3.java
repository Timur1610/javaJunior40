package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Выберите уровень:");
        System.out.println("Новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");

        Scanner scanner = new Scanner(System.in);

        String level = scanner.next();

        if (level.equalsIgnoreCase("Новичок")) {
            int[][] arr = new int[9][9];
            for (int i = 0; i < arr.length; i++) {

                int row = ThreadLocalRandom.current().nextInt(0, 9);
                int col = ThreadLocalRandom.current().nextInt(0, 9);

                if (arr[row][col] != 0) {
                    i--;
                } else {
                    arr[row][col] = -1;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }

        }

        if (level.equalsIgnoreCase("Любитель")) {
            int[][] arr = new int[16][16];
            for (int i = 0; i < 40; i++) {
                int row = ThreadLocalRandom.current().nextInt(0, 40);
                int col = ThreadLocalRandom.current().nextInt(0, 40);

                if (arr[row][col] != 0) {
                    i--;
                } else {
                    arr[row][col] = -1;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }
        }

        if (level.equalsIgnoreCase("Профессионал")) {
            int[][] arr = new int[99][99];
            for (int i = 0; i < arr.length; i++) {
                int row = ThreadLocalRandom.current().nextInt(0, 99);
                int col = ThreadLocalRandom.current().nextInt(0, 99);

                if (arr[row][col] != 0) {
                    i--;
                } else {
                    arr[row][col] = -1;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }
        }

        if (level.equalsIgnoreCase("Особый")) {

            String width = scanner.next();
            String height = scanner.next();



        }
    }
}























