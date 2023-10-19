package dzLesson9;

import java.util.ArrayList;
import java.util.Objects;

public class Magazines {
    private String name;
    private int released;
    private int numberInTheYear;
    private String publishingHouse;


    public Magazines() {
    }

    public Magazines(String name, int released, int numberInTheYear, String publishingHouse) {
        this.name = name;
        this.released = released;
        this.numberInTheYear = numberInTheYear;
        this.publishingHouse = publishingHouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }

    public int getNumberInTheYear() {
        return numberInTheYear;
    }

    public void setNumberInTheYear(int numberInTheYear) {
        this.numberInTheYear = numberInTheYear;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "name='" + name + '\'' +
                ", released=" + released +
                ", numberInTheYear=" + numberInTheYear +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }

}
