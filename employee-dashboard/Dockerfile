FROM frolvlad/alpine-oraclejdk8:full

ARG JAR_FILE

ADD ${JAR_FILE} /usr/share/employeeDashboard.jar

ENTRYPOINT ["java", "-jar", "/usr/share/employeeDashboard.jar"]