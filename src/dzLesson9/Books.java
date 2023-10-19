package dzLesson9;

import java.util.ArrayList;

public class Books {

    private String name;
    private String author;
    private int theYearOfPublishing;
    private int numberOfPages;
    private String publishingHouse;

    public Books() {
    }

    public Books (String name, String author, int theYearOfPublishing, int numberOfPages, String publishingHouse) {
        this.name = name;
        this.author = author;
        this.theYearOfPublishing = theYearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.publishingHouse = publishingHouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTheYearOfPublishing() {
        return theYearOfPublishing;
    }

    public void setTheYearOfPublishing(int theYearOfPublishing) {
        this.theYearOfPublishing = theYearOfPublishing;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", theYearOfPublishing=" + theYearOfPublishing +
                ", numberOfPages=" + numberOfPages +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
