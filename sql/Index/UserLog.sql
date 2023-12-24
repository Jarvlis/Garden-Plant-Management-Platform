CREATE TABLE UserInsertionLog (
                                  logId INT AUTO_INCREMENT PRIMARY KEY,
                                  userId INT,
                                  insertionTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE UserDeletionLog (
                                 logId INT AUTO_INCREMENT PRIMARY KEY,
                                 userId INT,
                                 deletionTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);