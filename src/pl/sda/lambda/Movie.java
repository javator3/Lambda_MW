package pl.sda.lambda;

import java.time.LocalDate;
import java.util.List;

public class Movie {
    private String title;
    private String direcotr;
    private LocalDate localDate;
    private double price;
    private List<String> actorList;

    public Movie(String title, String direcotr, LocalDate localDate, double price, List<String> actorList) {
        this.title = title;
        this.direcotr = direcotr;
        this.localDate = localDate;
        this.price = price;
        this.actorList = actorList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirecotr() {
        return direcotr;
    }

    public void setDirecotr(String direcotr) {
        this.direcotr = direcotr;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getActorList() {
        return actorList;
    }

    public void setActorList(List<String> actorList) {
        this.actorList = actorList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", direcotr='" + direcotr + '\'' +
                ", localDate=" + localDate +
                ", price=" + price +
                ", actorList=" + actorList +
                '}';
    }
}
