# Spring config client together with configtree
- setup only works when configserver is optional and not fail fast
- copy and rename `client/secret-config-root/spring/cloud/config/password.example` to `client/secret-config-root/spring/cloud/config/password` (must match `spring.security.user.password` in config server)
- run config server bootRun
- run client bootRun
- client setup will fail because config server cannot be called without password
- only works when configserver is optional, so initial setup is delayed and `password` is present on `org.springframework.boot.context.config.ConfigDataEnvironment.processWithProfiles`
  ````yaml
    spring:
     config:
       import:
         - "optional:configserver:"
  ````