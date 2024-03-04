FROM openjdk:21
COPY ./out/production/cicd-backend/ /tmp
WORKDIR /tmp
CMD ["java", "com.cicd.testservice.Main"]