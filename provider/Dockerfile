FROM fabletang/jre8-alpine
ADD ./target/nacos-spring-cloud-config-example-0.2.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
