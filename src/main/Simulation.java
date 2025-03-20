import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simulation {
    public static void main(String[] args) {
        World world = new World(20, 15);  // Création du monde 20x15

        // Ajouter 5 créatures
        for (int i = 0; i < 5; i++) {
            world.addCreature(new Creature((int)(Math.random() * 20), (int)(Math.random() * 15), world));
        }

        JFrame frame = new JFrame("Simulation d'IA - Monde 2D");
        WorldPanel panel = new WorldPanel(world);
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Animation : déplacement des créatures toutes les 500ms
        Timer timer = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Creature c : world.getCreatures()) {
                    c.move();
                }
                panel.repaint();
            }
        });

        timer.start();
    }
}
