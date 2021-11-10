CREATE TABLE IF NOT EXISTS `TodoList` (
    `id`   int         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `inputValue` varchar(20) NOT NULL,
    `isCompleted`  boolean         NOT NULL
)
    ENGINE = InnoDB
    DEFAULT CHARSET = UTF8;

INSERT INTO TodoList(inputValue, isCompleted)
VALUES ('Tom', false),
       ('Jerry', false);