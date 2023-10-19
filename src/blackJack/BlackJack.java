package blackJack;

import java.util.ArrayList;

public class BlackJack {
    private ArrayList<Player> players= new ArrayList<>();

    public void addPlayerToGame(Player player){
        players.add(player);
    }

    public void dealTwoCardsToAllPlayers(Koloda koloda){
        for (Player p:players){ //проходимся по всем игрокам, не важно есть ли там крупье
            // p - это текущий момент одного игрока
            p.addCardToHand(koloda.getRandomCard()); //первая карта
        }
        for (Player p:players){ //проходимся по всем игрокам, не важно есть ли там крупье
            // p - это текущий момент одного игрока
            p.addCardToHand(koloda.getRandomCard()); // вторая карта
        }
    }

    public void dealAllNeedCards(Koloda koloda){
        for (Player p: players){
            while (p.needMoreCards())// !!! Программа динамически подстраивается.
                                     // !!! Реализация этого метода (needMoreCards) будет разная в зависимости от того
                                     // !!! Какой тип объекта программа взяла
                //ПРОЯВЛЕНИЕ ПОЛИМОРФИЗМА. Это свойство программы работает с разными типами данных как с одним и тем же,
                //но в то же самое время в момент выполнения программы она работает с разными типами.
                //То есть пишем код на один тип данных, а распространяется программа на все остальные типы(если имеется наследование - extends)
                p.addCardToHand(koloda.getRandomCard());
        }
    }

    public void printWinner(){
        /**
         * 24   26   25   27   - победил крупье
         * 24   19   25   27   - победил у кого недобор
         * 21   21   21   27   - победили 3 человека
         * 18   18   25   12   - победили те, у кого ближе к 21
         * 12   12   13   14   - победил тот, у кого 14
         */

        for (Player p: players){ //проходимся по всем игрокам и устанавливаем False тем, у кого больше 21
            if (p.countPointInHand() > 21){
                p.setCanWinn(false);
            }
        }

        //Если у всех перебор - выиграл крупье
        if (countPlayersWhoCanWinn() == 0){ //Если никакой игрок не выиграл
            for (Player p: players){ // То мы проходимся по каждому игроку( в поисках крупье)
                if (p instanceof Dealer){ //И если среди них есть крупье
                    System.out.println("Выиграл крупье! Вот его карты: "); //То печатаем на консоль - выиграл крупье
                    p.openHand(); //Показываем карты крупье
                    return; //Чтобы не выполнялся метод дальше
                }
            }
        }

        //Если в игре остался 1 игрок
        if (countPlayersWhoCanWinn() == 1){ //Если выиграл 1 игрок
            for (Player p: players){ // Проходимся по всем игрокам
                if(p.isCanWinn()){ // Находим игрока, который в игре. Он один единственный там
                    System.out.println("Выиграл " + p.getName() + "! Вот его карты: ");//Печатаем на консоль
                    p.openHand(); //Показываем карты игрока
                    return; //Чтобы не выполнялся метод дальше
                }
            }
        }

        //Узнаем очки победителя
        int pointWinner = -1; //Задаем начальное значение
        for (Player p: players){ // Проходимся по всем игрокам
            if (p.isCanWinn() && p.countPointInHand() > pointWinner){ // если игрок еще в игре и его countPointInHand больше чем pointWinner
                pointWinner = p.countPointInHand(); // следом мы присваиваем его очки к очкам победителя
            }
        }

        //Узнали очки победителя и печатаем тех игроков, у кого такой балл (их может быть несколько)
        for (Player p: players){
            if (pointWinner == p.countPointInHand()){
                System.out.println("Выиграл " + p.getName() + "! Вот его карты: ");
                p.openHand();
            }
        }
    }
    private int countPlayersWhoCanWinn(){
        int count = 0;
        for (Player p: players){
            if (p.isCanWinn()){
                count++;
            }
        }
        return count;
    }

}
