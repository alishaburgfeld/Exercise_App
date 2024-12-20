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

Start Docker: Open Docker Desktop on mac
-- possible way to hide the desktop, try this next time: https://stackoverflow.com/questions/64533789/how-to-start-docker-desktop-with-a-cli-command-on-macos-without-showing-dashboar
Start Minikube: minikube start --driver=docker

<!-- 


 -->

To start the front-end: cd into exercise_react_app and type npm start
go to localhost:3000
to run tests: npm run test ( need to be in the react folder)
<!-- 


 -->

Create React App:
-https://www.freecodecamp.org/news/how-to-build-a-react-project-with-create-react-app-in-10-steps/

<!-- 


 -->

Integrating React with Spring Boot:
-https://stackoverflow.com/questions/69511990/how-to-integrate-spring-boot-with-react
To run application:

1. Start Docker: Open Docker Desktop on mac
   -- possible way to hide the desktop, try this next time: https://stackoverflow.com/questions/64533789/how-to-start-docker-desktop-with-a-cli-command-on-macos-without-showing-dashboar
2. Start Minikube: minikube start --driver=docker
 <!-- if image and or container don't exist doesnt exist  then do steps 3-4-->
<!-- 3. Build the image: docker build -t myimage:1.0 . -->
3. Build both images and container: docker-compose up --build
4. get docker image id: docker images
<!-- 5. docker container run --name exercise-app-container -p 8000:8000 -d <docker image id> -->
6. exec into your docker container: docker exec -it exercise_app-exercise-react-app-1 sh
7. ./mvnw spring-boot:run

Things I have learned:

Docker:
-to delete docker image = docker rmi <image id>
-to delete docker containers: docker compose down
-to delete docker container manually = first stop it. docker stop <container name> then docker rm <container name>
-to see all containers (even stopped ones) = docker ps -a
-to see logs: Docker container logs lb
-“Dockerfile” is the instructions for building a container image. https://www.youtube.com/watch?v=LQjaJINkQXY

-docker cheatsheet: https://www.javainuse.com/devOps/docker/docker-commands-cheat-sheet

-“docker-compose.yml” is a configuration for launching containers from images. The “services” defined in your docker-compose file can either use a pre-built image that’s pulled from a repository, or can point to a Dockerfile to initiate a build.

-which dockerfile to use? https://www.techtarget.com/searchitoperations/tip/Choose-the-best-Docker-image-for-the-job-at-hand

-Info on what to copy into container: https://www.phind.com/search?cache=ahstmilr6cvk07axos43g6jk

SpringBoot:
-In Spring Boot, port 8080 is the default port that the embedded Tomcat server uses to serve web applications. When you run a Spring Boot application without specifying a port, it automatically starts on port 8080 by default
