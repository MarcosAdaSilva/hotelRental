package com.rentalHotel.application;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.rentalHotel.domain.User;
import com.rentalHotel.web.UserDTO;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();

    public void registerUser(UserDTO userDTO) {
        User user = new User(userDTO.getUsername(), userDTO.getEmail(), userDTO.getPassword());
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
