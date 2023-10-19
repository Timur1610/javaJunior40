package lesson9;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Сковорода", 2000, 1500);
        Tovar tovar2 = new Tovar("Сковорода", 2000, 1500);
        System.out.println(tovar1.equals(tovar2));//Ответ - false, так как tovar1 НЕ ХРАНИТСЯ В ТОЙ ЖЕ САМОЙ ЯЧЕЙКЕ, что и tovar2
        //это то же самое, что стоят два стакана. Они абсолютно одинаковые, но это 2 РАЗНЫХ стакана
        //ПОЭТОМУ НУЖНО ПЕРЕОПРЕДЕЛИТЬ МЕТОД equal, КОТОРЫЙ БУДЕТ СРАВНИВАТЬ РАВЕНСТВО 2-УХ ОБЪЕКТОВ С УЧЁТОМ !МОИХ! ПОЛЕЙ
        System.out.println(tovar1); //ПЕРЕОПРЕДЕЛИЛИ МЕТОД toString
    }
}
