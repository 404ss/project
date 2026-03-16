DROP TABLE IF EXISTS account;

CREATE TABLE IF NOT EXISTS account (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    balance DECIMAL(10,2)
);

INSERT INTO account VALUES (1, '张三', 1000), (2, '李四', 1000);

START TRANSACTION;

UPDATE account SET balance = balance - 100 WHERE id=1;

ROLLBACK;

UPDATE account SET balance = balance - 100 WHERE id=1;
UPDATE account SET balance = balance + 100 WHERE id=2;

COMMIT;