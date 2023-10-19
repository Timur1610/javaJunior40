package lesson12;

import java.util.Objects;

public class Coin {
    private int nominal;
    private double diammetr;
    private String metall;
    private int year;

    public Coin() {
    }

    public Coin(int nominal, double diammetr, String metall, int year) {
        this.nominal = nominal;
        this.diammetr = diammetr;
        this.metall = metall;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiammetr() {
        return diammetr;
    }

    public void setDiammetr(double diammetr) {
        this.diammetr = diammetr;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && Double.compare(diammetr, coin.diammetr) == 0 && year == coin.year && Objects.equals(metall, coin.metall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, diammetr, metall, year);
    }

    @Override
    public String toString() {
        return "Coin {" +
                "nominal = " + nominal +
                ", diammetr = " + diammetr +
                ", metall = '" + metall + '\'' +
                ", year = " + year +
                '}';
    }
}
