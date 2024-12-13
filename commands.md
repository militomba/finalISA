1. ./mvnw

2. Ejecutar el poste test --> click derecho en la carpeta postTest y pongo run java

3. Cypress e2e test --> npm run cypress open --e2e

4. levantar elk

   1. ./mvnw
   2. docker-compose up elasticsearch logstash kibana
      jhipster →http://localhost:8081/
      kibana → http://localhost:5601

5. IONIC

   1. ./mvnw
   2. ionic serve

6. JENKINS 1. docker start jenkins 2. http://localhost:8090/
   admin
   5ebb956b797d4d229178a070fa26c207

docker exec -it jenkins bash
jenkins@233c548f94ea:/$ cd /var/jenkins_home/secrets/
jenkins@233c548f94ea:~/secrets$ cat initialAdminPassword
5ebb956b797d4d229178a070fa26c207
