package com.example.demo.controller;

import org.slf4j.Logger;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://59.5.105.145:8081")
//@Slf4j
@RestController
public class TestController {
	
	@GetMapping("/")
	public String index() {
		return "스프링 부트&뷰 연동 테스트!!";
	}
}