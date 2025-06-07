package gestorfinanzas;

import java.io.*;
import java.util.*;

public class GestorFinanzas {
	private List<Transaccion> transacciones = new ArrayList <>();
	private final String archivo = "datos.txt";
	
	public GestorFinanzas() {
		cargarTransacciones();
	}
	
	public void agregarTransaccion (String tipo, double monto, String descripcion) {
		Transaccion t = new Transaccion (tipo,monto,descripcion);
		transacciones.add(t);
		guardarTransaccion(t);
	}
	
	public void mostrarHistorial() {
        System.out.println("\nHistorial de Transacciones:");
        for (Transaccion t : transacciones) {
            System.out.println(t);
        }
    }
	
	public void mostrarBalance() {
        double balance = 0;
        for (Transaccion t : transacciones) {
            if (t.getTipo().equalsIgnoreCase("Ingreso")) {
                balance += t.getMonto();
            } else {
                balance -= t.getMonto();
            }
        }
        System.out.println("\nBalance total: $" + balance);
    }
	
	private void guardarTransaccion(Transaccion t) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(t.getTipo() + ";" + t.getMonto() + ";" + t.getDescripcion());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar la transacción.");
        }
    }
	
	private void cargarTransacciones() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 3) {
                    transacciones.add(new Transaccion(partes[0], Double.parseDouble(partes[1]), partes[2]));
                }
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
	
	public void exportarHTML() {
	    try (PrintWriter writer = new PrintWriter("resumen.html")) {
	        writer.println("<!DOCTYPE html>");
	        writer.println("<html><head><title>Resumen de Finanzas</title></head><body>");
	        writer.println("<h1>Historial de Finanzas</h1>");
	        writer.println("<table border='1' cellpadding='5'>");
	        writer.println("<tr><th>Tipo</th><th>Monto</th><th>Descripción</th></tr>");

	        for (Transaccion t : transacciones) {
	            writer.println("<tr>");
	            writer.println("<td>" + t.getTipo() + "</td>");
	            writer.println("<td>$" + t.getMonto() + "</td>");
	            writer.println("<td>" + t.getDescripcion() + "</td>");
	            writer.println("</tr>");
	        }

	        writer.println("</table>");

	        double balance = 0;
	        for (Transaccion t : transacciones) {
	            if (t.getTipo().equalsIgnoreCase("Ingreso")) {
	                balance += t.getMonto();
	            } else {
	                balance -= t.getMonto();
	            }
	        }
	        writer.println("<h2>Balance total: $" + balance + "</h2>");

	        writer.println("</body></html>");
	        System.out.println("Archivo HTML generado con éxito: resumen.html");
	    } catch (IOException e) {
	        System.out.println("Error al generar HTML: " + e.getMessage());
	    }
	}
}
