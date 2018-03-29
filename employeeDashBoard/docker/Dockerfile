FROM alpine-jdk:base

COPY /app/employeeDashboard.jar /opt/lib/

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/employeeDashboard.jar"]
