package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.text.InternationalFormatter;

public  abstract class Ventana extends JFrame implements ActionListener {

    Font fuenteTitulo = new Font("Calibri", 3, 20);
    Font fuenteTexto = new Font("Calibri", 1, 14);

    void inicializarVentana(String nombre, int largoX, int largoY) {
        setTitle(nombre);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(largoX, largoY);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
    }

    JLabel generarJLabelEncabezado(String texto, int posicionX, int posicionY, int largoX, int largoY) {
        JLabel label = new JLabel(texto);
        label.setBounds(posicionX, posicionY, largoX, largoY);
        label.setFont(fuenteTitulo);
        return label;
    }

    JButton generarBoton(String texto, int posicionX, int posicionY, int largoX, int largoY) {
        JButton boton = new JButton(texto);
        boton.setBounds(posicionX, posicionY, largoX, largoY);
        boton.setFont(fuenteTexto);
        return boton;
    }

    void generarJLabel(JLabel label, String texto, int posicionX, int posicionY, int largoX, int largoY) {
        label.setText(texto);
        label.setBounds(posicionX, posicionY, largoX, largoY);
        label.setFont(fuenteTexto);
        add(label);
    }

    JFormattedTextField generarJFormattedTextField(InternationalFormatter formato, int posicionX, int posicionY, int largoX, int largoY) {
        JFormattedTextField textField = new JFormattedTextField(formato);
        textField.setBounds(posicionX, posicionY, largoX, largoY);
        return textField;
    }

    InternationalFormatter generarFormato(int minimo, int maximo) {
        InternationalFormatter formato = new InternationalFormatter();
        formato.setMinimum(minimo);
        formato.setMaximum(maximo);
        return formato;
    }

    JTextField generarJTextField(int posicionX, int posicionY, int largoX, int largoY) {
        JTextField textField = new JTextField();
        textField.setBounds(posicionX, posicionY, largoX, largoY);
        return textField;
    }

    JRadioButton generarJRadioButton(String texto, int posicionX, int posicionY, int largoX, int largoY) {
        JRadioButton boton = new JRadioButton(texto);
        boton.setBounds(posicionX, posicionY, largoX, largoY);
        return boton;
    }

    JComboBox generarListaDesplegable(Object[] datosLista, int posicionX, int posicionY, int largoX, int largoY) {
        JComboBox lista = new JComboBox(datosLista);
        lista.setBounds(posicionX, posicionY, largoX, largoY);
        return lista;
    }

    public abstract void actionPerformed(ActionEvent e);
}
