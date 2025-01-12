package com.store.core.service;

import com.store.core.request.LoginRequest;
import com.store.core.request.SignUpRequest;
import com.store.core.response.AuthResponse;

public interface AuthService {

    void sentLoginOtp(String email) throws Exception;
    String createUser(SignUpRequest req) throws Exception;
    AuthResponse signIn(LoginRequest req) throws Exception;
}
