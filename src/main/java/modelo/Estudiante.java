package modelo;
import java.util.ArrayList;
import java.util.Date;

public class Estudiante {

    private String nombre;

    private String rut;


    private ArrayList<String> correos = new ArrayList<String>();


    private String matricula;


    private Date fechaNacimiento;





    public Estudiante(String nombre, String rut, String matricula, Date fechaNacimiento){
        this.nombre = nombre;
        this.rut = rut;
        this.matricula = matricula;
        this.fechaNacimiento = fechaNacimiento;
    }
    //Getters and Setters
public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }





    public String getRut(){
        return this.rut;
    }

    public void setRut(String cedula){
        this.rut = cedula;
    }

    public ArrayList<String> getCorreos(){
        return this.correos;
    }

    public void setCorreos(ArrayList<String> correos){
        this.correos = correos;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }



    @Override
    public String toString(){
        return this.nombre + "," + this.rut + "," + this.matricula + "," + this.fechaNacimiento;
    }

    //Método para calcular la edad del estudiante
    public int calcularEdad(){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - this.fechaNacimiento.getYear();
        return edad;
    }





    




}
