package Lab5_Q1;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        color = "white";
        filled = false;
        //super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        final double pi = Math.PI;
        double area = pi * getRadius();
        return area;
    }

    public double getDiameter() {
        double diameter = 2 * getRadius();
        return diameter;
    }

    public void printCircle() {
    }
}