FROM eclipse-temurin:17-jdk-alpine AS builder
WORKDIR /app
COPY target/structure-microservice-1.0.0.jar app.jar

FROM gcr.io/distroless/java17-debian11
WORKDIR /app
COPY --from=builder /app/app.jar app.jar

ENV NOMBRE_MICROSERVICIO=structure-microservice \
    MONGO_USERNAME=sistemajass \
    MONGO_PASSWORD=ZC7O1Ok40SwkfEje \
    MONGO_DATABASE=JASS_DIGITAL \
    SERVER_PORT=8086


EXPOSE 8086
ENTRYPOINT ["java", "-jar", "app.jar"]
