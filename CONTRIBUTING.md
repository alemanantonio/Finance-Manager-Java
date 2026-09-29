# Contributing

Thank you for your interest in contributing to Gestor de Finanzas. This document explains the workflow and conventions expected for contributions.

## Workflow

1. Fork the repository and create a branch from `main`.
2. Make your changes, keeping the scope focused on a single objective.
3. Compile the project and verify that the application runs correctly.
4. Commit using clear, descriptive messages.
5. Open a pull request describing the change and its motivation.

## Branch naming

Use a short, descriptive prefix:

- `feature/add-categories` for new functionality
- `fix/empty-balance` for bug fixes
- `docs/readme-update` for documentation changes
- `refactor/transaction-model` for refactoring

## Code conventions

- Follow the existing style of the project (indentation, naming, braces).
- Keep class and method names in Spanish, consistent with the current codebase.
- Avoid external dependencies; the project is pure Java.
- Do not commit compiled files (`*.class`, `out/`, `bin/`) or generated reports (`resumen.html`).
- Do not modify `data/datos.txt` unless the change requires it.

## Reporting issues

When opening an issue, include:

- JDK version and operating system
- Steps to reproduce the problem
- Expected behaviour and actual behaviour
- Stack trace or error output, if available

## Pull request checklist

- [ ] The project compiles without errors
- [ ] The menu options work as expected
- [ ] New or changed behaviour is documented in `README.md` and `README.es.md`
- [ ] No build artifacts or generated files are included
