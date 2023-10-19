package lesson11;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        //проход по коллекции
        //1 - с помощью цикла for - используется только в коллекциях, где ЕСТЬ ИНДЕКСЫ
        //2 - с помощью цикла for each - можно пройтись по коллекции, но НЕ ИЗМЕНИТЬ ЕЁ
        //3 - c помощью итератора - МОЖЕТ ПРОЙТИСЬ И МОДЕРНИЗИРОВАТЬ КОЛЛЕКЦИЮ

        HashSet<String> texts = new HashSet<>();
        texts.add("qqq");
        texts.add("rrr");
        texts.add("hhh");
        texts.add("kkk");

//        for (Integer<String> iterator = texts.iterator(); iterator.hasNext();){
//            System.out.println(iterator.next());
//        }
    }
}
