create unique index `PRIMARY`
    on User (userId);

create unique index phoneNumber
    on User (phoneNumber)
    comment '用户手机号索引';

create unique index userName
    on User (userName);

