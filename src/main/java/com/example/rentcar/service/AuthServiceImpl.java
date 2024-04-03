package com.example.rentcar.service;
import com.example.rentcar.dtos.SignupRequest;
import com.example.rentcar.dtos.UserDto;
import com.example.rentcar.entities.User;
import com.example.rentcar.enums.UserRole;
import com.example.rentcar.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Override
    public UserDto createCustomer( SignupRequest signupRequest ) {
        User user = new User();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setUserRole(UserRole.CUSTOMER);
        User createdUser = userRepository.save(user);
        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());
        return userDto;
    }
    @Override
    public boolean hasCustomerWithEmail(String email){
        return userRepository.findFirstByEmail(email);
    }
}

