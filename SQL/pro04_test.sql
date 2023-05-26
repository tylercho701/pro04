show databases;
create database myshop;
use myshop;
commit;

set AUTOCOMMIT=true;	-- 자동커밋 설정
show variables like 'autocommit';	-- 자동커밋 설정 확인

create table sample (field1 varchar(100), field2 int, field3 double);
create table notice (no int auto_increment,
					 title varchar(200),
                     content varchar(1000),
                     author varchar(20),
                     regdate datetime default current_timestamp,
                     readcnt int default 0,
                     primary key(no));