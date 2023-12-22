package com.internetbank.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deposit {
    private String userId;
    private String userName;
    private String balance;
    private int term;
    private String startDate;
    private String endDate;
    private String account;
    private double rate;
    private String name;
}
