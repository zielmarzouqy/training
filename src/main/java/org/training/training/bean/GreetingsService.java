package org.training.training.bean;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface GreetingsService { // class to be tested in isolation
//    public GreetingsService(UserService userService, AppService appService) {
//        this.userService = userService;
//        this.appService = appService;
//    }

     String getGreetings(int userId, LocalTime time);

}