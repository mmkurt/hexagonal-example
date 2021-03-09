package com.hex.demoservice.domain;

import com.hex.demoservice.interfaces.request.DemoRequest;

public class DemoFactoryImpl implements DemoFactory {

    @Override
    public Demo createDemo(DemoRequest request) {
        return Demo.builder()
                .name(request.getName())
                .surname(request.getSurname())
                .email(request.getEmail())
                .phone(request.getPhone())
                .city(request.getCity())
                .build();
    }

}
