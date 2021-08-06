package model;

/**
 * Gericht-Klasse zur Modellierung eines Gerichtes
 * @author Ilja Kalistratov
 */
public class Gericht {
    private String name;
    private double preis;
    private int anzahl;

    /**
     * Constructor eines Gerichts
     * @param name Name des Gerichts
     * @param preis Preis des Gerichts
     * @param anzahl Verfügbare Anzahl des Gerichts
     */
    public Gericht(String name, double preis, int anzahl) {
        this.name = name;
        this.preis = preis;
        this.anzahl = anzahl;
    }

    /**
     * Methode zur Ausgabe der Daten eines Gerichts in der Konsole (Speisekarte)
     */
    public void printData(){
        System.out.println(this.name + ": ");
        System.out.printf("Preis: " + this.preis + "     Verfügbar: " + this.anzahl);
        System.out.println();
        System.out.println();
    }

    /**
     * Methode zur Ausgabe der Daten eines Gerichts in der Konsole (Bestellung)
     */
    public void printDataBestellt(){
        System.out.println(this.name + ": ");
        System.out.printf("Preis: " + this.preis + "     Anzahl: " + this.anzahl);
        System.out.println();
        System.out.println();
    }

    /**
     * Getter des Namen eines Gerichts
     * @return Name des Gerichts
     */
    public String getName() {
        return name;
    }

    /**
     * Setter des Namen eines Gerichts
     * @param name Name des Gerichtes
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter des Preises eines Gerichtes
     * @return Preis des Gerichtes
     */
    public double getPreis() {
        return preis;
    }

    /**
     * Setter des Preises eines Gerichtes
     * @param preis Preis des Gerichtes
     */
    public void setPreis(double preis) {
        this.preis = preis;
    }

    /**
     * Getter der Quantität eines Gerichtes
     * @return Anzahl des Gerichtes
     */
    public int getAnzahl() {
        return anzahl;
    }

    /**
     * Setter der Quantität eines Gerichtes
     * @param anzahl Anzahl des Gerichtes
     */
    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
