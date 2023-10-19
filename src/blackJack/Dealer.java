package blackJack;

public class Dealer extends Player{
    // переопределение метода - переписывание логики родительского класса в дочернем

    @Override
    public boolean needMoreCards() {
        if (countPointInHand()<18){
            return true;
        }
        return false;
    }
}
