package Jfram.tp_1;

public class Circle extends Form {
    private double radius;
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    @Override
    public void printFormMsg() {
        System.out.println("Ceci est un cercle.");
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
