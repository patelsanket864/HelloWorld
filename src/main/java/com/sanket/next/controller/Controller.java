package com.sanket.next.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("hey")
	public String hello() {
		return "Hey World..!!";
	}
}
