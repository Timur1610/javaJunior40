package lesson13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> fridge = new HashMap<>(); //в угольных скобках передаем КЛЮЧ - String, ЗНАЧЕНИЕ - Integer
        fridge.put("Вода", 10); // метод put кладет КЛЮЧ - ВОДА и ЗНАЧЕНИЕ - 10 (литров)
        fridge.put("Слива", 8);
        fridge.put("Сахар", 2);

        System.out.println(fridge); //{Сахар=2, Вода=10, Слива=8}
    }
}
