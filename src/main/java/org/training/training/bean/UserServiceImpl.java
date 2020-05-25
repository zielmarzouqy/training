package org.training.training.bean;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getFirstName(int userId) {
        String firstName = "";
        // some logic to get user's first name
        // this could be anything like a call to another service,
        // a database query, or a web service call
        return firstName;
    }

    @Override
    public String getLastName(int userId) {
        String lastName = "";
        // some logic to get user's last name
        // this could be anything like a call to another service,
        // a database query, or a web service call
        return lastName;
    }
}