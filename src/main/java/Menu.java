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

        Scanner scannerAnfang = new Scanner(System.in);
        int befehl = scannerAnfang.nextInt();

        switch (befehl) {
            case 1:
                System.out.println("Gerichte verwalten");
                gerichteVerwalten();
                break;
            case 2:
                System.out.println("Mitarbeiter verwalten");
                mitarbeiterVerwalten();
                break;
            case 3:
                System.out.println("Bestellen");
                gerichteliste.printAll();
                bestellen();
                break;
            case 4:
                System.out.println("Bestellliste anzeigen");
                bestellListe();
            case 5:
                System.exit(0);
                break;
            default:
                menuAdmin();
                break;
        }
    }

    public void gerichteVerwalten(){
        gerichteliste.printAll();
        System.out.println("Was möchten sie tun? a(add)/d(delete)/e(edit)/n(nothing)");

        Scanner scanner2 = new Scanner(System.in);
        String gerichtoperation = scanner2.nextLine();

        switch (gerichtoperation) {
            case "d":
                System.out.println("Welches Gericht soll von der Speisekarte entfrnt werden? (Name als String)");
                Scanner scannerGerichtD = new Scanner(System.in);
                String name = scannerGerichtD.nextLine();
                if (gerichteliste.contains(gerichteliste.findByName(name))){
                    gerichteliste.deleteByName(name);
                }
                else
                    System.out.println("Dieses Gericht existiert nicht auf der Speisekarte!");
                    System.out.println();
                gerichteVerwalten();
                break;
            case "a":
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
                if (anzahl < 1){
                    throw new IllegalArgumentException("Es sind nur Werte größer als 0 erlaubt!");
                }
                Gericht gericht = new Gericht(name2, preis, anzahl);
                gerichteliste.add(gericht);
                menuAdmin();
                break;
            case "e":
                System.out.println("Welches Gericht möchten Sie bearbeiten? (Name als String)");
                Scanner scannerGerichtB = new Scanner(System.in);
                String name3 = scannerGerichtB.nextLine();
                if (gerichteliste.contains(gerichteliste.findByName(name3))){
                    gerichteliste.edit(name3);
                }
                else
                    System.out.println("Dieses Gericht exisitiert nicht auf der Speisekarte!");
                    System.out.println();
                gerichteVerwalten();
                break;
            case "n":
                menuAdmin();
            default:
                gerichteVerwalten();
        }
    }

    public void mitarbeiterVerwalten(){
        angestelltenListe.printAll();
        System.out.println("Was möchten sie tun? a(add)/d(delete)/e(edit)/n(nothing)");
        Scanner scanner3 = new Scanner(System.in);
        String mitarbeiteroperation = scanner3.nextLine();

        switch (mitarbeiteroperation) {
            case "d":
                System.out.println("Welcher Mitarbeiter soll von der Liste entfernt werden? (Id angeben)");
                Scanner scannerAID = new Scanner(System.in);
                int idDelete = scannerAID.nextInt();
                if (idDelete < 0){
                    throw new IllegalArgumentException("Es sind keine negativen Werte als ID erlaubt!");
                }
                if (angestelltenListe.contains(angestelltenListe.findById(idDelete))){
                    angestelltenListe.deleteById(idDelete);
                }
                else
                    System.out.println("Es gibt keinen Mitarbeiter mit dieser ID");
                    mitarbeiterVerwalten();
                mitarbeiterVerwalten();
                break;
            case "a":
                System.out.println("Name:");
                Scanner scannerName = new Scanner(System.in);
                String name2 = scannerName.nextLine();
                System.out.println("ID:");
                Scanner scannerPreis = new Scanner(System.in);
                int idAdd = scannerPreis.nextInt();
                if (idAdd < 0){
                    throw new IllegalArgumentException("Es sind keine negativen Werte als ID erlaubt!");
                }
                System.out.println("Gehalt:");
                Scanner scannerAnzahl = new Scanner(System.in);
                int gehalt = scannerAnzahl.nextInt();
                if (gehalt <= 0){
                    throw new IllegalArgumentException("Es sind keine negativen Werte oder 0 als Gehalt erlaubt!");
                }
                Angestellter angestellter = new Angestellter(idAdd, name2, gehalt);
                angestelltenListe.add(angestellter);
                menuAdmin();
                break;
            case "e":
                System.out.println("Welchen Mitarbeiter in der Liste wollen Sie bearbeiten (ID angeben)");
                Scanner scanner4 = new Scanner(System.in);
                int idEdit = scanner4.nextInt();
                if (idEdit < 0){
                    throw new IllegalArgumentException("Es sind keine negativen Werte als ID erlaubt!");
                }
                if (angestelltenListe.contains(angestelltenListe.findById(idEdit))){
                    angestelltenListe.edit(idEdit);
                }
                else
                    System.out.println("Es gibt keinen Mitarbeiter mit dieser ID");
                    mitarbeiterVerwalten();
                mitarbeiterVerwalten();
                break;
            case "n":
                menuAdmin();
                break;
            default:
                mitarbeiterVerwalten();
        }
    }

    public void bestellen() {
        System.out.println("Bestellen?()y/n");
        Scanner scanner5 = new Scanner(System.in);
        String bestellenYN = scanner5.nextLine();

        switch (bestellenYN) {
            case "y":
                System.out.println("Welches Gericht soll auf die Bestellliste? (Name als String)");
                Scanner scannerBestell = new Scanner(System.in);
                String name = scannerBestell.nextLine();
                if (gerichteliste.contains(gerichteliste.findByName(name))){
                    Gericht gericht = gerichteliste.findByName(name);
                    Gericht gerichtBestellt = new Gericht(gericht.getName(), gericht.getPreis(), 0);
                    System.out.println("Wie viel?");
                    Scanner scannerAB = new Scanner(System.in);
                    int anzahl = scannerAB.nextInt();
                    if (anzahl < 1){
                        throw new IllegalArgumentException("Es sind nur Werte größer als 0 erlaubt!");
                    }
                    else if (anzahl < gericht.getAnzahl()) {
                        bestellliste.bestellen(gerichtBestellt, anzahl);
                        gericht.setAnzahl(gericht.getAnzahl() - anzahl);
                    }
                    else
                        System.out.println("Nicht genug " + gericht.getName() + " verfügbar!");
                        bestellen();
                }
                else
                    System.out.println("Dieses Gericht exisitert nicht auf der Speisekarte");
                    System.out.println();
                    bestellen();
                break;
            case "n":
                menuAdmin();
                break;
            default:
                System.out.println("Nur y oder n erlaubt!");
                bestellen();
                break;

        }
    }

    public void bestellListe(){
        bestellliste.printAll();
        System.out.println();
        System.out.println("Soll die Bestellung so ausgeführt werden? (y/n)");
        Scanner scannerBListe = new Scanner(System.in);
        String bestellungD = scannerBListe.nextLine();
        switch (bestellungD){
            case "y":
                bestellliste.clear();
                menuAdmin();
                break;
            case "n":
                menuAdmin();
                break;
            default:
                System.out.println("Nur y oder n erlaubt!");
                bestellListe();
                break;

        }

    }
}
