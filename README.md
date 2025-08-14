# hello-java

Simple Spring Boot app that returns:

> Hello this is pavanreddy welcome to my page

## Files included
- pom.xml
- src/main/java/com/example/hello/Application.java
- src/main/java/com/example/hello/HelloController.java
- Dockerfile
- .dockerignore
- k8s/deployment.yaml
- k8s/service.yaml
- Jenkinsfile

## Quick local steps
1. `mvn -B -DskipTests clean package`
2. `docker build -t pavanreddy-hello:local .`
3. `minikube start --driver=docker`
4. `minikube image load pavanreddy-hello:local`
5. `kubectl apply -f k8s/`
6. `minikube service hello-service --url`
