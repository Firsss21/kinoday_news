FROM openjdk
ADD app.jar /app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=dev -jar","/app.jar"]
