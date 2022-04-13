package telran.pulse.monitoring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class PulseMonitoringSecurityConfigurer extends WebSecurityConfigurerAdapter {
	@Bean
	PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
@Override
protected void configure(HttpSecurity http) throws Exception {
	http.httpBasic();
	http.cors().and().csrf().disable();
	http.authorizeHttpRequests().antMatchers("/login").permitAll();
	http.authorizeHttpRequests().antMatchers(HttpMethod.GET).hasAnyRole("USER", "ADMIN");
	http.authorizeHttpRequests().anyRequest().hasRole("ADMIN");
	
}
}
