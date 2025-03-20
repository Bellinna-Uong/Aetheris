import java.awt.Color;
import java.util.Random;

class Biome {
    private String name;
    private Color color;

    public Biome(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    // Génération d'un biome aléatoire
    public static Biome getRandomBiome() {
        Biome[] biomes = {
                new Biome("Désert", new Color(237, 201, 175)),  // Beige
                new Biome("Antarctique", new Color(173, 216, 230)),  // Bleu clair
                new Biome("Tropical", new Color(34, 139, 34)),  // Vert foncé
                new Biome("Océan", new Color(0, 105, 148)),  // Bleu océan
                new Biome("Montagne", new Color(139, 137, 137)),  // Gris
                new Biome("Plaine", new Color(144, 238, 144))   // Vert clair
        };

        Random rand = new Random();
        return biomes[rand.nextInt(biomes.length)];
    }
}
