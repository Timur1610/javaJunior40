package blackJack;

public class Card {
    private String nominal;
    private int point;

    //конструктор - это особый метод, который вызывается после слова new в момент создания объекта
    public Card(String nominal, int point){
        this.nominal = nominal;
        this.point = point;
    }
    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
