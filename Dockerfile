FROM openjdk:11-jre-slim
RUN useradd --create-home -s /bin/bash sb
ADD build/libs/springboot-docker-kubernetes-0.0.1.jar /home/sb/app.jar
WORKDIR /home/sb
USER sb
EXPOSE 8080
ENTRYPOINT ["java","-jar","./app.jar"]
