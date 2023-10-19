package lesson12;

import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {

    Kettle kettle1 = new Kettle(1.5, "Чёрный", "Нержавеющая сталь", 5, 3000);
    Kettle kettle2 = new Kettle(2, "Серый", "Фарфор", 3.2, 9500);
    Kettle kettle3 = new Kettle(1, "Красный", "Пластик", 2.4, 1500);
    Kettle kettle4 = new Kettle(1.6, "Оранжевый", "Стекло", 3, 5650);
    Kettle kettle5 = new Kettle(2.1, "Белый", "Керамика", 4, 4780);

    TreeSet<Kettle> kettles = new TreeSet<>();

    kettles.add(kettle1);
    kettles.add(kettle2);
    kettles.add(kettle3);
    kettles.add(kettle4);
    kettles.add(kettle5);

    for (Kettle k: kettles){
        System.out.println(k);
    }

    }

}
