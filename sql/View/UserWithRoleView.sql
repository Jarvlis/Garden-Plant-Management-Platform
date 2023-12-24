CREATE VIEW UserWithRoleView AS
SELECT u.*, r.rolename
FROM User u
LEFT JOIN UserRole ur ON u.userId = ur.userId
LEFT JOIN Role r ON ur.roleId = r.roleId;