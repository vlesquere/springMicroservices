FROM frolvlad/alpine-oraclejdk8:full

ARG JAR_FILE

ADD ${JAR_FILE} /usr/share/employeeBackend.jar

ENTRYPOINT ["java", "-jar", "/usr/share/employeeBackend.jar"]