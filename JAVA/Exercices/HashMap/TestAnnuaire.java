package Jfram.ok;

//Programme principal
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TestAnnuaire {
    public static void main(String[] args) {
        PhoneBook annuaire = new
        PhoneBook();
        Scanner sc = new
        Scanner(System.in);
        annuaire.printAll();
        System.out.print("\nEntrez le nom du contact à rechercher : ");
        String nom = sc.nextLine();
        sc.close();
        String numero = annuaire.findContact(nom);
        System.out.println("Numéro de " + nom + " : " + numero);
    }
}