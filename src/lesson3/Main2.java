package lesson3;

public class Main2 {
    public static void main(String[] args) {

        int[] arr = new int[10];


//        arr[0] = 30;
//        arr[1] = 33;
//        arr[2] = 36;
//        arr[3] = 39;
//        arr[4] = 42;
//        arr[5] = 45;
//        arr[6] = 48;
//        arr[7] = 52;


        int value = 30;

        for (int i = 0; i < arr.length; i++){
            arr[i] = value;
            value = value + 3;
            System.out.println(arr[i]);

        }
    }
}
