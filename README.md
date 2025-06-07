# 💸 Gestor de Finanzas en Java

Aplicación de consola desarrollada en Java para gestionar ingresos y gastos personales, con persistencia en archivos y exportación de reportes a HTML.

## 🧩 Funcionalidades principales

- Registro de ingresos y gastos
- Visualización del historial completo
- Cálculo automático del balance
- Persistencia de datos en archivo `datos.txt`
- Generación de reportes en formato HTML (`resumen.html`)
- Interfaz de consola amigable

## 🛠️ Estructura del proyecto

- `Main.java`: Clase principal que muestra el menú interactivo.
- `GestorFinanzas.java`: Lógica de negocio para manejar transacciones.
- `Transaccion.java`: Representa cada transacción con tipo, monto y descripción.

## 📦 Ejemplo de uso

```java
// Ejemplo de menú en Main.java
System.out.println("1. Agregar ingreso");
System.out.println("2. Agregar gasto");
System.out.println("3. Ver historial");
System.out.println("4. Ver balance");
System.out.println("5. Exportar a HTML");
