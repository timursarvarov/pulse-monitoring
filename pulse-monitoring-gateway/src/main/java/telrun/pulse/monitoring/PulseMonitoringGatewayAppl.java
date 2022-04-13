package telrun.pulse.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import telrun.pulse.monitoring.security.Account;

@SpringBootApplication
@RestController
public class PulseMonitoringGatewayAppl {
    public static void main(String[] args) {
        SpringApplication.run(PulseMonitoringGatewayAppl.class, args);
    }
    ResponseEntity<T> login(LoginData loginData) {
        Account account = accounting.getAccount(loginData.email);
        if (account != null && passwordEncoder.matches(loginData.password, account.getHashPassword())) {
            return ResponseEntity.ok(getToken(loginData));
        }
        return LoginResponse.error();
    }

    private Object getToken(LoginData loginData) {
    }
}
