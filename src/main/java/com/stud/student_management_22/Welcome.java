package com.stud.student_management_22;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome To SpringBoot";
    }
}
