package com.internetbank.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String cardId;
    private String cardNumber;
    private String cardPassword;
    private String userId;
    private double balance;
    private int status;
    private LocalDateTime openDate;
    private String telephone;
}
