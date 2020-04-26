这是一个用于学习和练习springboot使用的playground，之后可能也会作为模板使用。

# MySQL表结构和数据

create database springtst;
use springtst;
CREATE TABLE category_ (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(30),
  PRIMARY KEY (id)
) DEFAULT CHARSET=UTF8;