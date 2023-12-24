CREATE PROCEDURE InsertUser(
    IN username VARCHAR(50),
    IN userpassword VARCHAR(50),
    IN phonenumber VARCHAR(50)
)
BEGIN
INSERT INTO User
(userName, userPassword, phoneNumber)
VALUES (username, userpassword,phonenumber);
END;