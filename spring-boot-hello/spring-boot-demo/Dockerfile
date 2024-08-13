FROM maven:3.8.5-openjdk-17

WORKDIR /spring-boot-demo
COPY . .

#RUN ["mvn",  "clean", "compile"]
RUN ["mvn",  "clean",  "install", "-DskipTests"]

CMD ["mvn", "spring-boot:run"]