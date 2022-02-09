create table userinfo(
uname varchar(10) not null,
uid varchar(20) primary key,
upw varchar(20) not null,
uemail varchar(20) null
);

select*from userinfo;
insert into userinfo values("김자바","javaman","1212","java@java.com");
insert into userinfo (uname,uid,upw) values("쟈스피","javajsp","1212");
insert into userinfo values("스프링","springgood","3434","spring@naver.com");
insert into userinfo values("즈파즈파","jpaboot","5656",null);






