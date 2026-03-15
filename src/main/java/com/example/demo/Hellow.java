package com.example.demo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
@Component
public class Hellow {

	@Autowired // field injection
	private Laptopc laptopc;
public void great() {
	laptopc.compile();
	System.out.println("Hello this is my first project to show the springboot work");
}
}
