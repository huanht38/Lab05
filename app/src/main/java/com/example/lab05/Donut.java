package com.example.lab05;

public class Donut {
    private int id;
    private String name;
    private String detail;
    private int price;

    public Donut(int id, String name, String detail, int price) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
