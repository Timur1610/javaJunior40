package lesson12;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Kettle implements Comparable{
    private double weight;
    private String color;
    private String material;
    private double vmestimost;
    private int price;

    public Kettle() {
    }

    public Kettle(double weight, String color, String material, double vmestimost, int price) {
        this.weight = weight;
        this.color = color;
        this.material = material;
        this.vmestimost = vmestimost;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getVmestimost() {
        return vmestimost;
    }

    public void setVmestimost(double vmestimost) {
        this.vmestimost = vmestimost;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kettle kettle = (Kettle) o;
        return Double.compare(weight, kettle.weight) == 0 && Double.compare(vmestimost, kettle.vmestimost) == 0 && price == kettle.price && Objects.equals(color, kettle.color) && Objects.equals(material, kettle.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color, material, vmestimost, price);
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "Вес чайника = " + weight +
                ", цвет = '" + color + '\'' +
                ", материал = '" + material + '\'' +
                ", вместимость = " + vmestimost +
                ", цена = " + price +
                '}';
    }


    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}
