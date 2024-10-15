/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        Empleado empleado = new Empleado("Luis Gabriel", "R458", "Desarrollo");
        Cliente cliente = new Cliente("Josuè Nùñez", "G147", "Premium");

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Solicitar Permiso (Empleado)");
            System.out.println("2. Reportar Horas Extra (Empleado)");
            System.out.println("3. Contactar Representante (Cliente)");
            System.out.println("4. Solicitar Información (Cliente)");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    empleado.solicitudPermiso();
                    break;
                case 2:
                    empleado.reporteHorasExtra();
                    break;
                case 3:
                    cliente.contactarRepresentante();
                    break;
                case 4:
                    cliente.solicitarInformacion();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        }

    }
}
