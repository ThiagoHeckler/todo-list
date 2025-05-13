# Usa imagem oficial do Java
FROM eclipse-temurin:17-jdk

# Define diretório de trabalho
WORKDIR /app

# Copia tudo para dentro da imagem
COPY . .

# Dá permissão e compila
RUN chmod +x mvnw && ./mvnw clean package

# Expõe a porta
EXPOSE 8080

# Inicia a aplicação
CMD ["java", "-jar", "target/todolist-0.0.1-SNAPSHOT.jar"]
