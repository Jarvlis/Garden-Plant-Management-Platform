create table if not exists Role
(
    roleId   int auto_increment comment '角色ID'
    primary key,
    roleName varchar(80) not null comment '角色名',
    constraint roleName
    unique (roleName)
    )
    comment '角色表';