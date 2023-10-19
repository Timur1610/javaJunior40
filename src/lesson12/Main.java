package lesson12;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(25, 2.3, "Золото", 1989);
        Coin coin2 = new Coin(25, 2.3, "Золото", 1989);
        Coin coin3 = new Coin(20, 1.9, "Серебро", 1980);
        Coin coin4 = new Coin(15, 1.8, "Бронза", 1945);
        Coin coin5 = new Coin(10, 1.7, "Золото", 1976);

        HashSet<Coin> coins = new HashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin c: coins)
            System.out.println(c);
    }

}
