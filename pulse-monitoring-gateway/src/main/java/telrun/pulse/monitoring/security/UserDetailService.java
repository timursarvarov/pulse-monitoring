package telrun.pulse.monitoring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserDetailService implements UserDetailsService {
    @Autowired
    AccountingManagement accountingManagement;

    @Bean
    PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountingManagement.getAccount(username);
        if (account == null) {
            throw new UsernameNotFoundException("No user found with username: " + username);
        }

        return new User(account.getUsername(), account.getHashPassword(), AuthorityUtils.createAuthorityList("ROLE_" + account.getRole()));
    }
}
