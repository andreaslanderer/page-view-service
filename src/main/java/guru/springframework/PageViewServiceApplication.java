package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PageViewServiceApplication {

	// Before start this file, start 2 containers:
	// docker run --name spring-boot-mysql -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD mysql:5.7.22
	// docker run --hostname spring-boot-rabbit-1 --name spring-boot-rabbit-1 -p 5672:5672  rabbitmq
	public static void main(String[] args) {
		SpringApplication.run(PageViewServiceApplication.class, args);
	}
}
