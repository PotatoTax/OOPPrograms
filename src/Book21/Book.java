package Book21;

import Author21.Author;

public class Book {
    private String name;
    private Author author21;
    private double price;
    private int qty;

    public Book(String name, Author author21, double price) {
        this.name = name;
        this.author21 = author21;
        this.price = price;
    }

    public Book(String name, Author author21, double price, int qty) {
        this.name = name;
        this.author21 = author21;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author21;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author21 +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorName()
    {
        return author21.getName();
    }

    public String getAuthorEmail()
    {
        return author21.getEmail();
    }

    public char getAuthorGender()
    {
        return author21.getGender();
    }
}
