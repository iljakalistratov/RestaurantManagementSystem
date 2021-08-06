package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Listenklasse zur Verwaltung der Angestellten
 * @author Ilja Kalistratov
 */
public class AngestelltenListe extends ArrayList<Angestellter> {

    /**
     * Methode zur Ausgabe aller Angestellten in Form einer Liste
     */
    public void printAll(){
        this.forEach(Angestellter::printData);
    }

    /**
     * Methode zur Entlassung von Angestellten gemäß ihrer ID
     * @param id ID des Angestellten
     */
    public void deleteById(int id) {
        if (id<0){
            throw new IllegalArgumentException("Es sind keine negativen Werte al ID erlaubt!");
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getId() == id) {
                this.remove(i);
            }
        }
    }

    /**
     * Methode um aus der Liste einen ANgestellten herauszufiltern, gemäß seiner ID.
     * @param id ID des gesuchten Mitarbeiters
     * @return gesuhter Mitarbeiter
     */
    public Angestellter findById(int id){
        if (id<0){
            throw new IllegalArgumentException("Es sind keine negativen Werte al ID erlaubt!");
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getId() == id) {
                return this.get(i);
            }
        }
        return null;
    }

    /**
     * Methode um Daten eines bereits existierenden Mitarbeiters zu bearbeiten.
     * @param id ID des Mitarbeiters
     */
    public void edit(int id) {
        if (id<0){
            throw new IllegalArgumentException("Es sind keine negativen Werte al ID erlaubt!");
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getId() == id) {
                System.out.println("Name:");
                Scanner scannerName = new Scanner(System.in);
                String name = scannerName.nextLine();
                System.out.println("Gehalt:");
                Scanner scannerGehalt = new Scanner(System.in);
                int gehalt = scannerGehalt.nextInt();

                this.get(i).setName(name);
                this.get(i).setGehalt(gehalt);

            }
        }
    }
}

