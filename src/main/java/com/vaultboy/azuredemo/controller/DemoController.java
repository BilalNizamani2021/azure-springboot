package com.vaultboy.azuredemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/v1/demo")
public class DemoController {
    @GetMapping
    public ResponseEntity<?> getDemoObject(){
        return ResponseEntity.ok(Map.of(
                "name", "bilal",
                "email", "bilal.nizamani@royalcyber.com"
        ));
    }
}
