# mysql
## 数据库连接
- 工具连接
  - SQLyog
  - navicatformysql
- cmd连接
`mysql -u用户名 -p密码`
## 数据库创建
**关键词**:create
`create database 数据库名字`
`create database 数据库名 character set 字符集`
例如:
创建数据库 数据库中的数据编码默认为utf-8
```mysql
create database text2019年8月23日;
```
设置编码
```mysql
create database text2019年8月23日_2 character set utf8;
```
## 查看数据库
**关键词**:show
- 查看说有数据库
`show databases;`
- 查看数据库信息
`SHOW CREATE DATABASE 数据库信息`

## 删除数据库
**关键词**:drop
`drop database 数据库名字;`

## 切换数据库
**关键词**:use
`use 数据库名字`
## 查看正在使用的数据库
**关键词**:select
`select database();`

## 数据的表
### 创建表
**关键词**:` create table` `主键-primary key` ``
- 格式
```mysql
create table 表名(
    字段名 类型(长度) 约束,
    字段名 类型(长度) 约束,
    字段名 类型(长度) 约束
)
```
- 例子
```mysql
create table study(
    rid int ,
    sname varchar(100),
    age int
)
```
### 主键约束
后接上`primary key`设置为主键
```mysql
CREATE TABLE study(
    rid INT PRIMARY KEY,
)
```
- 设置主键
- alter table 表名 add primary key(字段名)
```mysql
ALTER TABLE study ADD PRIMARY KEY(rid)
```
- 删除主键
- alter table 表名 drop primary key
```mysql
ALTER TABLE study DROP PRIMARY KEY
```
### 自增长

- `ayto_increment`只适用于mysql
```mysql
CREATE TABLE sort (
  rid INT PRIMARY KEY auto_increment,  
  );
```
### 查看表

`show tables`

### 删除表

`drop table 表名`

### 修改表结构格式
**关键词**: `alter` `add` `modify` `change` `drop` `rename`
- 添加列
格式:`alter table 表名 add 列名 类型(长度) 约束`
```mysql
ALTER TABLE study ADD hight INT(20);
```
- 修改类型及长度约束
格式:alter table 表名 modify 列名 类型(长度)约束;
```mysql
ALTER TABLE study MODIFY hight VARCHAR(20);
```
- 修改列名
格式:alter table 表名 change 旧列名 新列名 类型(长度) 约束

```mysql
ALTER TABLE study CHANGE hight wight INT
```
- 删除列
格式: alter table 表名 drop 列名;
```mysql
ALTER TABLE study DROP wight;
```
- 修改表名
格式:rename table 表名 to 新表名
```mysql
RENAME TABLE study TO teacher;
```
### 插入表内容

**关键词**:`insert into` ``
- 语法
insert into 表 (列名1,类名2,类名3.. ) value (值1,值2,值3..);
```mysql
INSERT INTO study (rid,sname,age) VALUES ('001','李三',23);
```

### update
格式
update 表名 set 字段名=值,字段名=值
update 表名 set 字段名=值,字段名=值

### delete
- 语法
delete from 表名 where 条件

### Sql查询语句
**关键词**
`select` 
