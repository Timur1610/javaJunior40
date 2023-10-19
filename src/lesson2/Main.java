package lesson2;

public class Main {
    public static void main(String[] args) {

        int a = 3;
        int b =  5;
        int c = 3;

        if (a == b && a == c && b == c){
            System.out.println("Равносторонний");
        }
        else if (a != b && a != c && b != c){
            System.out.println("Разносторонний");
        }
        else
            System.out.println("Равнобедренный");




        int num = 575465;

        if (num % 2 == 0){
            System.out.println("Число четное");
        }

        else
            System.out.println("Число не четное");
    }




}
