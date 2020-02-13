package com.dongruan.tushu.Tushulianxi;

import java.io.Serializable;

public class Mybook implements Serializable {
    private static final long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }

    private String name;
    private double price;
    private String press;
    private String autor;

    public Mybook() {
    }
    public Mybook(String name,double price,String press,String autor,String bookISBN) {
       this.name=name;
       this.press=press;
       this.price=price;
       this.autor=autor;
       this.bookISBN=bookISBN;
    }
    @Override
    public String toString() {
        return "Mybook{}";
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
