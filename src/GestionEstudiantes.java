import java.util.HashMap;
import java.util.Map;

public class GestionEstudiantes {
    private Map<Integer, Estudiante> estudiantes;

    public GestionEstudiantes() {
        estudiantes = new HashMap<>();
    }

    public GestionEstudiantes(Map<Integer, Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Map<Integer, Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Map<Integer, Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    // Método para agregar un estudiante
    public void agregarEstudiante(int id, String nombre) {
        Estudiante estudiante = new Estudiante(id, nombre);
        estudiantes.put(id, estudiante);
        System.out.println("Estudiante agregado: " + estudiante);
    }

    // Método para eliminar un estudiante por su ID
    public void eliminarEstudiante(int id) {
        if (estudiantes.containsKey(id)) {
            Estudiante eliminado = estudiantes.remove(id);
            System.out.println("Estudiante eliminado: " + eliminado);
        } else {
            System.out.println("El estudiante con ID " + id + " no existe.");
        }
    }

    // Método para modificar el nombre de un estudiante
    public void modificarEstudiante(int id, String nuevoNombre) {
        if (estudiantes.containsKey(id)) {
            Estudiante estudiante = estudiantes.get(id);
            estudiante.setNombre(nuevoNombre);
            System.out.println("Nombre actualizado: " + estudiante);
        } else {
            System.out.println("El estudiante con ID " + id + " no existe.");
        }
    }

    // Método para mostrar todos los estudiantes
    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes:");
            for (Estudiante estudiante : estudiantes.values()) {
                System.out.println(estudiante);
            }
        }

    }

}
