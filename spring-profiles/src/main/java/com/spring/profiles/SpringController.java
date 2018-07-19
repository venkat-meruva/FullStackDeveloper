package com.spring.profiles;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home/profile")
@RestController
public class SpringController {


    @Value("${spring.message}")
    private String message;

       @GetMapping
    public String display(){
        return message;
    }
       
       // We need to add one more application in run configurations and give the class name, load the class and 
       // set Variable = spring.profiles.active  and Value = dev
       // we can run both the profiles in different ports 
}
