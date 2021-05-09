FROM openjdk:11-jre-slim-buster
RUN addgroup --gid 10007 filmbooking && \
    adduser --uid 10007 --gid 10007 keith

RUN mkdir -p /app
RUN chown keith /app
USER keith:filmbooking
WORKDIR /app

ADD target/service_discoverer-0.0.1-SNAPSHOT.jar \
    /app/service_discoverer-0.0.1-SNAPSHOT.jar

CMD java -Dserver.port=$PORT $JAVA_OPTS \
    -jar /app/service_discoverer-0.0.1-SNAPSHOT.jar
