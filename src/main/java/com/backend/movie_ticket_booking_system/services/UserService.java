package com.backend.movie_ticket_booking_system.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.backend.movie_ticket_booking_system.convertor.UserConvertor;
import com.backend.movie_ticket_booking_system.entities.User;
import com.backend.movie_ticket_booking_system.exceptions.UserExist;
import com.backend.movie_ticket_booking_system.repositories.UserRepository;
import com.backend.movie_ticket_booking_system.request.UserRequest;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String addUser(UserRequest userRequest) {
        Optional<User> users = userRepository.findByEmailId(userRequest.getEmailId());

        if (users.isPresent()) {
            throw new UserExist();
        }

        User user = UserConvertor.userDtoToUser(userRequest,  passwordEncoder.encode("1234"));

        userRepository.save(user);
        return "User Saved Successfully";
    }

}
