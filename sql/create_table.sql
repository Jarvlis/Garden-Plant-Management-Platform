-- CREATE TABLE Users (
--                        userId INT PRIMARY KEY AUTO_INCREMENT COMMENT '用户ID',
--                        userName VARCHAR(80) NOT NULL UNIQUE COMMENT '用户名',
--                        userPassword VARCHAR(50) NOT NULL COMMENT '密码',
--                        createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
--                        updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
-- ) COMMENT '用户表';
--
-- CREATE TABLE UserRoles (
--                            userRoleId INT PRIMARY KEY AUTO_INCREMENT COMMENT '用户角色ID',
--                            userId INT COMMENT '用户ID',
--                            roleId INT COMMENT '角色ID',
--                            FOREIGN KEY (userId) REFERENCES User(userId),
--                            FOREIGN KEY (roleId) REFERENCES Role(roleId)
-- ) COMMENT '用户角色表';

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
