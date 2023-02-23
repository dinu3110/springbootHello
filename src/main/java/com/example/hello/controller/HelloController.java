/**
 * 
 */
package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dines
 *
 */
@RestController
public class HelloController {

	@GetMapping(value = "/hello")
	public String hello() {
		return "Hellow Welcome to Spring-Boot!!!";
	}

}
