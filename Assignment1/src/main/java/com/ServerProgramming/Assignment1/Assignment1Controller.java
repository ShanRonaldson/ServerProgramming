package com.ServerProgramming.Assignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assignment1Controller {
	@GetMapping("/index")
	public String index() {
		return "This is the main page";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}
	
	@RequestMapping(value = "/hello", params = {"location", "name"})
	@ResponseBody
	public String hello(@RequestParam("location") String location, @RequestParam("name") String firstName) {
		return "Welcome to the " + location + " " + firstName;
	}
}
