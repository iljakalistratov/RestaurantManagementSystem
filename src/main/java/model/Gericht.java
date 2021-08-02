package model;

public class Gericht {
    private String name;
    private double price;
    private int anzahl;

    public Gericht(int id, String name, double price, int anzahl) {
        this.name = name;
        this.price = price;
        this.anzahl = anzahl;
    }

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

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
