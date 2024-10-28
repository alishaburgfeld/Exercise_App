Information on 8080 user/password was found here: https://stackoverflow.com/questions/37285016/what-is-username-and-password-when-starting-spring-boot-with-tomcat

curl http://localhost:8080 isn't working - but logging into it on a browser does show the hello world

springboot tutorial: https://spring.io/guides/gs/spring-boot

deploying a hello world in kubernetes: https://www.youtube.com/watch?v=XltFOyGanYE

this will be helpful when setting up my initial mysql database and table:
docker + mysql + docker: https://www.javainuse.com/devOps/docker/docker-mysql

springboot + java + minikub k8s: https://www.youtube.com/watch?v=cvi3pMelCV0
https://www.youtube.com/watch?v=0GgBi8yNQT4

<!--


 -->

minikube location: /opt/homebrew/bin/minikube

To run application:

1. Start Docker: Open Docker Desktop on mac
   -- possible way to hide the desktop, try this next time: https://stackoverflow.com/questions/64533789/how-to-start-docker-desktop-with-a-cli-command-on-macos-without-showing-dashboar
2. Start Minikube: minikube start --driver=docker
 <!-- if image and or container don't exist doesnt exist  then do steps 3-4-->
3. Build the image: docker build -t myimage:1.0 .
4. get docker image id: docker images
5. docker container run --name exercise-app-container -p 8000:8000 -d <docker image id>
6. exec into your docker container: docker exec -it exercise-app-container sh
7. ./mvnw spring-boot:run

Things I have learned:

Docker:
-to delete docker image = docker rmi <image id>
-to delete docker container = first stop it. docker stop <container name> then docker rm <container name>
-to see all containers (even stopped ones) = docker ps -a
-“Dockerfile” is the instructions for building a container image. https://www.youtube.com/watch?v=LQjaJINkQXY

-“docker-compose.yml” is a configuration for launching containers from images. The “services” defined in your docker-compose file can either use a pre-built image that’s pulled from a repository, or can point to a Dockerfile to initiate a build.

-which dockerfile to use? https://www.techtarget.com/searchitoperations/tip/Choose-the-best-Docker-image-for-the-job-at-hand

-java home not found error: https://stackoverflow.com/questions/18144660/what-is-path-of-jdk-on-mac
/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home

SpringBoot:
-In Spring Boot, port 8080 is the default port that the embedded Tomcat server uses to serve web applications. When you run a Spring Boot application without specifying a port, it automatically starts on port 8080 by default
