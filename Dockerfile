FROM openjdk
ADD app.jar /app.jar
ENTRYPOINT ["java","-Xms64M -Xmx64M -jar","/app.jar"]
