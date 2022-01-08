package com.logindemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.logindemo.User;
import com.logindemo.UserRepository;



@Controller
public class AppController {
	@Autowired
	private UserRepository repository;
	
	@GetMapping("")
	public String viewHomePage() {
		return "HomePage";
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		return "RegistrationForm";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassString = encoder.encode(user.getPassword());
		user.setPassword(encodedPassString);
		repository.save(user);
		return "register_success";
	}
	
	@GetMapping("/list_users")
	public String viewUserList(Model model) {
		List<User> userList = repository.findAll();
		model.addAttribute("userList", userList);
		return "users";
	}
}
