package telran.pulse.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("telran")// для контроля ошибок, надо реализовать перехватчик
public class AvgReducerAppl {

    public static void main(String[] args) {
        SpringApplication.run(AvgReducerAppl.class, args);

    }

}