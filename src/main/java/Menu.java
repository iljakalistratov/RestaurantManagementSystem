import model.*;

import java.util.Scanner;

public class Menu {

    //Beispiellisten
    Gericht pizza = new Gericht("pizza", 7.50, 10);
    Gericht schnitzel = new Gericht("schnitzel", 6, 13);
    Gericht salat = new Gericht("salat", 4.50, 25);
    Speisekarte gerichteliste = new Speisekarte() {{
        add(pizza);
        add(schnitzel);
        add(salat);
    }};

    Angestellter robert = new Angestellter(1, "robert", 1300);
    Angestellter herbert = new Angestellter(2, "herbert", 1250);
    Angestellter sabrina = new Angestellter(3, "sabrina", 1000);
    AngestelltenListe angestelltenListe = new AngestelltenListe() {{
        add(robert);
        add(herbert);
        add(sabrina);
    }};

    Bestellliste bestellliste = new Bestellliste();


    public void menuAdmin() {
        System.out.println("1.Gerichte verwalten");
        System.out.println("2.Mitarbeiter verwalten");
        System.out.println("3.Bestellen");
        System.out.println("4.Bestellliste");
        System.out.println("5.Exit");

        Scanner scanner = new Scanner(System.in);
        int befehl = scanner.nextInt();

        switch (befehl) {
            case 1:
                System.out.println("Gerichte verwalten");
                gerichteliste.printAll();
                System.out.println("Was möchten sie tun? (a(add)/d(delete)/e(edit)");

                Scanner scanner2 = new Scanner(System.in);
                String gerichtoperation = scanner2.nextLine();

                switch (gerichtoperation) {
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
                angestelltenListe.printAll();
                System.out.println("Was möchten sie tun? (a(add)/d(delete)/e(edit)");
                Scanner scanner3 = new Scanner(System.in);
                String mitarbeiteroperation = scanner3.nextLine();

                switch (mitarbeiteroperation) {
                    case "d":
                        System.out.println("Welcher Mitarbeiter soll von der Liste entfernt werden? (Id angeben)");
                        Scanner scanner1 = new Scanner(System.in);
                        int idDelete = scanner1.nextInt();
                        angestelltenListe.deleteById(idDelete);
                        menuAdmin();
                        break;
                    case "a":
                        System.out.println("Name:");
                        Scanner scannerName = new Scanner(System.in);
                        String name2 = scannerName.nextLine();
                        System.out.println("ID:");
                        Scanner scannerPreis = new Scanner(System.in);
                        int idAdd = scannerPreis.nextInt();
                        System.out.println("Gehalt:");
                        Scanner scannerAnzahl = new Scanner(System.in);
                        int gehalt = scannerAnzahl.nextInt();
                        Angestellter angestellter = new Angestellter(idAdd, name2, gehalt);
                        angestelltenListe.add(angestellter);
                        menuAdmin();
                        break;
                    case "e":
                        System.out.println("Welchen Mitarbeiter in der Liste wollen Sie bearbeiten (ID angeben)");
                        Scanner scanner4 = new Scanner(System.in);
                        int idEdit = scanner4.nextInt();
                        angestelltenListe.edit(idEdit);
                    default:
                        menuAdmin();
                }
                break;
            case 3:
                System.out.println("Bestellen");
                gerichteliste.printAll();
                bestellen();
                break;
            case 4:
                System.out.println("Bestellliste anzeigen");
            case 5:
                System.out.println("Exit");
                break;
            default:
                menuAdmin();
                break;
        }
    }

    public void bestellen() {
        System.out.println("Bestellen?()y/n");
        Scanner scanner2 = new Scanner(System.in);
        String bestellenYN = scanner2.nextLine();

        switch (bestellenYN) {
            case "y":
                System.out.println("Welches Gericht soll auf die Bestellliste? (Name als String)");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                Gericht gericht = gerichteliste.findByName(name);
                Gericht gerichtBestellt = new Gericht(gericht.getName(), gericht.getPreis(), 0);
                System.out.println("Wie viel?");
                Scanner scanner1 = new Scanner(System.in);
                int anzahl = scanner1.nextInt();
                if (anzahl < gericht.getAnzahl()) {
                    bestellliste.bestellen(gerichtBestellt, anzahl);
                    gericht.setAnzahl(gericht.getAnzahl() - anzahl);
                }
                bestellen();
                break;
            case "n":
                menuAdmin();


        }
    }
}
