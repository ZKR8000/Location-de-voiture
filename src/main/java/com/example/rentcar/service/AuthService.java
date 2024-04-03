package com.example.rentcar.service;

import com.example.rentcar.dtos.SignupRequest;
import com.example.rentcar.dtos.UserDto;

public interface AuthService  {

    UserDto createCustomer( SignupRequest signupRequest );
    public boolean hasCustomerWithEmail(String email);



}
