public class MyPoint24 {
    private int x;
    private int y;

    public MyPoint24() {
        x = 0;
        y = 0;
    }

    public MyPoint24(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY()
    {
        int[] l = new int[2];
        l[0] = x;
        l[1] = y;
        return l;
    }

    public void setXY(int x, int y)
    {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "(" + x +
                ", " + y +
                ")}";
    }

    public double distance(int x, int y)
    {
        return Math.sqrt((this.x - x)^2 + (this.y - y)^2);
    }

    public double distance(MyPoint24 point)
    {
        return Math.sqrt((this.x - point.getX())^2 + (this.y - point.getY())^2);
    }

    public double distance()
    {
        return Math.sqrt(this.x^2 + this.y^2);
    }
}
