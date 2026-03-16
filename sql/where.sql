SELECT * FROM user1 WHERE username='Jhon';
SELECT * FROM user1 WHERE username!='Jhon';
SELECT * FROM user1 WHERE id>6;
SELECT * FROM user1 WHERE id<=3 AND is_active=TRUE;
SELECT * FROM user1 WHERE username LIKE 'J%';
SELECT * FROM user1 WHERE NOT username = 'Jhon';
SELECT * FROM user1 WHERE id BETWEEN 2 AND 6;
SELECT * FROM user1 WHERE birthday IS NOT NULL;