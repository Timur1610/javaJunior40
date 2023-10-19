package lesson1;

public class MyFirstProgramm {
    public static void main(String[] args) {

        int money = 1000;
        int priceSnicers = 35;
        double priceKandy= 3.5;

        int qtySnicers= money/priceSnicers;
        System.out.println(qtySnicers + " Сникерсов можно купить");

        double surrenderOfMoney = money % priceSnicers;
        System.out.println("Сдача 20 рублей");

        int qtyKandy =(int) (surrenderOfMoney / priceKandy);
        System.out.println(qtyKandy + " Конфет можно купить на 20 рублей");

        double finalMoney = surrenderOfMoney % priceKandy;
        System.out.println(finalMoney + " рубля осталось в конце");
    }
}
