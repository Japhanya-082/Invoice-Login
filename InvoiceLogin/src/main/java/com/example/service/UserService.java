package com.example.service;

import com.example.DTO.LoginRequest;
import com.example.entity.User;

public interface UserService {
 
	public String register(User user) ;
	public String loginWithOtp(LoginRequest request);
    public void sendOtp(String email);//request OTP
    public boolean isOTPValid(String email, String otp);
}
