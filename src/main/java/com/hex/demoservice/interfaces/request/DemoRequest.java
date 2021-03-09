package com.hex.demoservice.interfaces.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DemoRequest {

    private String name;
    private String surname;
    private String email;
    private String phone;
    private String city;

}
