package telran.pulse.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("telran")// для контроля ошибок, надо реализовать перехватчик ошибок
public class DoctorDataProvider {
    public static void main(String[] args) {
        SpringApplication.run(DoctorDataProvider.class,args);
    }
}
