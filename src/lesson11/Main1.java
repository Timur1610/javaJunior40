package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++ ){
            arrayList.add("qwerty" + i);
        }
        long time2 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++ ){
            linkedList.add("qwerty" + i);
        }
        long time3 = System.currentTimeMillis();

        System.out.println("ArrayList add - " + (time2 - time1)); //проверяем сколько по времени выполняет метод ADD в ArrayList
        System.out.println("LinkedList add - "+ (time3 - time2)); //проверяем сколько по времени выполняет метод ADD в LinkedList



        for (int i = 0; i < 1000000; i++ ){
            arrayList.add("qwerty" + i);
        }
        long time4 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++ ){
            linkedList.add("qwerty" + i);
        }
        long time5 = System.currentTimeMillis();

        System.out.println("ArrayList get - " + (time4 - time3)); //проверяем сколько по времени выполняет метод GET в ArrayList
        System.out.println("LinkedList get - "+ (time5 - time4)); //проверяем сколько по времени выполняет метод GET в LinkedList
    }
}
