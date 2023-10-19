

package lesson3;

public class Main1 {
    public static void main(String[] args) {

        int[] arr = {35, 36, 43, 85, 44, 80, 2, 5, 87, 34};

        for (int i = arr.length - 1; i>=0 ; i--){
            if (arr[i] % 2 == 0 ){
                System.out.println(arr[i]);
            }
        }
    }
}