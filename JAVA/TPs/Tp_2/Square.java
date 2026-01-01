package Jfram.tp_1;

public class Square extends Form {
    private double side;
    public Square(double side) {
        super();
        this.side = side;
    }
    @Override
    public void printFormMsg() {
        System.out.println("Ceci est un carré.");
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
}
