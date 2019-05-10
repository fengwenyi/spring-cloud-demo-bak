客户端配置：

`bootstramp.yml`

```yaml
server:
  port: 9098
spring:
  application:
    name: myapp # 应用名称，会拉取相同的名称，如果没有，就会拉取common里面的
  cloud:
    config:
      uri: http://localhost:${config.port:9097}
      profile: dev            # 指定profile
      label: master           # 指定gitlab仓库的分支
```

