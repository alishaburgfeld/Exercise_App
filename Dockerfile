FROM eclipse-temurin:21
WORKDIR /Users/alishahome/Documents/Software_Engineering/Exercise-App
COPY src/main pom.xml mvnw ./Exercise_App
CMD ["./mvnw", "spring-boot:run"]

FROM node:14 as build
WORKDIR /exercise_react_app
COPY ./exercise_react-app/package.json ./exercise_react-app/package-lock.json ./
RUN npm install
COPY ./exercise_react-app/ ./
RUN npm run build
CMD ["npm", "start"]


# ENV JAVA_HOME  /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home
# RUN export JAVA_HOME
# RUN echo $JAVA_HOME
