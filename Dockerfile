FROM openjdk:17
RUN ["mkdir", "project"]
COPY . ./project
RUN ["chmod", "744", "./project/gradlew"]
RUN ["./project/gradlew", "clean", "build"]
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "project/build/lib/*T.jar"]