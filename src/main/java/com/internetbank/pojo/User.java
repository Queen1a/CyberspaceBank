package com.internetbank.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userId;
    private String userName;
    private int gender;
    private int age;
    private String telephone;
    private String address;
    private String password;
}
