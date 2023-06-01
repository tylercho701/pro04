show databases;
create database chemicalguys;
use chemicalguys;
commit;

set AUTOCOMMIT=true;	-- 자동커밋 설정
show variables like 'autocommit';	-- 자동커밋 설정 확인

create table notice (no int primary key auto_increment,
					 title varchar(200),
                     content varchar(1000),
                     author varchar(20),
                     regdate datetime default current_timestamp on update current_timestamp,
                     readcnt int default 0);
                     
create table member (id varchar(20) primary key,
					 pw varchar(300) not null,
                     name varchar(50) not null,
                     email varchar(100) not null,
                     tel varchar(20) not null,
                     addr1 varchar(200),
                     addr2 varchar(100),
                     postcode varchar(10),
                     regdate datetime default current_timestamp,
                     birth date,
                     pt int default 100,
                     visited int default 0
);

create table cart (cartid int primary key auto_increment,
				   productid varchar(10),
                   cartquantity int not null,
                   id varchar(20));
                   
create table category (categoryid varchar(10) primary key,
					   categroup varchar(50),
                       catename varchar(50));
                       
create table purchase (purchaseid int primary key auto_increment,
					   productid int,
					   quantity int not null,
                       id varchar(20),
                       purchasedAt datetime default current_timestamp,
                       exid varchar(20),
                       excode varchar(20),
                       exstatus varchar(20) default '배송 전',
                       purchasetype varchar(20),
                       purchasecode int,
                       purchaseprice int);
                       
create table product (productid int primary key auto_increment,
					  productname varchar(200),
                      productamount int,
                      pic1 varchar(300),
                      pic2 varchar(300),
                      pic3 varchar(300),
                      categoryid varchar(10),
                      stock int);
                      
create table review (reviewid int primary key auto_increment,
					 id varchar(20),
                     purchaseid varchar(10),
                     reviewedat datetime default current_timestamp on update current_timestamp,
                     reviewtitle varchar(200),
                     reviewcontent varchar(1000),
                     reviewpoint int default 5,
                     readcnt int default 0);
                     
select * from notice;
select * from member;
select * from cart;
select * from purchase;
select * from review;
select * from product;
select * from category;