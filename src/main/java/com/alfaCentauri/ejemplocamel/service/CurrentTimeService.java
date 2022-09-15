package com.alfaCentauri.ejemplocamel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CurrentTimeService {

    @Autowired
    Environment environment;
    public String getCurrentDateTime(){
        String message = environment.getProperty("message");
        LocalDateTime localDateTime = LocalDateTime.now();
        return message.concat(localDateTime.toString());
    }
}
