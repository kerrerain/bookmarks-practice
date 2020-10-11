# bookmarks-practice

A sandbox web API to practice skills.

## Configuring the test local database

```
cd infra
docker-compose up
docker exec -it bookmarks-postgres createdb -U postgres test
docker cp infra/create-database.sql bookmarks-postgres:/usr/src
docker exec -it bookmarks-postgres psql -U postgres -d test -f /usr/src/create-database.sql
```

## Running the server with docker

Build the Docker image:

```
docker build . -t kerrerain/bookmarks
```

Run docker-compose:

```
docker-compose up
```

Check that the server is up and running at http://localhost:8080.

## Running the server locally

Check that the following tools are installed: 
- Java SDK 11
- Maven 3

Build the executable jar with Maven:

```
mvn package
```

Run the server:

```
java -jar target/bookmarks-1.0-SNAPSHOT.jar
```

Check that the server is up and running at http://localhost:8080.