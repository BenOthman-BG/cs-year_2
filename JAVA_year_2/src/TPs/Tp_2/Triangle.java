package TPs.Tp_2;

public class Triangle extends Form {
    private double height;
    private double base;
    public Triangle(double height, double base) {
        super();
        this.height = height;
        this.base = base;
    }
    @Override
    public void printFormMsg() {
        System.out.println("Ceci est un triangle.");
    }
    @Override
    public double calculateArea() {
        return height * base / 2;
    }
}
