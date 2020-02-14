package com.dongruan.tushu.Tushulianxi;

import java.io.Serializable;

public class Mybook implements Serializable {
    private static final long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }

    private String name;
    private double price;

    @Override
    public String toString() {
        return "Mybook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", autor='" + autor + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                '}';
    }

    private String press;
    private String autor;

    public Mybook(String name, double price, String press, String autor, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.autor = autor;
        this.bookISBN = bookISBN;
    }

    public Mybook() {
    }

    public Mybook(String name) {
        this.name = name;
    }

    private String bookISBN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }



}
