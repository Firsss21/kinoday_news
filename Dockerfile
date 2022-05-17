FROM openjdk
ADD app.jar /app.jar
ENTRYPOINT ["java","-Xms32m -Xmx128m -jar","/app.jar"]
