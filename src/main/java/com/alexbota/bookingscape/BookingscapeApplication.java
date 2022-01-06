package com.alexbota.bookingscape;

import com.alexbota.bookingscape.model.Role;
import com.alexbota.bookingscape.model.Room;
import com.alexbota.bookingscape.model.User;
import com.alexbota.bookingscape.service.RoomService;
import com.alexbota.bookingscape.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class BookingscapeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingscapeApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));

			userService.saveUser(new User(null, "john@email.com", "1234", new ArrayList<>(), new ArrayList<>()));
			userService.saveUser(new User(null, "jack@email.com", "1234", new ArrayList<>(), new ArrayList<>()));

			userService.addRoleToUser("john@email.com", "ROLE_USER");
			userService.addRoleToUser("jack@email.com", "ROLE_USER");
		};
	}

}
