package com.app.services;

import com.app.dao.UserDAO;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //class belongs to services
public class UserServices {
    @Autowired
    private UserDAO userDAO;

    public void saveUserData(User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        //field data validation needed here
        userDAO.saveUserData(user);
    }

    public List<User>getAllUsers(){
        return userDAO.getAllUsers();
    }
}
