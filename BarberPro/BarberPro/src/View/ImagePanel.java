package View;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
    private Image backgroundImage;

    public ImagePanel(String imagePath) {
        // Carrega a imagem do arquivo
        backgroundImage = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Desenha a imagem de fundo
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
