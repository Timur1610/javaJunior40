package lesson9;

import java.util.ArrayList;
import java.util.Objects;

public class Tovar {
    //1 - поля класса, то что нам важно относительно этого объекта
    private String fullName;
    private int price;
    private int sellPrice;
    private ArrayList<Otziv> otzivs = new ArrayList<>();

    //2 - Конструкторы - особый метод, который вызывается после слова NEW
    // и рождает новый объект (именно он является тем, кто создает новый объект)

    // Структура написания конструктора:
    //- модификатор доступа public (для того, чтобы можно было вызвать его где-угодно)
    //- указывается название класса - и это же будет название конструктора - Tovar
    //- круглые скобки(входящие параметры) и тело


    public Tovar() {  // !!! Если нет пустого конструктора, то нельзя будет наследоваться от этого класса
                      // !!! Всегда нужно объявлять пустой  конструктор
    }

    public Tovar(String fullName, int price, int sellPrice) {
        this.fullName = fullName;
        this.price = price;
        this.sellPrice = sellPrice;
    }

    //3 - генерируем методы Getter и Setter на все поля. Отображение названия или цены заведомо без меня
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(ArrayList<Otziv> otzivs) {
        this.otzivs = otzivs;
    }

    //4 - генерируем equal и hashCode на все поля (переопределяем их под себя). При необходимости переопределяем метод toString на все поля

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tovar tovar = (Tovar) o;
        return price == tovar.price && sellPrice == tovar.sellPrice && Objects.equals(fullName, tovar.fullName) && Objects.equals(otzivs, tovar.otzivs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, price, sellPrice, otzivs);
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "fullName='" + fullName + '\'' +
                ", price=" + price +
                ", sellPrice=" + sellPrice +
                ", otzivs=" + otzivs +
                '}';
    }
}
