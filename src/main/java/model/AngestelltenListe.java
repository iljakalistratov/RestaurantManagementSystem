package model;

import java.util.ArrayList;
import java.util.Scanner;

public class AngestelltenListe extends ArrayList<Angestellter> {

    public void printAll(){
        this.forEach(Angestellter::printData);
    }

    public void deleteById(int id) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getId() == id) {
                this.remove(i);
            }
        }
    }

    public void edit(int id) {
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

