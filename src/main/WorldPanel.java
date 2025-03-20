import javax.swing.*;
import java.awt.*;

class WorldPanel extends JPanel {
    private World world;
    private final int TILE_SIZE = 30;  // Taille des cellules

    public WorldPanel(World world) {
        this.world = world;
        setPreferredSize(new Dimension(world.getWidth() * TILE_SIZE, world.getHeight() * TILE_SIZE));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int x = 0; x < world.getWidth(); x++) {
            for (int y = 0; y < world.getHeight(); y++) {
                Biome biome = world.getBiomeAt(x, y);
                g.setColor(biome.getColor());  // Applique la couleur du biome
                g.fillRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);  // Dessine la cellule
                g.setColor(Color.BLACK);
                g.drawRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);  // Contour noir
            }
        }

        // Dessiner les créatures
        for (Creature c : world.getCreatures()) {
            g.setColor(Color.RED);
            g.fillOval(c.getX() * TILE_SIZE + 5, c.getY() * TILE_SIZE + 5, 20, 20);
        }
    }
}
