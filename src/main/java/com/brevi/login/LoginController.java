package com.brevi.login;

import com.brevi.registration.RegistrationRequest;
import com.brevi.registration.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/login")
@AllArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public boolean login(@RequestBody LoginRequest request) {
        return loginService.login(request);
    }

}
