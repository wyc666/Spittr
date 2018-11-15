package nju.edu.wyc.config;

import org.eclipse.jdt.internal.compiler.ast.AND_AND_Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import nju.edu.wyc.data.SpitterRepository;
import nju.edu.wyc.service.Impl.UserService;

@Configuration
@EnableWebSecurity
public class SpittrSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	SpitterRepository repository;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.userDetailsService(new UserService(repository));
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/spitter/me").hasRole("SPITTER")
				.antMatchers("/spittles/**").hasRole("SPITTER")
				.anyRequest().permitAll()
			.and()
			.requiresChannel()
				.antMatchers(HttpMethod.POST, "/spitter/register").requiresSecure()
			.and()
			.rememberMe()
				.tokenValiditySeconds(2419200)
				.key("spitterUserKey")
			.and()
			.logout()
				.logoutSuccessUrl("/home")
			.and()
			.csrf()
				.disable();
			
	}
}
