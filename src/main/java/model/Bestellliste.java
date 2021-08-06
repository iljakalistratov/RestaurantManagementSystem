package model;

import java.util.ArrayList;

/**
 * Model einer Bestellung in FOrm einer Liste
 * @author Ilja Kalistratov
 */
public class Bestellliste extends ArrayList<Gericht> {

    private double gesamtPreis;

    /**
     * Methode um alle bestellten Gerichte, mit ihrem EInzelpreis, der bestellten Anzahl & dem Gesamtpreis in der Konsole auszugeben.
     */
    public void printAll(){
        this.forEach(Gericht::printDataBestellt);
        printGesamtpreis();
    }

    /**
     * Methode zur Ausgabe des Gesamtpreises der Bestellung
     */
    public void printGesamtpreis(){
        System.out.println();
        System.out.println("Gesamtpreis: " + this.getGesamtPreis());
    }

    /**
     * Methode um ein Gericht, gemäß einer bestimmten Anzahl zur Liste hinzuzufügen.
     * @param gericht Bestelltes Gericht
     * @param anzahl Anzahl des Gerichts
     */
    public void bestellen(Gericht gericht, int anzahl){
        if (anzahl < 1){
            throw new IllegalArgumentException("Es sind nur Werte größer 0 erlaubt");
        }
        gericht.setAnzahl(anzahl);
        this.add(gericht);
    }

    /**
     * Methode zur Berechnung des Gesamtpreises einer Bestellung
     * @return Gesamtpreis als Double
     */
    public double getGesamtPreis() {
        gesamtPreis = 0;
        this.forEach((gericht) -> {
            gesamtPreis += gericht.getPreis()*gericht.getAnzahl();
        });
        return gesamtPreis;
    }

    /**
     * Setter für Gesamtpreis
     * @param gesamtPreis
     */
    public void setGesamtPreis(double gesamtPreis) {
        this.gesamtPreis = gesamtPreis;
    }
}
