package dato;
import modelo.*;
import java.io.*;
import java.util.Date;





public class GestorDatos {

    public static void leerArchivoEstudiantes(Carrera carrera, String direccionArchivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(direccionArchivo))) {
            String textoArchivo;
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                carrera.getEstudiantes().add(new Estudiante(data[0], data[1], data[2], new Date(data[3])));
            }
        } catch (IOException e) {
            throw new IOException("Error al leer el archivo de libros", e);
        }
    }

    public static boolean registrarDato(Estudiante estudiante, String direccionArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(direccionArchivo, true))) {
            // Si el documento no es nuevo y tiene datos registrados, añadir una nueva línea
            if (new File(direccionArchivo).exists()) {
                bw.newLine();
            }
            bw.write(estudiante.toString());
            return true;
        } catch (IOException e) {
            System.out.println("Error al ingresar estudiante, favor contactar con administrador");
            return false;
        }
    }




}