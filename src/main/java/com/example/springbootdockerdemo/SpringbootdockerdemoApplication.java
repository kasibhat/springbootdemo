package com.example.springbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SpringbootdockerdemoApplication {

	public static void main(String[] args) {
		List<String> alist = new ArrayList<String>();
		alist.add("efer");
		alist.add("efe2r");
		System.out.println("om sai ram");
		SpringApplication.run(SpringbootdockerdemoApplication.class, args);
	}

}
