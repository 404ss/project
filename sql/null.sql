SELECT * FROM user WHERE null IS NULL;

SELECT id,COALESCE(null,0)
FROM user;

SELECT id,IFNULL(null,0)
FROM user;

SELECT * FROM user WHERE null <=> NULL;

SELECT AVG(COALESCE(number,1)) FROM user;