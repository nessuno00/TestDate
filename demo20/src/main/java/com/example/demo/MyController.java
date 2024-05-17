package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/")
    public class MyController {

        @GetMapping
        public String welcome() {
            // Log the welcome message
            System.out.println("Welcome to My Spring Boot App!");
            return "Welcome!";
        }

        @GetMapping("/exp")
        public double calculatePower() {
            int base = Integer.parseInt(System.getenv("myapp.env.var1"));
            int exponent = Integer.parseInt(System.getenv("myapp.env.var2"));

            // Log the calculation
            System.out.println("Calculating power: " + base + "^" + exponent);
            double result = Math.pow(base, exponent);

            // Log the result
            System.out.println("Result: " + result);
            return result;
        }

        @GetMapping("/get-errors")
        public void throwCustomError() {
            // Simulate an error
            throw new CustomException("Custom error occurred!");
        }
    }

