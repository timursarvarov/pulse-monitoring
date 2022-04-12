package telran.pulse.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigServer
@ComponentScan("telran")// для контроля ошибок, надо реализовать перехватчик
public class ConfigServerAppl {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerAppl.class, args);

	}

}
