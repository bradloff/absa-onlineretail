package za.co.absa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OnlineretailInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineretailInventoryApplication.class, args);
	}


}
