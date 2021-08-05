import model.Gericht;
import model.Speisekarte;

import java.util.Scanner;

public class Menu {

    //Beispielliste
    Gericht pizza = new Gericht("pizza", 7.50, 10);
    Gericht schnitzel = new Gericht("schnitzel", 6, 13);
    Gericht salat = new Gericht("salat", 4.50, 25);
    Speisekarte gerichteliste = new Speisekarte(){{
        add(pizza);
        add(schnitzel);
        add(salat);
    }};



    public void menuAdmin(){
        System.out.println("1.Gerichte verwalten");
        System.out.println("2.Mitarbeiter verwalten");
        System.out.println("3.Bestellen");
        System.out.println("4.Exit");

        Scanner scanner = new Scanner(System.in);
        int befehl = scanner.nextInt();

        switch (befehl){
            case 1:
                System.out.println("Gerichte verwalten");
                gerichteliste.printAll();
                System.out.println("Was möchten sie tun? (a(add)/d(delete)/e(edit)");

                Scanner scanner2 = new Scanner(System.in);
                String gerichtoperation = scanner2.nextLine();

                switch (gerichtoperation){
                    case "d":
                        System.out.println("Welches Gericht soll von der Speisekarte entfrnt werden? (Name als String)");
                        Scanner scanner1 = new Scanner(System.in);
                        String name = scanner1.nextLine();
                        gerichteliste.deleteByName(name);
                        menuAdmin();
                        break;
                    case "a":
                        System.out.println("Name:");
                        Scanner scannerName = new Scanner(System.in);
                        String name2 = scannerName.nextLine();
                        System.out.println("Preis:");
                        Scanner scannerPreis = new Scanner(System.in);
                        double preis = scannerPreis.nextDouble();
                        System.out.println("Anzahl:");
                        Scanner scannerAnzahl = new Scanner(System.in);
                        int anzahl = scannerAnzahl.nextInt();
                        Gericht gericht = new Gericht(name2, preis, anzahl);
                        gerichteliste.add(gericht);
                        menuAdmin();
                        break;
                    case "e":
                        System.out.println("Welches Gericht möchten Sie bearbeiten? (Name als String)");
                        Scanner scanner3 = new Scanner(System.in);
                        String name3 = scanner3.nextLine();
                        gerichteliste.edit(name3);
                    default:
                        menuAdmin();
                }
                break;
            case 2:
                System.out.println("Mitarbeiter verwalten");
                break;
            case 3:
                System.out.println("Bestellen");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                menuAdmin();
                break;
        }
    }
}
