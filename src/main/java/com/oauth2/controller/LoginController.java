package com.oauth2.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tarunkansal on 12/26/17.
 */
@RestController
public class LoginController {

    @GetMapping("/success")
    @Secured("ROLE_ADMIN")
    public String successLogin() {
        return "LoginSuccessful";
    }
}
