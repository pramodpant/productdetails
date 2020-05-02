FROM openjdk:8-jdk-alpine
MAINTAINER ppant
RUN mkdir /app
WORKDIR /app
RUN echo ${basedir}
COPY ${basedir}/GetProductDetails-v1.jar gpd.jar
CMD java -jar gpd.jar
