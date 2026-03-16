SELECT * FROM user1;
SELECT username,email FROM user1;
SELECT * FROM useqr1 WHERE is_active=TRUE;
SELECT * FROM user1 ORDER BY email DESC;
SELECT * FROM user1 LIMIT 5;

SELECT * FROM user1 WHERE username='Li' OR is_active = FALSE;
SELECT * FROM user1 WHERE username IN ('Ak','Li','La')