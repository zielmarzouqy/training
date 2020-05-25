package org.training.training.bean;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GreetingsServiceImpl implements GreetingsService{ // class to be tested in isolation
	@Autowired
    private UserService userService;
	@Autowired
    private AppService appService;
	
    public String getGreetings(int userId, LocalTime time) { // the method under test
        StringBuilder greetings = new StringBuilder();
        String timeOfDay = getTimeOfDay(time.getHour());
        greetings.append("Good ").append(timeOfDay).append(", ");
        greetings.append(userService.getFirstName(userId)) // this call will be mocked
                .append(" ")
                .append(userService.getLastName(userId)) // this call will be mocked
                .append("!");
        greetings.append(" Welcome to ")
                .append(appService.getAppName()) // actual method call will be made
                .append(".");
        return greetings.toString();
    }

    private String getTimeOfDay(int hour) { // private method doesn't need to be unit tested
        if (hour >= 0 && hour < 12)
            return "Morning";
        else if (hour >= 12 && hour < 16)
            return "Afternoon";
        else if (hour >= 16 && hour < 21)
            return "Evening";
        else if (hour >= 21 && hour < 24)
            return "Night";
        else
            return null;
    }
}