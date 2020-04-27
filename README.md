这是一个用于学习和练习springboot使用的playground，之后可能也会作为模板使用。

### IDEA导入项目（Maven）：
Import Project -> 选择`complete/pom.xml`文件


### MySQL表结构和数据
```
create database springtst;
use springtst;

CREATE TABLE category_ (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(30),
  PRIMARY KEY (id)
) DEFAULT CHARSET=UTF8;

CREATE TABLE user_ (
  id int(11) NOT NULL AUTO_INCREMENT,
  passwd varchar(45),
  PRIMARY KEY (id)
) DEFAULT CHARSET=UTF8;

```