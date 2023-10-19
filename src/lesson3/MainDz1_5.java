package lesson3;

public class MainDz1_5 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 13, 15, 14};

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 10 && arr[i] < 25){
                System.out.println(arr[i]);

            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }

        int summ = 0;
        for (int i = 0; i < arr.length; i++){
                summ = summ + arr[i];
        }
        System.out.println(summ);

        int sumChet = 0;
        int sumNeChet = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 ==0){
                sumChet = sumChet + arr[i];
            } else if (arr[i] % 2 !=0) {
                sumNeChet = sumNeChet + arr[i];
            }
        }
        System.out.println(sumChet-sumNeChet);


    }
}

