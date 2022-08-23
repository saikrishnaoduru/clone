package com.example.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {


     @GetMapping
     public String sayWelcome() {
         return "Hi JAVA Developer How Are You";


     }



}
