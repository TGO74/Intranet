package GUI;

import java.util.Date;

import javax.swing.*;
import java.awt.event.ActionEvent;

import modelo.Estudiante;
import modelo.Intranet;

public class VentanaAgregarEstudiante extends Ventana {
    JLabel labelNombre;
    JTextField textFieldNombre;
    JLabel labelEmail;
    JTextField textFieldEmail;
    JLabel labelRut;
    JTextField textFieldRut;
    JButton botonAgregar;

    JLabel labelApellido;

    JTextField textFieldApellido;

    JLabel labelNombreCarrera;

    JTextField textFieldNombreCarrera;

    JLabel labelMatricula;


    JTextField textFieldMatricula;

    JLabel labelNivel;

    JTextField textFieldNivel;


    JLabel labelFechaNacimiento;

    JTextField textFieldFechaNacimiento;

    Intranet intranet = new Intranet();


    void generarElementosVentana() {
        generarLabelsYTextFields();
        generarBotonAgregar();
    }

    void generarLabelsYTextFields() {
        // Código para generar los JLabel y JTextField para nombre, apellido, rut, etc.
       generarJLabel(labelNombre,"Nombre: ", 50, 20, 100, 30);
        add(labelNombre);
        textFieldNombre = generarJTextField(200, 20, 150, 30);
        add(textFieldNombre);


       generarJLabel(labelRut,"Rut:", 50, 100, 100, 30);
        add(labelRut);
        textFieldRut = generarJTextField(200, 100, 150, 30);
        add(textFieldRut);



     generarJLabel(labelMatricula,"Número de matricula:", 50, 220, 100, 30);
        add(labelMatricula);
        textFieldMatricula = generarJTextField(200, 220, 150, 30);
        add(textFieldMatricula);


        labelFechaNacimiento = generarJLabel("Fecha Nacimiento:", 50, 300, 100, 30);
        add(labelFechaNacimiento);
        textFieldFechaNacimiento = generarJTextField(200, 300, 150, 30);
        add(textFieldFechaNacimiento);

        generarJLabel(labelNombreCarrera,"Nombre Carrera:", 50, 140, 100, 30);
        add(labelNombreCarrera);
        textFieldNombreCarrera = generarJTextField(200, 140, 150, 30);
        add(textFieldNombreCarrera);


    }

    void generarBotonAgregar() {
        botonAgregar = generarBoton("Agregar Estudiante", 200, 200, 150, 40);
        add(botonAgregar);
        botonAgregar.addActionListener(this);
    }

    void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAgregar) {
            // Obtencion de paramatros para construir nuevo estudiante
            String nombre = textFieldNombre.getText();
            String apellido = textFieldApellido.getText();
            String rut = textFieldRut.getText();
            String nombreCarrera = textFieldNombreCarrera.getText();
            String ufromail = textFieldEmail.getText();
            String matricula = textFieldMatricula.getText();
            int nivel = Integer.parseInt(textFieldNivel.getText());
            Date fechaNacimiento = textFieldFechaNacimiento.getText();



            // Crea una instancia de Estudiante con los valores obtenidos (String nombre, String apellido, String rut, String nombreCarrera, String ufromail, String matricula, int nivel, Date fechaNacimiento){
            Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, rut, nombreCarrera, ufromail, matricula, nivel, fechaNacimiento);

            // Agrega el estudiante a tu sistema (intranet, lista de estudiantes, etc.)
            intranet.agregarEstudiante(nuevoEstudiante);

            // Puedes mostrar un mensaje de éxito, por ejemplo
            JOptionPane.showMessageDialog(this, "Estudiante agregado con éxito");

            // Cierra la ventana
            this.dispose();
        }
    }
}
