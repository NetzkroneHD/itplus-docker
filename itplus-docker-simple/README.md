## Dockerfile Cheatsheet
`FROM <Docker-image>`  
→ spezifiziert das Base-Image  
Beispiel: `FROM tomcat:11.0.0-jre21-temurin`

`WORKDIR <path>`  
→ Erstellt einen Order & führt `cd <path>` aus  
→ Jeder ausgeführte Befehl wird in diesem Pfad ausgeführt  
Beispiel: `WORKDIR /home/app`

`RUN <command>`  
→ Führt Befehle in dem jeweiligen Terminal aus  
Beispiel: `RUN apt update`

`COPY <from> <to>`  
→ Kopiert Dateien von der Lokalen Maschine in das Image  
Beispiel: `COPY src/exec.jar /home/app/exec.jar`

`ENV <name>=<value>`  
→ Setzt eine Umgebungsvariable  
Beispiel: `API_KEY=hello-world`

`EXPOSE <port>`  
→ Öffnet einen den angegeben Port  
Beispiel: `EXPOSE 8080`

`CMD <args>`  
→ Wird ausgeführt, wenn der Container gestartet wird.  
→ Hier wird der Befehl angegeben, um die Applikation zu starten    
→ Es kann nur einen CMD pro container geben  
Beispiel: `CMD java -jar exec.jar`
