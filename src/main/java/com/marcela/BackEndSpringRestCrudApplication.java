package com.marcela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.marcela.model.User;
import com.marcela.repository.UserRepository;

@SpringBootApplication
public class BackEndSpringRestCrudApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BackEndSpringRestCrudApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		userRepository.save(new User("one","one"));
		userRepository.save(new User("two","two"));
		userRepository.save(new User("three","three"));
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BackEndSpringRestCrudApplication.class);
    }
}
