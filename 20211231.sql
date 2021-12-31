-- employees를 사용 스키마로 지정하기

-- employees 내부의 employees 테이블을 조회하기
SELECT*FROM employees;

-- 원래 테이블 조회할때는 스키마명.테이블명으로 모두 표기해야 합니다.
SELECT*FROM employees.employees;

-- use 중이지 않은 스키마의 테이블도 조회가능
select*from ict_practice.users;

-- 컬럼을 전체가 아닌 임의로 가져올때는 컬럼명을 ,로 구분합니다.
-- 이 경우 모든 컬럼이 아닌 일부 컬럼만 조회할 수도 있으며
-- 심지어 한 개의 컬럼만 조회하는 등 개수조절도 가능합니다.
select gender, first_name from employees;

-- CMD환경에서는 좌측 스키마처럼 스키마 목록을 보여주는 창이 없으므로
-- 아래 명령어를 이용해 스키마 목록을 확인가능
show databases;

-- 현재 db정보를 조회하기 위해서는
show table status;

-- 특정 테이블의 컬럼 정보를 조회하고 싶다면 아래 명령어를 씀
-- DESCRIBE 테이블명; DESC 테이블명;
DESC employees;

use ict_practice;

-- PRIMARY KEY(주요키)
-- 각 테이블을 대표할 수 있는 대표데이터를 저장하는 컬럼에 붙이는 제약조건입니다.
-- 모든 테이블은 무조건 하나의 primary key를 갖는다.
-- primary key는 자동으로 중복방지를하고, null도 들어올수없음 
CREATE TABLE userTbl(
user_id varchar(8) primary key,
user_name varchar(10) not null,
birth_year int(4) not null,
addr varchar(4) not null,
phone_number varchar(11),
height int(3),
reg_date date);

-- AUTO_INCREMENT(자동증가)
-- INT(정수)자료형이 붙은 컬럼에만 붙일수있고, 이게붙은 컬럼은 자동으로 1씩 증가하는 숫자를 배정받습니다.
-- 시작은 1입니다.
-- INSERT INTO 구문이 실행될 때 마다 해당 컬럼에 들어갈 숫자를 자동으로 배정해줍니다.
-- 한번 쓰인 숫자는다시 사용되지않습니다.

-- foreign key(외래키)
-- 쇼핑몰의 구매자는 반드시 회원이여야 합니다.
-- 특정 테이블에 존재하는 값만 해당 컬럼에 들여올 수 있도록 거는 제약조건입니다.
-- foreign key를 거는 컬럼의 자료형과 크기는 참조하는 쪽과 원본 모두 같아야 합니다.
-- 참조컬럼에 있는 값만(userTbl의 user_id에 존재하는 값만) buyTbl의 user_id에 올 수 있습니다.

CREATE TABLE buyTbl(
order_number INT AUTO_INCREMENT PRIMARY KEY,
user_id varchar(8) NOT null,
prod_name varchar(6) not null,
group_name varchar(4) not null,
price int(7) not null,
amount int(3) not null,
FOREIGN KEY(user_id) references userTbl(user_id));

-- 회원부터 넣음
INSERT INTO userTbl values('EM','김은총',1994,'인천','0111111111',111,'2020-3-5');
SELECT *FROM userTbl;
-- 가입한 회원이 물건을 산 이력이 남도록 함
INSERT INTO buyTbl values(null,'KEC','키보드','컴퓨기기',5664,1);
-- order_number는 값을 null로 주면 AUTO_INCREMENT에 의해 자동으로 1씩증가
INSERT INTO buyTbl values(null,'KEC','키보D','챠요',564,1);
-- 없는 회원 아이디로 INSERT로 시도
INSERT INTO buyTbl values(null,'zzz','키보드','나여',1884,1);
INSERT INTO buyTbl values(null,'EM','코인','컴야',2318,1);
select *from buyTbl;
