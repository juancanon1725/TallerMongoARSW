## Author

Juan Pablo Poveda Cañon

# Taller 7 - TALLER SPRINGBOOT MONGO NUBE CLIENT REST


Desarrollar una aplicación web que capture la información de un estudiante (Nombre, correo, fecha de nacimiento y programa) usando React, y que guarde estos datos en una base de datos MongoDB en la nube mediante SpringBoot con JDBC y JPA. Además, crear una interfaz web para mostrar todos los usuarios registrados en una tabla.

## Prerequisitos

Maven: Automatiza y estandariza el flujo de vida de la construcción de software.

Git: Administrador descentralizado de configuraciones.

MongoDB: Es una base de datos NoSQL que se destaca por su flexibilidad en el modelado de datos, su capacidad para escalar horizontalmente y su rendimiento en aplicaciones web modernas y en IoT.
 
## Instalación

Clonamos el proyecto TallerMongoARSW donde se encuentra el backend de nuestra aplicación Web.  

```
git clone https://github.com/juancanon1725/TallerMongoARSW.git

cd student-backend

```

## Ejecución

Para compilar el proyecto se debe usar:

```
 mvn clean install
```

Para ejecutar el proyecto utilizamos los comandos:

```
 mvn spring-boot:run 
```

![mvnspringrun](https://github.com/juancanon1725/TallerMongoARSW/assets/98672541/bd7338b5-dfd0-4974-8824-1f991483528f)

Y se conecta con la base de datos en la nube que tiene la configuración de conexión con la base de datos local:

![mongoconection](https://github.com/juancanon1725/TallerMongoARSW/assets/98672541/2065119b-f6fa-46e7-9b41-7a7dd15b5541)

# Repositorio del frontend de la App

[TallerARSWCliente](https://github.com/juancanon1725/TallerMongoCliente.git)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

