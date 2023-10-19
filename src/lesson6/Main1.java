package lesson6;

public class Main1 {
    public static void main(String[] args) {
        int [][] arr1 = new int[3][4];  // задача 1
        PrintMethod.evenNumbers(arr1);

        int[] arr2 = new int[5];    // задача 2
        PrintMethod.smallestOfAllNumbers(arr2);

        int[] arr3 = new int[8];  // задача 3
        PrintMethod.fillArr(arr3);

        int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};  // задача 4
        PrintMethod.nameOfTheMonthFromTheNum(month);

        PrintMethod.whatKindOfTriangle();  //задача 5
    }

}
