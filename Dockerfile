FROM nginx:latest
WORKDIR /Users/alishahome/Documents/Software_Engineering/Exercise-App
COPY . .
ENV JAVA_HOME  /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home
RUN export JAVA_HOME
RUN echo $JAVA_HOME
