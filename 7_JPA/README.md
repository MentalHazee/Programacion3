Spring

    Es un framework (marco de trabajo) que facilita el desarrollo de aplicaciones, sobre todo aplicaciones empresariales y web.
    Su función principal es simplificar el código repetitivo y tener un código más organizado, modular y fácil de mantener.

    Lo primero que se debe realizar a la hora de crear un proyecto es entrar a https://start.spring.io/ (Spring initializr)
    y seleccionar todos los parametros acordes a nuestro proyecto. Como la versión de Java del sistema, tipo de proyecto
    (Gradle - Groovy, Gradle - Kotlin o Maven), el lenguaje y las versiones de Spring. A su vez en Artifact podemos especificar
    el nombre de la carpeta de nuestro proyecto. Una vez configurado eso, podremos instalar las dependencias. Las que usamos
    en el cursado son:

      - Spring Web
      - Spring Boot Dev Tools
      - Lombok
      - Spring Data JPA
      - PostgreSQL Driver (o la app de BD que usemos)

    A la hora de abrir el proyecto que nos descarga, se debe crear el siguiente orden de carpetas dentro de la carpeta java: 
    
    mi-proyecto-spring/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml                  # Archivo de configuración de Maven (dependencias, build, etc.)
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── ejemplo/
    │   │   │           └── miproyecto/
    │   │   │               ├── MiProyectoApplication.java   # Clase principal (entry point)
    │   │   │               ├── controller/                  # Controladores REST
    │   │   │               ├── model/                       # Entidades o clases del dominio
    │   │   │               ├── repository/                  # Interfaces que manejan la persistencia (DAO)
    │   │   │               └── service/                     # Lógica de negocio
    │   │   └── resources/
    │   │       ├── application.properties                   # Configuración del proyecto
    │   │       ├── static/                                  # Archivos estáticos (CSS, JS, imágenes)
    │   │       ├── templates/                               # Plantillas HTML (si usás Thymeleaf, por ejemplo)
    │   │       └── banner.txt                               # Banner opcional al iniciar la app
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── ejemplo/
    │                   └── miproyecto/
    │                       └── MiProyectoApplicationTests.java  # Pruebas unitarias
    └── target/                   # (Se genera al compilar, no se toca)


    Otra configuración es el de application.properties dentro de resources:

    spring.datasource.driver-class-name=org.postgresql.Driver              # Driver JDBC para PostgreSQL
    spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect   # Dialecto de Hibernate para PostgreSQL
    spring.jpa.hibernate.ddl-auto=update                                   # Actualiza tablas según las entidades
    spring.jpa.show-sql=true                                               # Muestra las consultas SQL en consola
    spring.datasource.url=jdbc:postgresql://localhost:5432/mydb            # URL de conexión a la base de datos
    spring.datasource.username=postgres                                    # Usuario de la base de datos
    spring.datasource.password=1941                                        # Contraseña del usuario

    
