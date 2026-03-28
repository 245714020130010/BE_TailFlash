FROM eclipse-temurin:25-jdk AS builder

WORKDIR /app

COPY .mvn .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw

COPY src src
RUN ./mvnw -B -ntp -Dmaven.test.skip=true clean package

FROM eclipse-temurin:25-jre

WORKDIR /app

COPY --from=builder /app/target/BE_TailFlash-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
