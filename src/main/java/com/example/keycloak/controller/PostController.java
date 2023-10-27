package com.example.keycloak.controller;


import java.security.Principal;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {



    @GetMapping("/")
    public String getAll(){
        return "Test";
    }


    @GetMapping("/user")
    public String getUser(@AuthenticationPrincipal Jwt jwt){
        return String.format("Hello, %s!", jwt.getClaimAsString("email"));
    }





}
