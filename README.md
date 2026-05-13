☕ Gourmet Coffee Shop - Console System
Sistema de gestión integral para cafeterías de especialidad y pastelería gourmet.

🇪🇸 Versión en Español

📝 Descripción
Este proyecto es una aplicación de consola desarrollada en Java, diseñada para digitalizar las operaciones de una cafetería. El sistema no solo gestiona el inventario y los pedidos, sino que aplica una arquitectura orientada a la extensibilidad y la seguridad de los datos, utilizando principios avanzados de Programación Orientada a Objetos (POO) y Clean Architecture y Patrones de diseño (Por el momento unicamente se aplica Singleton, pero se proyecta agregar mas patrones para generar eficiencia en el programa).

🛠️ Stack Tecnológico
Lenguaje: Java 17+

Gestor de Dependencias: Maven

Control de Versiones: Git & GitHub

Gestión de Proyectos: GitHub Projects (Tablero Kanban)

🚀 Metodología de Trabajo (Workflow)
Se aplica un flujo de trabajo profesional para simular un entorno de desarrollo real:

Gestión de Tareas: Uso de un tablero Kanban para el seguimiento de funcionalidades.

Estrategia de Ramas: Feature Branching (uso de ramas main, develop y feature/).

Identidad de Desarrollo: Configuración de autores diferenciada para simular entornos de trabajo colaborativo (Dev notebook y Dev escritorio).

📋 Características Implementadas
Arquitectura de Capas: Separación estricta entre modelos, lógica de negocio e interfaz.

Patrones de Diseño: Implementación de Singleton para la gestión de servicios y Estrategias de validación.

Gestión de Excepciones: Robustez mediante excepciones personalizadas (StockInsuficienteException, ProductoNoEncontradoException) para el control de errores de negocio.

Salida Profesional: Generación de Tickets de Venta detallados y alineación de tablas en consola mediante formateo avanzado de Strings.

📂 Estructura del Proyecto
src/main/java/org.example.model: Clases de entidad con jerarquía de herencia (clase base Producto y Persona con sus respectivas subclases especializadas).

src/main/java/org.example.service: Lógica de negocio organizada mediante el principio de inversión de dependencias:

Interfaces (IPedidoService, IProductoService): Definen los contratos y métodos que el sistema debe cumplir.

Implementaciones (PedidoServiceImpl, ProductoServiceImpl): Clases que ejecutan la lógica real. Aplican el Patrón Singleton para garantizar una única instancia de los datos en memoria durante la ejecución.

src/main/java/org.example.exception: Clases de excepciones personalizadas para el control de errores de negocio (Stock, IDs inexistentes).

src/main/java/org.example.Main: Interfaz de usuario interactiva por consola que gestiona el flujo de entrada/salida y la captura de excepciones.

🇺🇸 English Version

📝 Description
This Java-based console application manages daily coffee shop operations. It features advanced inventory tracking, personalized order processing, and error handling, applying OOP principles and Clean Architecture for high maintainability.

🛠️ Tech Stack
Language: Java 17+

Dependency Management: Maven

Version Control: Git & GitHub

Project Management: GitHub Projects (Kanban)

🚀 Workflow
Task Management: GitHub Projects Kanban board.

Branching Strategy: Feature Branching (branches: main, develop, feature/).

Commit Convention: Conventional Commits for clear version history.

📋 Key Features
Singleton Pattern: Ensures consistent state management across the application services.

Custom Exception Handling: Prevents invalid business states, such as negative stock or missing products.

Professional UI Formatting: Use of String.format for clean inventory lists and commercial-grade receipt generation.
