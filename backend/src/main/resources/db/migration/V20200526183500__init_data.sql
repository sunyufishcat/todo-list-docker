CREATE TABLE IF NOT EXISTS `Person` (
    `id`   int         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(20) NOT NULL,
    `age`  int         NOT NULL
)
    ENGINE = InnoDB
    DEFAULT CHARSET = UTF8;

INSERT INTO Person(name, age)
VALUES ('Tom', 18),
       ('Jerry', 30);
