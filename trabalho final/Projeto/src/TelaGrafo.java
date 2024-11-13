import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Component;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;

public class TelaGrafo extends JFrame {

    private Mapa mapa;
    private Mapa.Resultado resultado; // Field to store the result

    public TelaGrafo(Mapa mapa, Mapa.Resultado resultado) {
        this.mapa = mapa;
        this.resultado = resultado; // Store the result when constructing the screen
        this.setTitle("Grafo");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.add(new GrafoPanel());
        this.setVisible(true);
        this.setResizable(false);
    }

    private class GrafoPanel extends JPanel {
        private JComboBox<String> origemComboBox;
        private JComboBox<String> destinoComboBox;
        private JButton calcularButton;
        private JButton exitButton;   

        public GrafoPanel() {
            setLayout(null); // Use absolute positioning


// Aplica a borda aos componentes

            ArrayList<Local> locais = mapa.getNos();
            String[] locaisNomes = locais.stream().map(Local::getNome).toArray(String[]::new);

            origemComboBox = new JComboBox<>(locaisNomes);
            destinoComboBox = new JComboBox<>(locaisNomes);
            calcularButton = new JButton("Calcular Caminho");
            exitButton = new JButton("X");

            // Position the components
            exitButton.setBounds(1860, 10, 50, 50);
            origemComboBox.setBounds(1600, 890, 300, 50);
            destinoComboBox.setBounds(1600, 950, 300, 50);
            calcularButton.setBounds(1600, 1010, 300, 50);

            DefaultListCellRenderer customRenderer = new DefaultListCellRenderer() {
                @Override
                public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                    JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                    if (isSelected) {
                        label.setBackground(new Color(0, 43, 83)); // Highlight background
                        label.setForeground(Color.WHITE);         // Highlight text
                    } else {
                        label.setBackground(Color.WHITE);          // Normal background
                        label.setForeground(Color.BLACK);          // Normal text
                    }
                    return label;
                }
            };
            origemComboBox.setRenderer(customRenderer);
            destinoComboBox.setRenderer(customRenderer);


            destinoComboBox.setBackground(Color.WHITE);
            destinoComboBox.setForeground(Color.BLACK);

            origemComboBox.setBackground(Color.WHITE);
            origemComboBox.setForeground(Color.BLACK);
            
            calcularButton.setBackground(Color.WHITE);
            calcularButton.setForeground(Color.BLACK);

            exitButton.setBackground(Color.RED);
            exitButton.setForeground(Color.WHITE);
            exitButton.setFont(new Font("Arial", Font.BOLD, 24));

            //Rafa ta aqui fazendo merda de novo 
            
            JPanel backgroundPanel = new JPanel();
            backgroundPanel.setBackground(new Color(0, 43, 83)); // Light gray color
            backgroundPanel.setBounds(1580, 870, 360, 220); // Slightly larger to provide padding around components
            backgroundPanel.setLayout(null); 

            add(backgroundPanel);
            add(origemComboBox);
            add(destinoComboBox);
            add(calcularButton);
            add(exitButton);

            setComponentZOrder(backgroundPanel, getComponentCount() - 1);
            setComponentZOrder(origemComboBox, 0);
            setComponentZOrder(destinoComboBox, 1);
            setComponentZOrder(calcularButton, 2);
            setComponentZOrder(exitButton, 3);



            setLayout(null);
            repaint();
            revalidate();

            calcularButton.addActionListener(e -> {
                String origemNome = (String) origemComboBox.getSelectedItem();
                String destinoNome = (String) destinoComboBox.getSelectedItem();

                Local origem = locais.stream().filter(l -> l.getNome().equals(origemNome)).findFirst().orElse(null);
                Local destino = locais.stream().filter(l -> l.getNome().equals(destinoNome)).findFirst().orElse(null);
                System.out.println(resultado);
                if (origem != null && destino != null) {
                    resultado = mapa.calculaMenorDistancia(origem, destino);
                    repaint();
                }
                
            });
            exitButton.addActionListener(e -> {
                System.exit(0);
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Image backgroundImage = new ImageIcon("lib\\tinywow_mapa-campus-2022-291705_69169318_1.png").getImage();
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(4));
            g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

            // Draw the graph
            ArrayList<Local> locais = mapa.getNos();
            ArrayList<Rota> rotas = mapa.getRotas();
            
            // Deixando a linha mais grossa
                


            // Draw edges
            g2d.setColor(Color.BLACK);
            for (Rota rota : rotas) {
                Local origem = rota.getOrigem();
                Local destino = rota.getDestino();
                g2d.drawLine(origem.getX(), origem.getY(), destino.getX(), destino.getY());
            }

            // Draw nodes
            for (Local local : locais) {
                if (resultado.getCaminho().contains(local)) {
                    g2d.setColor(Color.GREEN); // Color nodes in the shortest path green
                } else {
                    g2d.setColor(Color.RED); // Color other nodes red
                }
                g2d.fillOval(local.getX() - 10, local.getY() - 10, 20, 20);
                g2d.setColor(Color.BLACK); // Set text color to black
            }

            // Draw the shortest path in green
            g2d.setColor(Color.GREEN);
            if (resultado.getCaminho().size() > 1) { // If there is a path
                for (int i = 0; i < resultado.getCaminho().size() - 1; i++) {
                    Local ponto1 = resultado.getCaminho().get(i);
                    Local ponto2 = resultado.getCaminho().get(i + 1);
                    g2d.drawLine(ponto1.getX(), ponto1.getY(), ponto2.getX(), ponto2.getY());
                }
            }
        }
    }
}
