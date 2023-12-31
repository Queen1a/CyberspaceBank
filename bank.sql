create table admin
(
    adminId   int auto_increment comment 'id'
        primary key,
    adminName varchar(10)             not null comment '管理员名',
    password  varchar(10) default '0' null comment '密码',
    constraint admin_pk
        unique (adminName)
)
    comment '管理员';

create table card
(
    cardId       varchar(20)            not null comment '银行卡Id'
        primary key,
    cardNumber   varchar(20)            not null comment '银行卡号',
    cardPassword varchar(6) default '0' null comment '银行卡密码',
    userId       varchar(20)            null comment '用户id',
    balance      double                 null comment '存款',
    status       tinyint unsigned       null comment '账户状态',
    openDate     datetime               null comment '开户日期',
    telephone    varchar(19)            null,
    constraint card_pk
        unique (cardNumber),
    constraint card_pk1
        unique (telephone)
)
    comment '银行卡';

create table deposit
(
    userId    varchar(20) null comment '存款人身份证号',
    userName  varchar(10) null comment '存款人姓名',
    balance   double      null comment '存款额',
    term      int         null comment '存款期限',
    startDate varchar(20) null comment '开始日期',
    endDate   varchar(20) null comment '结束日期',
    account   varchar(20) null comment '存款账号',
    rate      double      null comment '利率',
    name      varchar(20) null comment '产品名称'
)
    comment '存款单';

create table trade
(
    tradeId      int auto_increment comment '交易Id'
        primary key,
    cardId       varchar(20)  null comment '交易卡',
    type         varchar(20)  null comment '交易类型',
    tradeAmount  double       null comment '交易金额',
    tradeDate    datetime     null comment '交易日期',
    tradeAccount varchar(20)  null comment '交易对象账户',
    balance      double       null comment '当前余额',
    notes        varchar(100) null comment '备注'
)
    comment '交易表';

create table user
(
    userId    varchar(50)      not null comment '用户id'
        primary key,
    userName  varchar(10)      not null comment '用户名',
    gender    tinyint unsigned null comment '性别',
    age       int              null comment '年龄',
    telephone varchar(12)      null comment '电话号码',
    address   varchar(20)      null comment '家庭住址',
    password  char(6)          null,
    constraint user_pk
        unique (userName)
);

