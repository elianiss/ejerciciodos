import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú de Gestión de Estudiantes ---");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Ver lista de estudiantes");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Modificar estudiante");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar

            switch (opcion) {
                case 1: // Ingresar estudiante
                    System.out.print("Ingrese el ID del estudiante: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpiar

                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();

                    gestion.agregarEstudiante(id, nombre);
                    break;

                case 2: // Ver lista de estudiantes
                    gestion.mostrarEstudiantes();
                    break;

                case 3: // Eliminar estudiante
                    System.out.print("Ingrese el ID del estudiante que desea eliminar: ");
                    int idEliminar = scanner.nextInt();
                    gestion.eliminarEstudiante(idEliminar);
                    break;

                case 4: // Modificar estudiante
                    System.out.print("Ingrese el ID del estudiante que desea modificar: ");
                    int idModificar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    System.out.print("Ingrese el nuevo nombre del estudiante: ");
                    String nuevoNombre = scanner.nextLine();

                    gestion.modificarEstudiante(idModificar, nuevoNombre);
                    break;

                case 5: // Salir
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }
}