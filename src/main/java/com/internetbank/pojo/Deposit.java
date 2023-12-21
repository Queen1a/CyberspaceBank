package com.internetbank.pojo;

import java.util.Date;

public class Deposit {
    private String userId;
    private String userName;
    private String balance;
    private int term;

    @Override
    public String toString() {
        return "Deposit{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", balance='" + balance + '\'' +
                ", term=" + term +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", account='" + account + '\'' +
                ", rate=" + rate +
                '}';
    }

    private Date startDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    private Date endDate;
    private String account;
    private double rate;

    public Deposit(String userId, String userName, String balance, int term, Date startDate, Date endDate, String account, double rate) {
        this.userId = userId;
        this.userName = userName;
        this.balance = balance;
        this.term = term;
        this.startDate = startDate;
        this.endDate = endDate;
        this.account = account;
        this.rate = rate;
    }
}
