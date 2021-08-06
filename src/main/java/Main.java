import java.util.Scanner;

/**
 * Main Klasse
 * @author Ilja Kalistratov
 */
public class Main {

    final static String username = "admin";
    final static String password = "admin";

    static Menu menu = new Menu();

    /**
     * Main Methode
     * @param args Argumente
     */
    public static void main(String[] args) {

        login();


    }

    /**
     * LoginMethode um Zugriff auf das System zu bekommen.
     * Anmeldename: admin , Passwort: admin
     */
    public static void login(){
        System.out.println("Wollen Sie sich als Administrator einloggen? (y/n)");

        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();

        if (eingabe.equals("y")){
            System.out.println("username:");
            Scanner scanner2 = new Scanner(System.in);
            String eingabeUsername = scanner2.nextLine();

            System.out.println("password:");
            Scanner scanner3 = new Scanner(System.in);
            String eingabePassword = scanner3.nextLine();

            if (eingabeUsername.equals(username) && eingabePassword.equals(password)){
                menu.menuAdmin();
            }
            else{
                System.out.println("Falsche Anmeldedaten");
                login();
            }
        }
        else if (eingabe.equals("n")){
            System.exit(0);
        }
        else
            login();
    }




}
