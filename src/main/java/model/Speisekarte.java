package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Speisekarte extends ArrayList<Gericht> {

    public void printAll(){
        this.forEach(Gericht::printData);
    }

//    public void deleteByName(String name){
//        this.forEach((gericht) -> {
//            if(gericht.getName().equalsIgnoreCase(name)){
//                this.remove(gericht);
//            }
//        });
//    }

    public void deleteByName(String name){
        for (int i=0; i<this.size(); i++){
            if (this.get(i).getName().equalsIgnoreCase(name)){
                this.remove(i);
            }
        }
    }

    public Gericht findByName(String name){
        for (int i=0; i<this.size(); i++){
            if (this.get(i).getName().equalsIgnoreCase(name)){
                return this.get(i);
            }
        }
        return null;
    }

    public void edit(String name){
        for (int i=0; i<this.size(); i++){
            if (this.get(i).getName().equalsIgnoreCase(name)){

                System.out.println("Name:");
                Scanner scannerName = new Scanner(System.in);
                String name2 = scannerName.nextLine();
                System.out.println("Preis:");
                Scanner scannerPreis = new Scanner(System.in);
                double preis = scannerPreis.nextDouble();
                System.out.println("Anzahl:");
                Scanner scannerAnzahl = new Scanner(System.in);
                int anzahl = scannerAnzahl.nextInt();

                this.get(i).setName(name2);
                this.get(i).setPreis(preis);
                this.get(i).setAnzahl(anzahl);
            }
        }
    }

}
