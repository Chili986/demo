package com.JuegoTrivia.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerLogin {
	
		@GetMapping("login")
		public String login() {
			return "./html/login.html";
	
	}

}
