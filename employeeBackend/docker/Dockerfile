FROM alpine-jdk:base

COPY /app/employeeBackend.jar /opt/lib/

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/employeeBackend.jar"]
