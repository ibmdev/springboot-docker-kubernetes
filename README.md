# springboot-docker-kubernetes

# Lignes de commande

# Pull an image from Docker Registry

> docker pull IMAGE-NAME:VERSION 

# Build an image

> docker build .

# Tag an image  

> docker buid . -t IMAGE_TAG

# Running an image == deploy an image into container and start 

> docker run --name CONTAINER_NAME -p PORT_CONTAINER:PORT_OUTPUT IMAGE_NAME 
 
# List of images

> docker images / docker image ls

# List of containers running

> docker ps

# Start and stop Containers

> docker start CONTAINER_NAME
> docker stop CONTAINER_NAME

# Delete Containers

> docker rm CONTAINER_NAME

# List of 3 networks containers 

> docker network ls




