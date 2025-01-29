# elasticsearch

- [elasticsearch-in-a-spring-boot-application](https://medium.com/@abhishekranjandev/step-by-step-guide-to-using-elasticsearch-in-a-spring-boot-application-477ba7773dea)


```sh
$ docker run -d --name es762 -p 9200:9200 -e "discovery.type=single-node" elasticsearch:8.13.3

docker run -p 9200:9200  --name myelastic  \
  -e ELASTIC_PASSWORD=root \
  -e "discovery.type=single-node \
  -e "xpack.security.http.ssl.enabled=false" \
  -e "xpack.license.self_generated.type=basic” \
  docker.elastic.co/elasticsearch/elasticsearch:8.14.0
  
```


https://docs.spring.io/spring-boot/appendix/application-properties/index.html#application-properties.data.spring.elasticsearch.connection-timeout

----------------------

### Step 1: Test the RESTful API
Use a REST client, like Postman or curl, to test the API endpoints. Here are some example curl commands:

Create a new employee:

```sh
curl -X POST -H "Content-Type: application/json" -d '{"firstName": "John", "lastName": "Doe", "department": "Engineering"}' http://localhost:8080/api/employees
```


https://www.linkedin.com/pulse/usando-elasticsearch-com-spring-boot-darlan-noetzold-mfkif/

curl -X GET "http://localhost:9200"
