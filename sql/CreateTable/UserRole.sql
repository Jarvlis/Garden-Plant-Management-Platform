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