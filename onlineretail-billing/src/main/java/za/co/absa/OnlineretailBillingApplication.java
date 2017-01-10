package za.co.absa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OnlineretailBillingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineretailBillingApplication.class, args);
	}
}
