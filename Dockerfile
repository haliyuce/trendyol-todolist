FROM openjdk:8

COPY ./target/trendyol-todo-0.0.1-SNAPSHOT.jar spring-boot.jar

CMD java -jar spring-boot.jar