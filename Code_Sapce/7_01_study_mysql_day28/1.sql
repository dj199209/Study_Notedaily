SHOW DATABASES;
SHOW CREATE DATABASE text2019年8月23日;
SELECT DATABASE();
USE text2019年8月23日;
CREATE TABLE study(
    rid INT PRIMARY KEY AUTO_INCREMENT,
    sname VARCHAR(100),
    age INT
)
ALTER TABLE study ADD PRIMARY KEY(rid)
ALTER TABLE study DROP PRIMARY KEY
DESCRIBE study;
ALTER TABLE study ADD hight INT(20);
ALTER TABLE study MODIFY hight VARCHAR(20)
ALTER TABLE study CHANGE hight wight INT
ALTER TABLE study DROP wight;
RENAME TABLE teacher TO study;
INSERT INTO study (rid,sname,age) VALUES ('001','wu一',21);
INSERT INTO study (rid,sname,age) VALUES ('002','王三',22);
INSERT INTO study (sname,age) VALUES ('张三',23);

UPDATE study SET sname='李四' WHERE rid='3';