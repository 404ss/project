SELECT * FROM user1
ORDER BY username ASC;

SELECT * FROM user1
ORDER BY email,username DESC;

SELECT id,username,email
FROM user1
ORDER BY 3 DESC,1 ASC;

SELECT username, email/id AS x
FROM user1
ORDER BY x;

SELECT username,number 
FROM user
ORDER BY number DESC NULLS LAST;

