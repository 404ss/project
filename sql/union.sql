SELECT username,number FROM user
UNION ALL
SELECT username,email FROM user1
ORDER BY username;

SELECT username FROM user WHERE position LIKE 'b%'
UNION
SELECT username FROM user1 WHERE is_active = TRUE
ORDER BY username; 