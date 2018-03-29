FROM alpine-jdk:base

COPY /app/gateway.jar /opt/lib/

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/gateway.jar"]
