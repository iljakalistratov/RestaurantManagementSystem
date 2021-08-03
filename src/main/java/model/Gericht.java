package model;

public class Gericht {
    private String name;
    private double preis;
    private int anzahl;

    public Gericht(int id, String name, double preis, int anzahl) {
        this.name = name;
        this.preis = preis;
        this.anzahl = anzahl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
