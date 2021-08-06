package model;

import java.util.ArrayList;
import java.util.List;

public class Bestellliste extends ArrayList<Gericht> {

    public void printAll(){
        this.forEach(Gericht::printDataBestellt);
    }

    public void printGesamtpreis(){
        System.out.println();
        System.out.println("Gesamtpreis: " + this.getGesamtPreis());
    }

    private double gesamtPreis;

    public void bestellen(Gericht gericht){
        this.add(gericht);
    }

    public void bestellen(Gericht gericht, int anzahl){
        gericht.setAnzahl(anzahl);
        this.add(gericht);
    }

    public double getGesamtPreis() {
        gesamtPreis = 0;
        this.forEach((gericht) -> {
            gesamtPreis += gericht.getPreis()*gericht.getAnzahl();
        });
        return gesamtPreis;
    }

    public void setGesamtPreis(double gesamtPreis) {
        this.gesamtPreis = gesamtPreis;
    }
}
