package TPs.Tp_3;


import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;



public class Main {
        public static void main(String[] args) {
//            Contact c1 = new Contact("Othman", "othman@gmail.com");
//            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contact.bin"))) {
//                oos.writeObject(c1);
//                System.out.println("✅ L'objet Contact a été enregistré avec succès !");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contact.bin"));
                Contact c = (Contact) ois.readObject();
                System.out.println("Objet lu depuis le fichier : " + c);
                ois.close();
            }
            catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

