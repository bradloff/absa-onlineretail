package za.co.absa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class OnlineRetailZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineRetailZuulServerApplication.class, args);
	}
}
