import java.util.ArrayList;
import java.util.List;

class World {
    private int width, height;
    private Biome[][] biomes;
    private List<Creature> creatures;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
        biomes = new Biome[width][height];
        creatures = new ArrayList<>();
        generateBiomes();
    }

    private void generateBiomes() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                biomes[x][y] = Biome.getRandomBiome();
            }
        }
    }

    public void addCreature(Creature c) {
        creatures.add(c);
    }

    public List<Creature> getCreatures() {
        return creatures;
    }

    public boolean isValidPosition(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public Biome getBiomeAt(int x, int y) { return biomes[x][y]; }
}
