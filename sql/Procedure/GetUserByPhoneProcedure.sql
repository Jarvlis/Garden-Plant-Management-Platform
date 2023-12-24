CREATE PROCEDURE GetUserByPhoneNumber(
    IN phoneNumber VARCHAR(50)
)
BEGIN
    SELECT u.*, r.rolename
    FROM User u
    LEFT JOIN UserRole ur ON u.userId = ur.userId
    LEFT JOIN Role r ON ur.roleId = r.roleId
    WHERE u.phoneNumber = phoneNumber;
END;