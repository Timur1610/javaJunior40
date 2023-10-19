package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProducts("Яблоко", 3);
        fridge.addProducts("Яблоко", 7);
        fridge.bol("Тыква", 5);
        fridge.bol("Мороженое", 2);
        fridge.bol("Апельсин", 6);
        fridge.bol("Огурец", 9);

//        fridge.getProducts("Слива", 3);
        fridge.men("Банан", 1);
        fridge.printAllProduct();
    }




}
