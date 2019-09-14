public class TestMyPoint24 {
    public static void main(String[] args)
    {
        MyPoint24 p1 = new MyPoint24();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint24 p2 = new MyPoint24(0, 4);
        System.out.println(p2);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());

        MyPoint24[] points =  new MyPoint24[10];
        for (int i = 0; i < points.length; i++)
        {
            points[i] = new MyPoint24();
        }
        for (MyPoint24 p : points)
        {
            System.out.println(p);
        }
    }
}
