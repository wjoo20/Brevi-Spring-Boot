package com.brevi.login;

import com.brevi.appuser.AppUser;
import com.brevi.appuser.AppUserRole;
import com.brevi.appuser.AppUserService;
import com.brevi.registration.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {

    private final AppUserService appUserService;

    public boolean login(LoginRequest request) {
        System.out.println(request.getUsername());
        System.out.println(request.getPassword());
        return true;
    }
}
