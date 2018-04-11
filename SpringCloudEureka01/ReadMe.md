
使用curl命令测试
将xml使用REST端点注册服务
命令
linux:
```
cat ./eureka-rest-api-test.xml | curl -v -X POST -H "Content-type: application/xml" -d @- http://localhost:8761/eureka/apps/rest-api-test
```
windows:

```
type eureka-rest-api-test.xml | curl -v -X POST -H "Content-type: application/xml" -d @- http://localhost:8761/eureka/apps/rest-api-test
```

使用命令注销服务

```
curl -v -X DELETE http://localhost:8761/eureka/apps/rest-api-test/itmuch:rest-api-test:9000
```