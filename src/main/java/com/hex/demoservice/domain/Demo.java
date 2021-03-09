package com.hex.demoservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Demo {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String city;

    public String prepareFullName() {
        return this.name + " " + this.surname;
    }

}
