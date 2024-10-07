FROM openjdk:17

COPY target/spring-boot-app-1.0.0.jar /usr/app/

WORKDIR /usr/app/

ENTRYPOINT [ "java", "-jar", "spring-boot-app-1.0.0.jar" ]
