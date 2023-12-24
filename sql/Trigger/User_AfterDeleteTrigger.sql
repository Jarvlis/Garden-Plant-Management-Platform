DELIMITER //
CREATE TRIGGER DeleteUserTrigger AFTER DELETE ON User
    FOR EACH ROW
BEGIN
    INSERT INTO UserDeletionLog (userId) VALUES (OLD.userId);
END //
DELIMITER ;