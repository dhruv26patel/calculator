# FROM frolvlad/alpine-oraclejdk8:slim
# COPY build/libs/calculator-0.0.1-SNAPSHOT.jar app.jar
# ENTRYPOINT ["java", "-jar", "app.jar"]
FROM gradle:4.4.1-jdk9
WORKDIR /srv 
COPY build.gradle .
COPY src ./src/
CMD gradle build --no-daemon --console plain