package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller 
{
@Value("${var}")
private String name;
@GetMapping("/")
public String display()
{
	return "Welcome to this "+name;
}
}
