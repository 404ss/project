CREATE INDEX name1 ON user(username);

ALTER TABLE user
ADD INDEX number1(number);

CREATE TABLE students(
id INT PRIMARY KEY,
name VARCHAR(50),
age INT,
INDEX idx_age(age)
);

DROP INDEX number1 ON user;

ALTER TABLE user
DROP INDEX name1;


CREATE UNIQUE INDEX name2 ON user(username);

ALTER TABLE user
ADD CONSTRAINT idx_id UNIQUE (id);

DROP TABLE students;

CREATE TABLE students(
id INT PRIMARY KEY,
name VARCHAR(50),
age INT UNIQUE
);

SHOW INDEX FROM user;