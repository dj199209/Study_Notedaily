CREATE TABLE users(
id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(100),
passwd VARCHAR(100)
);
INSERT INTO users(username,passwd) VALUES ('a','1'),('b','2');

SELECT * FROM users;

-- 登陆查询
SELECT * FROM users WHERE username= 'a' AND passwd= '1' OR 1=1