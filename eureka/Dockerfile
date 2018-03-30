FROM frolvlad/alpine-oraclejdk8:full

ARG JAR_FILE

ADD ${JAR_FILE} /usr/share/eureka.jar

ENTRYPOINT ["java", "-jar", "/usr/share/eureka.jar"]