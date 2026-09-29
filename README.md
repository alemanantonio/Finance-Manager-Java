# Personal Finance Manager

[English](README.md) | [Español](README.es.md)

A command-line application written in Java for tracking personal income and expenses. Transactions are persisted in a plain-text file, and a summary report can be exported to HTML.

## Features

- Record income and expense transactions
- Full transaction history
- Automatic balance calculation
- Persistence in `data/datos.txt`
- HTML report generation (`resumen.html`)
- Simple interactive console menu

## Requirements

- JDK 11 or later
- No external dependencies

## Getting started

Compile from the repository root:

```bash
javac -d out src/module-info.java src/gestorfinanzas/*.java
```

Run the application:

```bash
java -cp out gestorfinanzas.Main
```

Run the commands from the repository root so that the relative paths used for data and reports resolve correctly.

## Usage

```
--- Gestor de Finanzas ---
1. Agregar ingreso
2. Agregar gasto
3. Ver historial
4. Ver balance
5. Exportar a HTML
0. Salir
```

Example session:

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

## Project structure

```
.
├── README.md                 Documentation (English)
├── README.es.md              Documentation (Spanish)
├── CONTRIBUTING.md           Contribution guidelines
├── data/
│   └── datos.txt             Persisted transactions
└── src/
    ├── module-info.java      Module descriptor
    └── gestorfinanzas/
        ├── Main.java             Entry point and console menu
        ├── GestorFinanzas.java   Business logic and persistence
        └── Transaccion.java      Transaction model
```

## Data format

Each line in `data/datos.txt` stores one transaction as semicolon-separated values:

```
Tipo;Monto;Descripcion
Ingreso;1500.0;Salario
Gasto;250.0;Supermercado
```

## Contributing

Contributions are welcome. Read [CONTRIBUTING.md](CONTRIBUTING.md) before opening a pull request.

## License

This project has no explicit license file. All rights reserved by the author unless otherwise stated.
