prerequisite
1. install sts plugin


how to create spring boot project
1. using start.spring.io
2. using IDE to create but IDE need to install STS plugin

dependecy management
1) Inheriting the Starter Parent
2) Using Spring Boot without the Parent POM
https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#using-boot-maven-without-a-parent




META-INF/spring.factories
# Auto Configure
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
com.ymd.autoconfig.HttpClientAutoConfiguration
