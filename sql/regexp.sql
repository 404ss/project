SELECT username FROM user1 WHERE username REGEXP '^J';

SELECT username FROM user1 WHERE username REGEXP 'a$';

SELECT username FROM user1 WHERE username REGEXP 'Jh';

SELECT username,email FROM user1 WHERE email REGEXP '^4|321$';

SELECT * FROM user1 WHERE username REGEXP BINARY 'jhon';

