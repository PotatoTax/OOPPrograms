public class SimpleCircle12 {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return radius*radius*Math.PI;
    }

    public double getCircumference()
    {
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "SimpleCircle{" +
                "radius=" + radius +
                '}';
    }

    private double radius;

    public SimpleCircle12(double radius) {
        this.radius = radius;
    }

    public SimpleCircle12()
    {
        this.radius = 1.0;
    }
}
