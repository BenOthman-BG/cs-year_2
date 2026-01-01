package Jfram.tp_1;

public abstract class Form {
    private double x;
    private double y;
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public abstract void printFormMsg();
    public abstract double calculateArea();
}

