package ru.yandex.ivan_vaysman.share_price_api.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.security.web.SecurityFilterChain;
import ru.yandex.ivan_vaysman.share_price_api.service.UserServiceImpl;


@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    private final UserServiceImpl userService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .anyRequest().authenticated()
                .and()
                .oauth2Login()
                .userInfoEndpoint()
                .and()
                .successHandler((request, response, authentication) -> {
                    DefaultOidcUser defaultOidcUser = (DefaultOidcUser) authentication.getPrincipal();
                    userService.prepareUser(defaultOidcUser);
                    response.sendRedirect("/auth-success/hello");
                })
        ;
        return http.build();
    }
}
