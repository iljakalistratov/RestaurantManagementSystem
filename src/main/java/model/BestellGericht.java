package model;

public class BestellGericht {
    private Gericht gericht;
    private int anzahl;
    private double preis;

    public BestellGericht(Gericht gericht, int anzahl, double preis) {
        this.gericht = gericht;
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public Gericht getGericht() {
        return gericht;
    }

    public void setGericht(Gericht gericht) {
        this.gericht = gericht;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
