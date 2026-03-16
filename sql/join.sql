SELECT user1.username, user.id
FROM user1
INNER JOIN user ON user1.id = user.id;

SELECT a.username, b.id
FROM user1 AS a
INNER JOIN user AS b ON a.id = b.id
WHERE a.username = 'Jhon';

SELECT user1.username, user.id
FROM user1
LEFT JOIN user ON user1.id = user.id;

SELECT user1.username, user.id
FROM user1
RIGHT JOIN user ON user1.id = user.id;