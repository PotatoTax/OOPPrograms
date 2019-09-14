public class Rectangle13 {
    private float length;
    private float width;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea()
    {
        return width*length;
    }

    public double getPerimeter()
    {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public Rectangle13() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle13(float length, float width) {
        this.length = length;
        this.width = width;
    }
}
