package modelo;
import java.util.ArrayList;
import java.util.Date;

public class Intranet {

    private ArrayList<Carrera> carreras = new ArrayList<Carrera>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

    public Intranet() {
        this.carreras = new ArrayList<Carrera>();
        this.estudiantes = new ArrayList<Estudiante>();
    }

    public ArrayList<Carrera> getCarreras() {
        return this.carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    //Método que rellena estudiantes, con cada estudiante por carrera
    public void rellenarEstudiantes() {
        for (Carrera c : carreras) {
            estudiantes.addAll(c.getEstudiantes());
        }
    }

    //Método existeCarrera, con el String codigoCarrera
    public boolean existeCarrera(String codigoCarrera) {
        for (int i = 0; i < carreras.size(); i++) {
            if (carreras.get(i).getCodigoCarrera().equals(codigoCarrera)) {
                return true;
            }
        }
        return false;
    }

    //Método buscarCarrera, con el String nombreCarrera
    public Carrera buscarCarrera(String nombreCarrera) {
        for (Carrera c : carreras) {
            if (c.getNombreCarrera().equals(nombreCarrera)) {
                return c;
            }
        }
        return null;
    }


    //Método agregar carrera, con validación con existeCarrera(String codigoCarrera)
    public void agregarCarrera(String nombreCarrera, String codigoCarrera, int numeroSemestres) {
        if (!existeCarrera(codigoCarrera)) {

            Carrera carrera = new Carrera(nombreCarrera, codigoCarrera, numeroSemestres);
            carreras.add(carrera);
        }

        //Método agregar estudiante, con método agregarEstudianteCarrera(Estudiante estudiante) de la clase Carrera.

        public void agregarEstudiante (String nombre, String rut, String matricula, Date fechaNacimiento, String
        nombreCarrera){
            Estudiante estudiante = new Estudiante(nombre, rut, matricula, fechaNacimiento);

            estudiantes.add(estudiante);

            // Asumiendo que tienes un método buscarCarrera en tu clase Intranet
            Carrera carrera = buscarCarrera(nombreCarrera);

            // Asegúrate de manejar el caso en el que carrera sea null si la carrera no se encuentra
            if (carrera != null) {
                carrera.agregarEstudianteCarrera(estudiante);
            } else {
                // Manejo del caso en el que la carrera no se encuentra
                System.out.println("Carrera no encontrada");
            }
        }


        //Método que busca estudiantes por nombre y carrera, con el método buscarEstudiante(String rut) de la clase Carrera.
        public Estudiante buscarEstudiante (String nombre, String nombreCarrera){
            Carrera carrera = buscarCarrera(nombreCarrera);
            return carrera.buscarEstudiante(nombre);
        }

    }
}







