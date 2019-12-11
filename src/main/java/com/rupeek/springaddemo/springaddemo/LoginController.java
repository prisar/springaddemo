package com.rupeek.springaddemo.springaddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    @PreAuthorize("hasRole('Users')")
    @RequestMapping("/ssologin")
    public String ssologin() {
        return "logging...";
    }
}
