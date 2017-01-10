package za.co.absa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OnlineRetailInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineRetailInventoryApplication.class, args);
	}
}
