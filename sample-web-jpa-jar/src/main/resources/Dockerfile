FROM openjdk:8
ADD target/spring-boot-general.jar spring-boot-general.jar
EXPOSE 9090
#COPY ./start.sh/
#ENTRYPOINT ["/start.sh"]
#CMD["postgres"]
ENTRYPOINT ["sh","-c","java -jar spring-boot-general.jar --spring.profiles.active=dev"]