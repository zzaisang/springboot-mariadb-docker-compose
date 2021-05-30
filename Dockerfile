FROM adoptopenjdk/openjdk11:jre11u-nightly

VOLUME /tmp
#ADD app.jar app.jar
#RUN bash -c 'touch /app.jar'

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ARG SPRING_PROFILES_ACTIVE
RUN echo $SPRING_PROFILES_ACTIVE
ENV SPRING_PROFILES_ACTIVE=$SPRING_PROFILES_ACTIVE
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
