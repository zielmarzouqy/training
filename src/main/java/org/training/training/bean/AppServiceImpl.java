package org.training.training.bean;

import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {
    @Override
    public String getAppName() {
        // assume you are reading this from properties file
        String appName = "The Amazing Application";
        return appName;
    }
}