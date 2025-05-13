package com.redashwood.tinyuserservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BasicInformation {

    private String firstName;

    private String lastName;

    private int age;

    private String gender;

}
