# [Spring Boot 2.0 유투브 강의](https://www.youtube.com/watch?v=CnmTCMRTbxo&list=PLfI752FpVCS8tDT1QEYwcXmkKDz-_6nm3) 예제 코드 저장소

## DAY 01. 스프링부트 시작하기

### IntelliJ 스프링 부트 프로젝트 생성

IntelliJ에서 maven 프로젝트를 생성하고, `pom.xml`에 아래와 같이 작성

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.example</groupId>
	<artifactId>myproject</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<!-- Inherit defaults from Spring Boot -->
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.3.RELEASE</version>
	</parent>

	<!-- Add typical dependencies for a web application -->
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
	</dependencies>

</project>
``` 

IntelliJ 터미널에서 maven 빌드하기
```
$ mvn package
```

- 만약 빌드 실패할 경우 프로젝트 경로를 확인하고, 프로젝트 경로의 `pom.xml`이 있는 곳으로 이동하여 빌드 수행한다.

이제 패키지를 추가하고, Spring Boot 실행 클래스를 생성, 아래와 같이 `main()` 메서드 작성

```java
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
```




