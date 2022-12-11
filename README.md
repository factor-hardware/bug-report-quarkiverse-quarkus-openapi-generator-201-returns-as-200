# bug report

project: `quarkiverse/quarkus-openapi-generator`

problem:
- declare an api as returning `201`
- successful responses from this api will actually return `200`


steps to reproduce using this repo:
- note `application.yml` defines one api that returns `201` status code
- run these commands, note the status code from the api response is `200`
```bash
mvn package
java -jar target/quarkus-app/quarkus-run.jar 
curl -X POST -v 'http://localhost:8080/v1/Things'
```


example output:
```bash
$ curl -X POST -v 'http://localhost:8080/v1/Things'
*   Trying ::1:8080...
* Connected to localhost (::1) port 8080 (#0)
> POST /v1/Things HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.77.0
> Accept: */*
>
* Mark bundle as not supporting multiuse
  < HTTP/1.1 200 OK
  < content-length: 35
  < Content-Type: application/json;charset=UTF-8
  <
* Connection #0 to host localhost left intact
  {"name":"i should return http 201"} 
```