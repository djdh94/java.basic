
select*from testtbl1;

-- 지금 testtbl1 같은경우 id를 수동으로 입력해주고 있습니다.
-- 이 경우 매번 id 값을 사용자가 계산해서 insert해야하기 때문에
-- auto_increment속성을 컬럼에 걸어주기

create table testtbl2(
id int auto_increment primary key,
user_name varchar(3),
age int
);

-- id 컬럼에는 null로 처리해도 1씩증가

insert into testtbl2 values(null,'알파카',4);
insert into testtbl2 values(null,'에뮤',2);
insert into testtbl2 values(null,'토끼',1);
select*from testtbl2;

-- 오토인크리먼터 1씩증가하지만 임의로 바꾸고싶다면 alter TABLE을 이용해
-- 수정가능
alter table testtbl2 auto_increment = 1000;
insert into testtbl2 values(null,'뱀',6);
insert into testtbl2 values(null,'햄스터',3);

-- cmd(커맨드라인)에서 testtbl2 컬럼에 데이터 3개를 더입력하기
-- 조히까지 하기

-- 오토인크리먼트는 1씩 증가하는데
-- 이 증가부분을 수정하고 싶으면 서버측 변수인
-- @@auto_increment를 바꿔야합니다.
-- testtbl2와 모든 조건이 같고 이름만 tbl3으로 테이블 더 만들기

create table testtbl3(
id int auto_increment primary key,
user_name varchar(3),
age int
);

-- testtbl3의 초기 auto_increment값을 1500으로 고쳐보기
alter table testtbl3 auto_increment =1500;
insert into testtbl3 values(null,'쥐',1);
insert into testtbl3 values(null,'병아리',6);
insert into testtbl3 values(null,'호랑이',3);
insert into testtbl3 values(null,'사자',8);
select*from testtbl3;

-- 증가분을 1이 아닌 3으로 세팅하는법
set @@auto_increment_increment=3;
-- 동물 3마리를 testtbl3에 추가해보기
insert into testtbl3 values(null,'치타',9);

insert into testtbl2 values(null,'돼지',2);
select*from testtbl2;

set @@auto_increment_increment=1;
insert into testtbl2 values(null,'팬더',1);
select*from testtbl2;

-- 하나의 insert into 구문으로 여러 row를 추가할 때는
-- value 뒤쪽을 연달아 작성
insert into testtbl2 values(null,'말',4),(null,'오리',4),(null,'닭',4);

-- update 구문은 기존에 입력되어 있는 값을 변경할때 사용
-- where 조건절은 걸지 않는다면, 컬럼 하나의 값을 전부 바꿉니다.
-- 따라서 일반적으로는 무조건 조건절과 조합해서 사용
-- update 테이블명 set 컬럼1=바꿀값1...;

-- testtbl2의 user_name을 전부 '소'로 바꿔주는 구문
update testtbl2 set user_name='소';

-- safe_update모드를 해제 , cmd에서는 소로 전부 바꿀수있지만 워크벤치는 0으로 해주고 바꿔줘야함
set sql_safe_updates=0;
update testtbl2 set user_name='말';

-- 특정 나이대의 user_name을 여러분들이 좋아하는 동물로 교체
update testtbl2 set user_name='돼지' where age between 1 and 3;

-- update구문이 전체 컬럼에 적용될 수 있다는 것을 응용해 특정 컬럼의 값을 일괄적으로
-- 계산식에 따라 새로운 결과값으로 갱신하는것도 가능.
-- 아래 코드는 나이를 2배한 결과물입니다.
update testtbl2 set age=age/2;

select*from testtbl2;

-- delete from 구문은 데이터를 삭제하는 구문
-- delete는 where절과 함꼐 삭제합니다.
delete from testtbl2 where id=1;
select*from testtbl2;

-- limit를 사용하면 상위 n개만 삭제할수도 있습니다.
delete from testtbl2 limit 2;
select*from testtbl2;

delete from testtbl2;

-- delete from은 삭제 할때 시간이 조금더 오래걸리는 편인데 이유는
-- 트랜잭션 로그라는것을 한 로우마다 작성하기 떄문에.
-- 따라서 속도를 끓어올리고 싶다면 truncate를 delete frrom 대신 쓰는 경우도 있음
truncate table testtbl2;

-- truncate와 delete 속도체험
create table testtbl4(
id int,
first_name varchar(50),
last_name varchar(50)
);

insert into testtbl4 (select emp_no,first_name,last_name from employees.employees);
select*from testtbl4;
delete from testtbl4;
truncate table testtbl4;

-- 조건부로 데이터 입력하기
-- 예를 들어 100개의 데이터를 입력하려고 하는데 첫번째 자료만
-- 기존 데이터의 id와 중복되는 값이 있고, 이후 99건은 pk가 중복되지 않는다고 해도
-- sql 시스템 상 전체데이터가 입력되지 않는 문제가 발생한다.
-- 따라서 이 때 중복되는 데이터 1건은 중복된다면 무시하고
-- 이후 나머지 99개 데이터는 중단 없이 정상적으로 입력하도록 만들 수 있습니다.

create table membertbl(
user_id varchar(6) primary key,
user_name varchar(3) not null,
addr varchar(3) not null
);

-- mysql은 구문을 통째로 묶어서 실행할 경우 모두 실행하거나 모두 실행하지 않습니다.
insert into membertbl values('LSH','이상혁','서울');
insert into membertbl values('HS','허수','울산');
insert into membertbl values('JJH','정지훈','인천');

-- 추가 데이터를 입력하되 한건은 중복,두건은 중복없도록 세팅


SELECT*FROM MEMBERTBL;

-- 만약 프라이머리키가 겹치면 무시하고 그렇지않으면 코드로 변환
-- insert와 into 사이에 IGNORE
insert IGNORE into membertbl values('LSH','이상혁','서울');
insert IGNORE into membertbl values('KHK','김혁규','경기');
insert IGNORE into membertbl values('PDH','박도현','충청');

-- IGNORE는 기존 데이터를 유지하고 신규데이터를 막는 구문이였는데
-- 이미 존재하는 데이터가 있어도 신규데이터로 갱신해서 넣고 싶은 경우
insert into membertbl values('LSH','이성혁','제주');

-- ON DUPLCATE KEY UPDATE 구문을 쓰면됨
insert into membertbl values('AAA','이성혁','서울')
on duplicate key update USER_NAME='이상혁',ADDR='제주',user_id='LSH';

-- on duplicate key update는 자료가 없으면 insert into에 적힌 대로 데이터를 넣고
-- 자료가 겹치는 상황인 경우에 on duplicate key update를 실행하는 구문이기 때문에
-- 만약 데이터가 겹치지않아도 잘 작동합니다.
-- 기존 테이블 요소와 겹치지 않는것을 넣어서 잘 들어가는지 cmd로 확인

-- [사용자 관리하기]
-- 현재 root 계정은 모든 권한(수정,삭제,조회,변경,계정생성) 을 가지고 있음
-- 그렇지만 모든 사람이 모든사람이 권한부여하면 안되니 권한부여방법에 대해 알아보겠음.

-- workbench에서 계정생성 및 권한부여하기
-- 1. 좌측의 navigator 에서 Administration 탭을 클릭합니다.
-- 2. Users and Privileges를 클릭합니다.
-- 3. 열리는 화면에서 최하단 Add Account를 클릭한 다음
--    Login name, password 등을 입력합니다.
-- 4. 우하단 apply를 누르면 계정생성이 완료됩니다.
-- 5. Account Limit는 시간당 기능 사용 가능 횟수를 설정합니다.
-- 6. Administrative Roles는 어떤 구문 실행까지 허용할지입니다.

-- cmd 환경에서 생성하는 경우는
-- create user 계정명@'%'IDENTIFIED BY'비밀번호';
-- grant all on *.* to 계정명@'%' with grant option;
-- 위 두줄을 이용해서 생성가능.
-- ict2 계정은 cmd환경에서 만들어보세요. 비밀번호는 ictICT03입니다.

-- 계정 접속 방법
-- 커맨드라인 접속시 mysql -u 계정명 -p로 연결 가능
-- 접속 후 show datebase;를 이용해 db목록 확인가능
-- select user, host from user;를 할 경우 생성된 계정목록 조회가능

-- icttest계정을 만들기

-- 계정 권한 주기
-- 워크벤치에서 주기
-- 1. 하단administration>userand privileges>선택후 롤즈>dba 모든권한

-- grant 권한1,권한2... on db명.테이블명 to 아이디@'%';
-- ict_practice 데이터베이스의 testtbl3 테이블에 대한 select,delete 권한만 가지도록
-- icttest 계정에 권한을 부여한다면
-- grant select,delete on ict_practice.testtbl3 to icttest@'%';
-- grant <권한1,권한2..> on 디비명.테이블명 to 계정명@'%';

select*from testtbl3;


