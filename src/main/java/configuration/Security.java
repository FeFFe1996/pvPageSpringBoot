package configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
        ).logout(logout -> logout.permitAll());

        return http.build();
    }

}
