# CrowdQ API Gateway

## Building docker image
To build the Docker image for the CrowdQ API Gateway, you can use the following command:

```bash
docker build -t crowdq-api-gateway:0.0.1-SNAPSHOT .
```

Specify the desired tag (e.g., `0.0.1-SNAPSHOT`) as needed.

## Tagging the image
To tag the Docker image with a specific version, you can use the following command:

```bash
docker tag crowdq-api-gateway:0.0.1-SNAPSHOT crowdq-api-gateway:latest
```

## Running the Docker container
To run the Docker container for the CrowdQ API Gateway, you can use the following command:

```bash
docker run -d --name crowdq-api-gateway -p 8080:8080 crowdq-api-gateway:0.0.1-SNAPSHOT
```

Although a more appropriate way to run the container would be to use the `docker-compose` file provided in the
`crowdq-infra` project.

This allows for easier management of multiple services and their configurations.

