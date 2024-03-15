package IGU;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla extends JFrame {
    private JPanel panel1;
    private JTextField textoCopiado;
    private JButton copiarButton;
    private JLabel copiadoraLabel;
    private JLabel ingreseUnTextoLabel;
    private JLabel elTextoQueUdLabel;
    private JTextField textoIngresado;
    private JButton borrarButton;

    public Pantalla() {
        try {
            // Set Look and Feel
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Initialize components here
        panel1 = new JPanel();
        textoCopiado = new JTextField(20);
        copiarButton = new JButton("Copiar");
        copiadoraLabel = new JLabel("Copiadora de textos");
        ingreseUnTextoLabel = new JLabel("Ingrese un texto: ");
        elTextoQueUdLabel = new JLabel("El texto que Ud. ingresó: ");
        textoIngresado = new JTextField(20);
        borrarButton = new JButton("Borrar");

        // Set layout manager for the panel
        panel1.setLayout(new GridBagLayout());

        // Set font and alignment for copiadoraLabel
        Font titleFont = new Font("Arial", Font.BOLD, 18);
        copiadoraLabel.setFont(titleFont);
        copiadoraLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create GridBagConstraints for text fields and labels
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Add copiadoraLabel
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(copiadoraLabel, gbc);

        // Add a blank cell
        gbc.gridx++;
        panel1.add(new JLabel(), gbc);

        // Move to the next row
        gbc.gridy++;

        // Add ingreseUnTextoLabel
        panel1.add(ingreseUnTextoLabel, gbc);

        // Move to the next row
        gbc.gridy++;

        // Add textoIngresado
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textoIngresado, gbc);

        // Move to the next row
        gbc.gridy++;

        // Add copíarButton
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        panel1.add(copiarButton, gbc);

        // Add action listener to copiarButton
        copiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copiarBotonActionPerformed(e);
            }
        });

        // Move to the next row
        gbc.gridy++;

        // Add elTextoQueUdLabel
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(elTextoQueUdLabel, gbc);

        // Move to the next row
        gbc.gridy++;

        // Add textoCopiado
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textoCopiado, gbc);

        // Move to the next row
        gbc.gridy++;

        // Add borrarButton
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        panel1.add(borrarButton, gbc);

        // Add action listener to borrarButton
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrarBotonActionPerformed(e);
            }
        });

        // Add the panel to the frame
        add(panel1);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Copiadora");
        setSize(260, 290);
        setLocationRelativeTo(null);
    }

    private void copiarBotonActionPerformed(ActionEvent evt) {
        String textoACopiar = textoIngresado.getText();
        textoCopiado.setText(textoACopiar);
    }

    private void borrarBotonActionPerformed(ActionEvent evt) {
        textoIngresado.setText("");
        textoCopiado.setText("");
    }
}