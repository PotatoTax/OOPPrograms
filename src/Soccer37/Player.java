package Soccer37;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        z = 0;
    }

    public void move(float deltaX, float deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public void jump(float deltaZ) {
        this.z += deltaZ;
    }

    public boolean near(Ball ball) {
        return 8 > Math.sqrt(Math.pow(x - ball.getX(), 2) + Math.pow(y - ball.getY(), 2) + Math.pow(z - ball.getZ(), 2));
    }

    public void kick(Ball ball) {

    }
}
