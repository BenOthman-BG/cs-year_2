package TPs.Tp_2;

import java.util.ArrayList;

public class Polymor {

    public static void main(String[] args) {
        ArrayList<Form> habibi = new ArrayList<>();
        habibi.add(new Square(10));
        habibi.add(new Circle(3));
        habibi.add(new Triangle(32 ,2));
        habibi.add(new Circle(2.3));

        for (Form ar:habibi){
            ar.printFormMsg();
            System.out.println(ar.calculateArea());
        }


    }
}
