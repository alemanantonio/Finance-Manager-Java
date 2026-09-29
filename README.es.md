# Gestor de Finanzas Personal

[English](README.md) | [Español](README.es.md)

Aplicación de consola desarrollada en Java para gestionar ingresos y gastos personales. Los datos se guardan en un archivo de texto y se puede exportar un resumen en formato HTML.

## Funcionalidades

- Registro de ingresos y gastos
- Historial completo de transacciones
- Cálculo automático del balance
- Persistencia de datos en `data/datos.txt`
- Generación de reportes en HTML (`resumen.html`)
- Menú interactivo en consola

## Requisitos

- JDK 11 o superior
- Sin dependencias externas

## Puesta en marcha

Compilar desde la raíz del repositorio:

```bash
javac -d out src/module-info.java src/gestorfinanzas/*.java
```

Ejecutar la aplicación:

```bash
java -cp out gestorfinanzas.Main
```

Ejecuta los comandos desde la raíz del repositorio para que las rutas relativas de datos y reportes se resuelvan correctamente.

## Uso

```
--- Gestor de Finanzas ---
1. Agregar ingreso
2. Agregar gasto
3. Ver historial
4. Ver balance
5. Exportar a HTML
0. Salir
```

Ejemplo de sesión:

```
Opción: 1
Monto del ingreso: 1500
Descripción: Salario

Opción: 2
Monto del gasto: 250
Descripción: Supermercado

Opción: 4
Balance total: $1250.0
```

## Estructura del proyecto

```
.
├── README.md                 Documentación (inglés)
├── README.es.md              Documentación (español)
├── CONTRIBUTING.md           Guía de contribución
├── data/
│   └── datos.txt             Transacciones persistidas
└── src/
    ├── module-info.java      Descriptor del módulo
    └── gestorfinanzas/
        ├── Main.java             Punto de entrada y menú
        ├── GestorFinanzas.java   Lógica de negocio y persistencia
        └── Transaccion.java      Modelo de transacción
```

## Formato de datos

Cada línea de `data/datos.txt` almacena una transacción con valores separados por punto y coma:

```
Tipo;Monto;Descripcion
Ingreso;1500.0;Salario
Gasto;250.0;Supermercado
```

## Contribuciones

Las contribuciones son bienvenidas. Consulta [CONTRIBUTING.md](CONTRIBUTING.md) antes de abrir un pull request.

## Licencia

El proyecto no incluye un archivo de licencia. Todos los derechos reservados por el autor salvo indicación en contrario.
