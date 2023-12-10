package modelo;

import java.util.ArrayList;
import java.util.Date;



public class Carrera {

    private String nombreCarrera;
    private String codigoCarrera;

    private int numeroSemestres;

    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

    public Carrera(String nombreCarrera, String codigoCarrera, int numeroSemestres){
        this.nombreCarrera = nombreCarrera;
        this.codigoCarrera = codigoCarrera;
        this.numeroSemestres = numeroSemestres;
    }

    //Getters and Setters
    public String getNombreCarrera(){
        return this.nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera){
        this.nombreCarrera = nombreCarrera;
    }

    public String getCodigoCarrera(){
        return this.codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera){
        this.codigoCarrera = codigoCarrera;
    }


    public int getNumeroSemestres(){
        return this.numeroSemestres;
    }

public void setNumeroSemestres(int numeroSemestres){
        this.numeroSemestres = numeroSemestres;
    }


    public ArrayList<Estudiante> getEstudiantes(){
        return this.estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes){
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString(){
    return "Carrera: " + nombreCarrera + ", Codigo: " + codigoCarrera + ", Numero de Semestres: " + numeroSemestres;
    }

   //Método existe estudiante en la carrera
   public boolean existeEstudianteCarrera(String nombre){
       for(Estudiante e: estudiantes){
           if(e.getNombre().equals(nombre)){
               return true;
           }
       }
       return false;

    //Método que agrega un estudiante a la carrera, validando que no exista con el método existeEstudiante
    public void agregarEstudianteCarrera(Estudiante estudiante){
        if(!existeEstudianteCarrera(estudiante.getNombre())){
            estudiantes.add(estudiante);
        }

    //Método que elimina un estudiante de la carrera, validando que exista con el método existeEstudiante
    public void eliminarEstudianteCarrera(String nombre){
        if(existeEstudianteCarrera(nombre)){
            for(Estudiante e: estudiantes){
                if(e.getNombre().equals(nombre)){
                    estudiantes.remove(e);
                }
            }
        }

        else {
            System.out.println("El estudiante no existe");
        }
    }

    //Método que busca un estudiante en la carrera, validando que exista con el método existeEstudiante, con el nombre verifica que el rut exista asociado a ese nombre y luego a la carrera
    public Estudiante buscarEstudiante(String nombre, String rut){
        if(existeEstudianteCarrera(rut)){
            for(Estudiante e: estudiantes){
                if(e.getNombre().equals(nombre) && e.getRut().equals(rut)){
                    return e;
                }
            }
        }
        return null;
    }

    //Método que imprime los estudiantes de la carrera

    public void imprimirEstudiantes(){
        for(Estudiante e: estudiantes){
            System.out.println(e.toString());
        }
    }










}
