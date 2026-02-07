package com.backend.movie_ticket_booking_system.convertor;

import com.backend.movie_ticket_booking_system.entities.User;
import com.backend.movie_ticket_booking_system.request.UserRequest;
import com.backend.movie_ticket_booking_system.response.UserResponse;

public class UserConvertor {

    public static User userDtoToUser(UserRequest userRequest, String password) {

        return User.builder()
                .name(userRequest.getName())
                .age(userRequest.getAge())
                .address(userRequest.getAddress())
                .gender(userRequest.getGender())
                .mobileNo(userRequest.getMobileNo())
                .emailId(userRequest.getEmailId())
                .roles(userRequest.getRoles())
                .password(password)
                .build();
    }

    public static UserResponse userToUserDto(User user) {

        return UserResponse.builder()
                .name(user.getName())
                .age(user.getAge())
                .address(user.getAddress())
                .gender(user.getGender())
                .build();
    }
}