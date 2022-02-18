package nvc.it.ice_factory_anurak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class IceFactoryAnurakApplication {

	public static void main(String[] args) {
		SpringApplication.run(IceFactoryAnurakApplication.class, args);
	}

}
