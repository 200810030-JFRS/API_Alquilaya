API-Alquilaya — Proyecto SOA
1. Descripción del proyecto
API-Alquilaya es un proyecto desarrollado para la asignatura de Arquitectura Orientada a Servicios (SOA). Su objetivo es exponer servicios mediante una API REST para gestionar la información correspondiente al dominio de alquiler de vehículos y sus recursos asociados.

El proyecto utiliza Java y Spring Boot para implementar la lógica del servidor, Spring Data JPA para el acceso a datos y MySQL como sistema de gestión de bases de datos.

Estado del proyecto: [En desarrollo / Funcional, según las pruebas realizadas].

2. Funcionalidades
Consulta y gestión de vehículos, según las operaciones implementadas.

Consulta y gestión de clientes, según las operaciones implementadas.

Consulta y gestión de alquileres y sus registros asociados.

Persistencia de información en MySQL.

Exposición de endpoints HTTP para la comunicación con el cliente.

Pruebas funcionales mediante Postman.

3. Tecnologías utilizadas
Java: 17.

Spring Boot: 3.2.5.

Maven: administración de dependencias y ejecución.

MySQL: almacenamiento de datos.

Spring Data JPA / Hibernate: persistencia de información.

Postman: pruebas de los endpoints.

Git y GitHub: control de versiones y publicación del código.

Visual Studio Code: entorno de desarrollo.

4. Requisitos previos
Java compatible con la versión de Spring Boot del proyecto (Java 17).

MySQL instalado y en ejecución local.

Configuración previa de las propiedades de conexión a la base de datos en application.properties.

5. Endpoints disponibles y ejemplosGET /vehiculos: Listar todos los vehículos disponibles en el sistema.
6. POST /vehiculos: Registrar un nuevo vehículo enviando los datos en formato JSON.
7. GET /clientes: Listar el registro de clientes.   POST /alquileres: Registrar un nuevo alquiler relacionando un cliente y un vehículo.
8. PUT /alquileres/{id}/devolver: Procesar la devolución del vehículo alquilado.
9.
10. 6. Pruebas realizadas
       Verificación del arranque exitoso de Spring Boot en el puerto 8081 y su conectividad con el esquema MySQL alquilaya.
       Ejecución y comprobación de consultas GET, inserciones (POST) y actualizaciones (PUT) sobre las entidades principales.
       Ajuste del componente de seguridad (SecurityConfig) para permitir el acceso libre a los endpoints durante la fase de desarrollo y pruebas funcionales locales.

7. Verificación y observacionesSe comprobó la correcta creación automática de esquemas y tablas mediante Spring Data JPA Hibernate con la propiedad ddl-auto=update.
          Limitaciones conocidas: El sistema opera en un entorno local de pruebas y carece temporalmente de validaciones estrictas de campos obligatorios o controles avanzados de concurrencia.
