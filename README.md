# Open Tour 2022 - Hello World app

Simple Hello World app using Java 11 and Javalin framework.

## Unit tests

Run the unit tests with:  

`./mvnw clean test`

## Build

Build the app with Java 11 or higher:  

`./mvnw clean package`

## Run

The build command (see above) creates a runnable jar with dependencies. Run with:  

`java -jar hello-1.0-SNAPSHOT-jar-with-dependencies.jar`

## Environment Variables

The default port is 8080. It can be overwritte using the environment variable **PORT**.

## Endpoints

The app has to endpoints:

* "/" -> Returning a Hello message
* "/health" -> for Kubernetes readiness and liveness probes

## Run with Docker / Podman

`podman build -t opentour-hello .`  
`podman run --name opentour-hello -p 8080:8080 opentour-hello`
