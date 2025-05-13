package com.redashwood.tinyuserservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TinyUserDTO implements Serializable {

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String street;

    private String city;

    private String state;

    private String zip;

    private String country;

    private int age;

    private String gender;
}
