SELECT username, SUM(id) AS x
FROM user1
GROUP BY username;

SELECT username, email, COUNT(is_active)
FROM user1
GROUP BY username, email WITH ROLLUP;
