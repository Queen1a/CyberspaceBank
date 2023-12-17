create database if not exists bank;

use bank;

create table if not exists admin
(
    adminId   int auto_increment comment 'id'
        primary key,
    adminName varchar(10)             not null comment '管理员名',
    password  varchar(10) default '0' null comment '密码',
    constraint admin_pk
        unique (adminName)
)
    comment '管理员';

create table if not exists card
(
    cardId       int auto_increment comment '银行卡Id'
        primary key,
    cardNumber   varchar(20)            not null comment '银行卡号',
    cardPassword varchar(6) default '0' null comment '银行卡密码',
    userId       varchar(10)            null comment '用户id',
    balance      double                 null comment '存款',
    status       tinyint unsigned       null comment '账户状态',
    openDate     datetime               null comment '开户日期',
    constraint card_pk
        unique (cardNumber)
)
    comment '银行卡';

create table if not exists trade
(
    tradeId   int auto_increment comment '交易Id'
        primary key,
    cardId    int      null comment '交易卡id',
    type      tinyint  not null comment '交易类型',
    money     double   not null comment '交易金额',
    tradeDate datetime null comment '交易日期'
)
    comment '交易表';

create table if not exists user
(
    userId    int auto_increment comment '用户id'
        primary key,
    userName  varchar(10)      not null comment '用户名',
    gender    tinyint unsigned null comment '性别',
    age       int              null comment '年龄',
    telephone varchar(12)      null comment '电话号码',
    address   varchar(20)      null comment '家庭住址',
    constraint user_pk
        unique (userName)
);

