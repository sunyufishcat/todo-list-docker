#使用JDK8环境作为基础镜像
FROM java:8

#拷贝文件并且重命名
ADD build/libs/spring-docker-compose-demo-0.0.1-SNAPSHOT.jar app.jar
ADD wait-for-it.sh wait-for-it.sh

# 指定容器需要映射到主机的端口
EXPOSE 8080

#容器启动时执行的指令
ENTRYPOINT ["./wait-for-it.sh", "mysql:3306", "-t", "60", "--", "java", "-jar", "/app.jar"]
