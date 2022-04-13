package telrun.pulse.monitoring.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class PulseMonitoringSecurityConfigurer  extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.cors().and().csrf().disable();
        http.authorizeHttpRequests().antMatchers("/login").permitAll()
                .and().authorizeHttpRequests().antMatchers(HttpMethod.GET).hasAnyRole("USER", "ADMIN");
        http.authorizeHttpRequests().anyRequest().hasRole("ADMIN");

    }
}
