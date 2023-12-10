package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

import modelo.Intranet;

public class MenuIntranet extends Ventana {
    JLabel textoMenu;
    JButton botonAgregarCarrera;
    JButton botonAgregarEstudiante;
    JButton botonBuscarEstudiante;
    JButton botonSalida;

    Intranet intranet = new Intranet();

    void generarElementosVentana() {
        generarMensajeMenu();
        generarBotonAgregarCarrera();
        generarBotonAgregarEstudiante();
        generarBotonBuscarEstudiante();
        generarBotonSalir();
    }

    void generarMensajeMenu() {
        String textoBienvenida = "Sistema de Intranet";
        generarJLabel(textoMenu, textoBienvenida, 175, 20, 150, 40);
        add(textoMenu);
    }


    void generarBotonAgregarCarrera() {
        String textoBoton = "Agregar Carrera";
        JButton botonAgregarCarrrera = generarBoton(textoBoton, 175, 100, 150, 40);
        add(botonAgregarCarrrera);
        botonAgregarCarrrera.addActionListener(this);

    }

    void generarBotonAgregarEstudiante() {
        String textoBoton = "Agregar Estudiante";
        botonAgregarEstudiante = generarBoton(textoBoton, 175, 180, 150, 40);
        add(botonAgregarEstudiante);
        botonAgregarEstudiante.addActionListener(this);
    }

    void generarBotonBuscarEstudiante() {
        String textoBoton = "Buscar Estudiante";
        botonBuscarEstudiante = generarBoton(textoBoton, 175, 260, 150, 40);
        add(botonBuscarEstudiante);
        botonBuscarEstudiante.addActionListener(this);
    }

    void generarBotonSalir() {
        String textoBoton = "Salir";
        botonSalida = generarBoton(textoBoton, 175, 420, 150, 40);
        add(botonSalida);
        botonSalida.addActionListener(this);
    }

    void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAgregarCarrera) {
            VentanaAgregarCarrera ventanaAgregarCarrera = new VentanaAgregarCarrera();
            ventanaAgregarCarrera.generarElementosVentana();
        } else if (e.getSource() == botonAgregarEstudiante) {
            VentanaAgregarEstudiante ventanaAgregarEstudiante = new VentanaAgregarEstudiante();
            ventanaAgregarEstudiante.generarElementosVentana();
        } else if (e.getSource() == botonBuscarEstudiante) {
            VentanaBuscarEstudiante ventanaBuscarEstudiante = new VentanaBuscarEstudiante();
            ventanaBuscarEstudiante.generarElementosVentana();
        } else if (e.getSource() == botonSalida) {
            System.exit(0);
        }
    }


    }

