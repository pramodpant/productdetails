FROM openjdk:8-jdk-alpine
MAINTAINER ppant
RUN mkdir /app
WORKDIR /app
COPY /target/GetProductDetails-v0.1.jar gpd.jar
CMD java -jar gpd.jar