package com.jchat.server.controller;

import com.jchat.server.request.LoginRequest;
import com.jchat.server.response.LoginResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {


    public LoginResponse Login(@RequestBody LoginRequest request) {

    }
}

