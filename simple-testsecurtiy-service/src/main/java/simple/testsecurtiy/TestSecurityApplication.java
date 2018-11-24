package simple.testsecurtiy;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@EnableResourceServer  
@RestController
public class TestSecurityApplication  extends ResourceServerConfigurerAdapter{
	public static void main(String[] args) {
		SpringApplication.run(TestSecurityApplication.class, args);
	}
	
	@GetMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
	@GetMapping("/test-security/user")
	public Principal user2(Principal user) {
		return user;
	}
    
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.anyRequest().permitAll();
	}
}
