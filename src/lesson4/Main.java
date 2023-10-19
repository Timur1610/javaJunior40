package lesson4;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 89, 54, 14, 4};

        for (int n : arr) {
//            преобразовываем в текст
            String intInString = n + "";
            if(intInString.contains("4")){
                System.out.println(intInString);
            }

        }
    }
}
