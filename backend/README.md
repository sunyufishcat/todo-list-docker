# Spring Docker Compose Demo

一条指令部署Spring Boot+MySQL应用，Docker Compose的使用

## 1. 构建项目JAR包

```bash
./gradlew bootJar
```

## 2. 在项目根目录下定义Dockerfile文件

## 3. 在项目根目录下定义docker-compose.yml文件

## 4. 启动整个应用

```bash
docker-compose up -d
```
## 5. 访问应用

```bash
curl http://localhost:8080/persons/1
```

## 6. 关闭整个应用

```bash
docker-compose down
```

## 注意

Spring中配置的MySQL地址的host,是docker-compose.yml中配置的MySQL的服务名
