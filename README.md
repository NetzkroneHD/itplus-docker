## Docker Cheatsheet

![Docker](https://cloudacademy.com/wp-content/uploads/2019/10/Docker-vs..png)

### Wichtige Stichpunkte:
1. Man Startet mit einer Dockerfile. Diese dient als "Blaupause" für die Umgebung in der die Applikation ausgeführt wird.
2. Die Dockerfile wird benutzt, um ein Image zu bauen. Ein quasi Template um die Applikation zu starten
3. Das Image an sich tut nichts, man muss dieses als Container starten.
4. Container sind Stateless

### Image erstellen:  
`docker build [CONTEXT-PATH] -t <image-name>:<version>`

Beispiel:  
* `docker build . -t itplus-simple:local`

### Container starten:  
`docker run [OPTIONS] <image-name>:<version>`

Beispiel:  
* `docker run itplus-simple:local`  
* `docker run -d itplus-simple:local` 

### Alle gestarteten Container:  
`docker ps`

### Container stoppen:  
`docker stop <container-id>`
