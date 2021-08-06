package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Model einer Speisekarte
 * @author Ilja Kalistratov
 */
public class Speisekarte extends ArrayList<Gericht> {

    /**
     * Methode zur Ausgabe der gesamten Speisekarte, inklusive Name der Gerichte, Preise, und verfügbare Anzahl.
     */
    public void printAll(){
        this.forEach(Gericht::printData);
    }

    /**
     * Methode zur Löschung eines Gerichtes von der Speisekarte
     * @param name Name des Gerichtes
     */
    public void deleteByName(String name){
        for (int i=0; i<this.size(); i++){
            if (this.get(i).getName().equalsIgnoreCase(name)){
                this.remove(i);
            }
        }
    }

    /**
     * Methode zum HErausfiltern eines Gerichtes, gemäß des Namen.
     * @param name Name des Gerichts
     * @return Gesuchtes Gericht
     */
    public Gericht findByName(String name){
        for (int i=0; i<this.size(); i++){
            if (this.get(i).getName().equalsIgnoreCase(name)){
                return this.get(i);
            }
        }
        return null;
    }

    /**
     * Methode zur Bearbeitung eines Gerichtes
     * @param name Name des Gerichts
     */
    public void edit(String name){
        for (int i=0; i<this.size(); i++){
            if (this.get(i).getName().equalsIgnoreCase(name)){

                System.out.println("Name:");
                Scanner scannerName = new Scanner(System.in);
                String name2 = scannerName.nextLine();
                System.out.println("Preis:");
                Scanner scannerPreis = new Scanner(System.in);
                double preis = scannerPreis.nextDouble();
                if (preis <= 0.0){
                    throw new IllegalArgumentException("Es sind nur Werte größer als 0 erlaubt!");
                }
                System.out.println("Anzahl:");
                Scanner scannerAnzahl = new Scanner(System.in);
                int anzahl = scannerAnzahl.nextInt();
                if (anzahl < 0){
                    throw new IllegalArgumentException("Es sind keine negativen Werte erlaubt!");
                }

                this.get(i).setName(name2);
                this.get(i).setPreis(preis);
                this.get(i).setAnzahl(anzahl);
            }
        }
    }

}
