package gestorfinanzas;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorFinanzas gestor = new GestorFinanzas();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestor de Finanzas ---");
            System.out.println("1. Agregar ingreso");
            System.out.println("2. Agregar gasto");
            System.out.println("3. Ver historial");
            System.out.println("4. Ver balance");
            System.out.println("5. Exportar a HTML");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Monto del ingreso: ");
                    double ingreso = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Descripción: ");
                    String descIngreso = sc.nextLine();
                    gestor.agregarTransaccion("Ingreso", ingreso, descIngreso);
                    break;
                case 2:
                    System.out.print("Monto del gasto: ");
                    double gasto = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Descripción: ");
                    String descGasto = sc.nextLine();
                    gestor.agregarTransaccion("Gasto", gasto, descGasto);
                    break;
                case 3:
                    gestor.mostrarHistorial();
                    break;
                case 4:
                    gestor.mostrarBalance();
                    break;
                case 5:
                    gestor.exportarHTML();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}