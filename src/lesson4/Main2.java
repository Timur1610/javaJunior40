package lesson4;

public class Main2 {
    public static void main(String[] args) {
        int arr[][] = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1){
                    System.out.print(arr[i][j] + " ");
                }
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
