package Circle11;

public class Circle {
    double getArea()
    {
        return radius*radius*Math.PI;
    }

    double getRadius()
    {
        return radius;
    }

    String getColor()
    {
        return color;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void setColor(String color) {
        this.color = color;
    }

    private double radius;
    private String color;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    Circle()
    {
        this.radius = 1.0;
        this.color = "red";
    }

    Circle(double radius)
    {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }
}
