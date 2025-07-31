# Usa una imagen base de Java (JDK 17 es común para Spring Boot 3.x)
FROM eclipse-temurin:17-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR construido al contenedor
COPY target/structure-microservice.jar app.jar

# Expone el puerto configurado por defecto (puede cambiarse por la variable de entorno SERVER_PORT)
EXPOSE 8086

# Define variables de entorno por defecto (puedes sobreescribirlas en docker-compose o en tiempo de ejecución)
ENV NOMBRE_MICROSERVICIO=structure-microservice \
    MONGO_USERNAME=sistemajass \
    MONGO_PASSWORD=ZC7O1Ok40SwkfEje \
    MONGO_DATABASE=JASS_DIGITAL \
    SERVER_PORT=8086

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "app.jar"]
