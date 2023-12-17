package com.internetbank.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trade {
    private Integer tradeId;
    private String cardNumber1;
    private Short type;
    private double money;
    private LocalDateTime tradeDate;
    private String cardNumber2;
}
