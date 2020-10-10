FROM amazoncorretto:11.0.8

WORKDIR /usr/src

COPY ./target/bookmarks-1.0-SNAPSHOT.jar .

ENTRYPOINT ["java", "-jar", "bookmarks-1.0-SNAPSHOT.jar"]