create table if not exists User
(
    userId       int auto_increment comment '用户ID'
    primary key,
    userName     varchar(80)                         not null comment '用户名',
    userPassword varchar(50)                         not null comment '密码',
    createdAt    timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '创建时间',
    updatedAt    timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    phoneNumber  varchar(40)                         not null comment '手机号码',
    userStatus   tinyint   default 0                 not null comment '用户状态 0 - 正常 1 - 封号',
    constraint phoneNumber
    unique (phoneNumber) comment '用户手机号索引',
    constraint userName
    unique (userName)
    )
    comment '用户表';