import java.util.Random;

class Creature {
    private int x, y;
    private World world;
    private Random rand = new Random();

    public Creature(int x, int y, World world) {
        this.x = x;
        this.y = y;
        this.world = world;
    }

    public void move() {
        int newX = x + rand.nextInt(3) - 1;  // Déplacement aléatoire (-1, 0, 1)
        int newY = y + rand.nextInt(3) - 1;

        if (world.isValidPosition(newX, newY)) {
            x = newX;
            y = newY;
        }
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
