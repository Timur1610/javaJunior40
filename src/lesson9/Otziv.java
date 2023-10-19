package lesson9;

import java.util.Date;
import java.util.Objects;

public class Otziv {
    private int raiting;
    private String textOfOtziv;
    private Date date;
    private User user;


    public Otziv() {
    }

    public Otziv(int raiting, String textOfOtziv) {
        this.raiting = raiting;
        this.textOfOtziv = textOfOtziv;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public String getTextOfOtziv() {
        return textOfOtziv;
    }

    public void setTextOfOtziv(String textOfOtziv) {
        this.textOfOtziv = textOfOtziv;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Otziv otziv = (Otziv) o;
        return raiting == otziv.raiting && Objects.equals(textOfOtziv, otziv.textOfOtziv) && Objects.equals(date, otziv.date) && Objects.equals(user, otziv.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raiting, textOfOtziv, date, user);
    }

    @Override
    public String toString() {
        return "Otziv{" +
                "raiting=" + raiting +
                ", textOfOtziv='" + textOfOtziv + '\'' +
                ", date=" + date +
                ", user=" + user +
                '}';
    }
}
