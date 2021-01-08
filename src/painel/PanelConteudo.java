package painel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelConteudo extends JPanel {

    public PanelConteudo(JFrame pai) {
        super();
        setOpaque(false);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // setando a cor para um branco semitransparente
        g.setColor(new Color(255, 255, 255, 150));

    }
}
