package com.example.rentcar.dtos;

import com.example.rentcar.enums.UserRole;
import lombok.Data;

@Data
public class UserDto  {

    private long id;
    private  String name;
    private String email;

    private UserRole userRole;
}
