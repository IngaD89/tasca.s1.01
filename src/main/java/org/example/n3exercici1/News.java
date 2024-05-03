package org.example.n3exercici1;

public abstract class News {

    private String title;
    private String text;
    private double rate;
    private double price;

    public News(String title) {
        this.title = title;
        this.text = " ";
        this.rate = 0;
        this.price = 0;

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateNewsPrice();
    public abstract double calculateNewsRate();

    @Override
    public String toString() {
        return "News{" +
                "title='" + this.title + '\'' +
                ", text='" + this.text + '\'' +
                ", rate=" + this.rate +
                ", price=" + this.price +
                '}';
    }
}
