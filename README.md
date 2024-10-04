# Proyecto de Herencia en Hibernate con Spring Boot

Este proyecto demuestra cómo implementar y probar tres tipos de mapeos de herencia en Hibernate usando Spring Boot: 
- Una tabla por clase concreta
- Una tabla por subclase
- Una tabla por jerarquía de clases

Cada tipo de mapeo se encuentra en su propio paquete y tiene un conjunto de clases y controladores para probar la funcionalidad.

## Requisitos

- JDK 17 o superior
- Maven
- Postman (o cualquier otra herramienta para hacer solicitudes HTTP)
- IDE como IntelliJ IDEA o Eclipse
- H2 Database (configurada como base de datos en memoria)

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- `ar.com.educacionit.clase3.mapeo.claseconcreta`: Mapeo de herencia usando **una tabla por clase concreta**.
- `ar.com.educacionit.clase3.mapeo.subclase`: Mapeo de herencia usando **una tabla por subclase**.
- `ar.com.educacionit.clase3.mapeo.jerarquia`: Mapeo de herencia usando **una tabla por jerarquía de clases**.
- `ar.com.educacionit.clase3.model`: Clases de cliente.

Cada paquete contiene:
- Clases base (`Vehiculo`, `Auto`, `Camion`, y sus variantes).
- Controladores para crear y consultar vehículos.
- Repositorios para interactuar con la base de datos.

## Configuración

El proyecto usa una base de datos H2 en memoria. La configuración se encuentra en `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
