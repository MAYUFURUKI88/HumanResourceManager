package com.rapideact.local.humanresource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
    @Override
    public void configure(WebSecurity web) throws Exception {
    	// allow static files
        web.ignoring().antMatchers("/assets/**", "/css/**", "/img/**", "/js/**", "/libs/**", "scripts/**");
    }
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	// url security
        http.authorizeRequests()
        	.antMatchers("/dev/springSecurityAdmin").hasRole("ADMIN")
	        .antMatchers("/**").permitAll()
	        .anyRequest().authenticated();
        
        // login logic
        http.formLogin()
        .loginPage("/login")
        .defaultSuccessUrl("/")
        .permitAll();
        
        // logout logic
        http.logout()
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        .logoutSuccessUrl("/login")
        .invalidateHttpSession(true);
        
        // not allow logic
        http.exceptionHandling()
        .accessDeniedPage("/denied");
    }
}
