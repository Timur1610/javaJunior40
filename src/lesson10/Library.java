package lesson10;

import java.util.ArrayList;

public class Library {
    private ArrayList<PrintEdition> editions = new ArrayList<>();

    public void fillEditions(){
        Book book1 = new Book("Азбука", 1930, "АБВ", "Иванов", 30);
        Book book2 = new Book("Война и мир", 1974, "АСТ", "Лев Толстой", 30);
        Book book3 = new Book("Буратино", 2009, "АБВ", "Петров", 58);
        Magazin magazin1 = new Magazin("Крокодил", 1998, "qwerty", 13);
        Magazin magazin2 = new Magazin("Отец и сын", 1956, "qwertty", 12);

        editions.add(book1);
        editions.add(book2);
        editions.add(book3);
        editions.add(magazin1);
        editions.add(magazin2);
    }

    public void printAllEdition(){
        for (PrintEdition edition: editions){
            System.out.println(edition);
        }
    }

    public void printLargestBook(){
        PrintEdition largest = new Book(" ", 0, " ", " ", -1);
        for (PrintEdition edition: editions){
            if (edition instanceof Book){
                if(((Book) edition).getPages() > ((Book) largest).getPages()){
                    largest = edition;
                }
            }
        }
        System.out.println("---САМАЯ БОЛЬШАЯ КНИГА---");
        System.out.println(largest);
    }

}
