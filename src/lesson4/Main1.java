package lesson4;

public class Main1 {
    public static void main(String[] args) {
        int arr[][] = new int[9][9];

//        System.out.print(arr[0][0] + " ");
//        System.out.print(arr[0][1] + " ");
//        System.out.print(arr[0][2] + " ");
//
//        System.out.println();
//
//        System.out.print(arr[1][0] + " ");
//        System.out.print(arr[1][1] + " ");
//        System.out.print(arr[1][2] + " ");
//
//        System.out.println();
//
//        System.out.print(arr[2][0] + " ");
//        System.out.print(arr[2][1] + " ");
//        System.out.print(arr[2][2] + " ");
//
//        System.out.println();

//        первый цикл генерирует индексы СТРОК
        for (int i = 0; i < arr.length; i++) {
//              второй цикл генерирует индексы КОЛОНОК
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
