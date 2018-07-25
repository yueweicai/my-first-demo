package com.orilore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtrl {
	@RequestMapping("/")
	public String index(){
		return "Hello World";
	}
}
