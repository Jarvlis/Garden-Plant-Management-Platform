CREATE TABLE Family_Genus
(
    Family_GenusID INTEGER AUTO_INCREMENT PRIMARY KEY,
    FamilyName VARCHAR(255) NOT NULL,
    GenusName VARCHAR(255) NOT NULL,
    UNIQUE (FamilyName, GenusName),
    INDEX idx_GenusName (GenusName)  -- 添加这一行以创建索引
)
    comment '科属表';

CREATE TABLE Genus_Species
(
    Genus_SpeciesID INTEGER AUTO_INCREMENT PRIMARY KEY,
    GenusName VARCHAR(255) NOT NULL,
    SpeciesName VARCHAR(255) NOT NULL,
    UNIQUE (GenusName, SpeciesName),
    FOREIGN KEY (GenusName) REFERENCES Family_Genus(GenusName)
)
    comment '属种表';

create table if not exists Role
(
    roleId   int auto_increment comment '角色ID'
        primary key,
    roleName varchar(80) not null comment '角色名',
    constraint roleName
        unique (roleName)
)
    comment '角色表';

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

create table if not exists UserRole
(
    userRoleId int auto_increment comment '用户角色ID'
        primary key,
    userId     int null comment '用户ID',
    roleId     int null comment '角色ID',
    constraint UserRole_ibfk_1
        foreign key (userId) references User (userId),
    constraint UserRole_ibfk_2
        foreign key (roleId) references Role (roleId)
)
    comment '用户角色表';