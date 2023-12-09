package tech.buildrun.agregadorinvestimentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AgregadorinvestimentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgregadorinvestimentosApplication.class, args);
	}

}
