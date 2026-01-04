package Exercices.HashMap;

//La classe PhoneBook

import java.util.HashMap;
import java.util.Map;
public class PhoneBook {
 private Map<String, String> contacts;
 public PhoneBook() {
     contacts = new HashMap<>();
     contacts.put("steve", "+33660123456");
     contacts.put("bill", "+49600112233");
     contacts.put("larry", "+47660232323");
 }
 public String findContact(String nom){
     return contacts.get(nom);
 }
 public void addContact(String nom, String numero) {
     contacts.put(nom, numero);
 }
 public void printAll() {
     System.out.println("*** Liste des contacts ***");
     for (Map.Entry<String, String> e :
             contacts.entrySet()) {
         System.out.println(e.getKey() + " : " + e.getValue());
     }
     System.out.println("***************** ********");
 }
}