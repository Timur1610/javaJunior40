package dzLesson9;
import java.util.Arrays;

public class Katalog {
    public static void main(String[] args) {
        Books books = new Books("Крокодил Гена и его друзья", "Эдуард Успенский", 1966, 138, "АСТ");
        Magazines magazines = new Magazines("Крокодил", 2017,  2008, "Рабочая газета" );

        System.out.println(books);
        System.out.println(magazines);
        // Объявить зубчатый массив, содержащий три элемента
        int[][] arr = new int[2][];

        // Инициализируем элементы
        arr[0] = new int[] {1966, 138};
        arr[1] = new int[] {2017, 2008};


        // печатаем элементы массива
        for (int[] row: arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
