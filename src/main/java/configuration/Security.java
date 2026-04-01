package configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.web.SecurityFilterChain;


public class Security {
    public SecurityFilterChain secFilter(HttpSecurity http){
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/home", "/bokning").permitAll()
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
        ).formLogin(form -> form
                .loginPage("/login")
                .permitAll()
        ).logout(LogoutConfigurer::permitAll);

        return http.build();
    }

}
