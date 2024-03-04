FROM openjdk:21
COPY ./target/classes/ /tmp
WORKDIR /tmp
CMD ["java", "org.example.testservice.Main"]