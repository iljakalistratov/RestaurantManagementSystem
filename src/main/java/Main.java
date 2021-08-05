import model.Gericht;
import model.Speisekarte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    final static String username = "admin";
    final static String password = "admin";


    public static void main(String[] args) {

        Menu menu = new Menu();

        if(login()){
            menu.menuAdmin();
        }


    }

    public static boolean login(){
        System.out.println("Wollen Sie sich als Administrator einloggen? (y/n)");

        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();

        if (eingabe.equals("y")){
            System.out.println("username:");
            Scanner scanner2 = new Scanner(System.in);
            String eingabeUsername = scanner.nextLine();

            System.out.println("password:");
            Scanner scanner3 = new Scanner(System.in);
            String eingabePassword = scanner.nextLine();

            if (eingabeUsername.equals(username) && eingabePassword.equals(password)){
                return true;
            }
            else{
                System.out.println("Falsche Anmeldedaten");
                login();
            }
        }
        else if (eingabe.equals("n")){
            return false;
        }
        else
            login();
        return false;
    }




}
