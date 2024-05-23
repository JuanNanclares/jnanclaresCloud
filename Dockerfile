# Usar una imagen base de JDK
FROM openjdk:21-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar todos los archivos del proyecto al contenedor
COPY . .

# Otorgar permisos de ejecución al script de Gradle
RUN chmod +x ./gradlew

# Construir el proyecto
RUN ./gradlew build

# Exponer el puerto en el que tu aplicación se ejecuta
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "build/libs/app.jar"]

