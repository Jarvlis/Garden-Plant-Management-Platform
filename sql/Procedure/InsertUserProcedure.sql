CREATE PROCEDURE InsertUser(
    IN userid INT,
    IN username VARCHAR(50),
    IN userpassword VARCHAR(50),
    IN createdat DATETIME,
    IN updatedat DATETIME,
    IN phonenumber VARCHAR(50),
    IN userstatus TINYINT
)
BEGIN
INSERT INTO User
(userId, userName, userPassword, createdAt, updatedAt, phoneNumber, userStatus)
VALUES (userid, username, userpassword, createdat, updatedat, phonenumber, userstatus);
END;