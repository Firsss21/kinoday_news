FROM openjdk
ADD app.jar /app.jar
ENTRYPOINT ["java","-Xms32M -Xmx128M -jar","/app.jar"]
