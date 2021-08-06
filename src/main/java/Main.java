import model.Gericht;
import model.Speisekarte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    final static String username = "admin";
    final static String password = "admin";

    static Menu menu = new Menu();

    public static void main(String[] args) {

        login();


    }

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
