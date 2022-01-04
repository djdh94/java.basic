use ict_practice;

select*from usertbl;

-- order by 는 결과물의 개수나 종류에는 영향을 미치지 않지만
-- 결과물을 순서대로(오름차순,내림차순) 정렬하는 기능을 가집니다.
-- select 컬럼명 from 테이블명 order by 기준컬럼 정렬기준;
-- 정렬기준은 asc(오름차순), desc(내림차순) 이 있으며
-- 입력이 따로 없는 경우는 기본을 asc로 잡습니다.
-- 가입한 순서(reg_date순으로 오름차순 조회를 해보기)
select*from usertbl order by reg_date asc;

select*from usertbl order by reg_date desc;

-- 키가 작은 순으로 나열하기.
select*from usertbl order by height asc;

-- 정렬시 동점인 부분을 처리하기 위해 order by 절을 두개 이상 동시에 나열가능
-- 아래코드는 키로 오름차순을 하되, 동점이면 생년 내림차순 나열합니다.
select*from usertbl order by height asc,birth_year desc;

-- 만약에 문자라면 아스키코드 순으로 order by 정열이 들어갑니다.
-- user_name으로 order by를 걸어보기

select*from usertbl order by user_name asc;

-- 지역 가나다 역순으로 나열하되, 지역이 같다면 이름 오름차순으로 정렬
select*from usertbl order by addr desc, user_name asc;

-- distinct는 결과물로 나온 컬럼의 중복값을 다 제거하고
-- 고유값만 남겨줍니다.

-- 아래코드는 지역 종류 5개(데이터 개수는 10개)를 파악하기 어렵습니다.
select addr from usertbl;

-- 중복값을 하나로 출력하기 위해 출력컬럼 앞에 distinct를 붙입니다.
select distinct addr from usertbl;

-- 출력요소의 개수를 제한할떄는 limit 구문을 사용합니다.
-- 데이터가 많다보니 모든 데이터를 보여주지 않고
-- 1000개만 보여주도록 설정되어있음
select *from employees;

-- 테이블명 뒤에 limit 숫자; 가 오는 경우는 적은 숫자 개수만큼만
-- 결과창에 보여줌.
-- 숫자를 하나만 적으면 자동으로 0번 자료부터 n개를 보여줍니다.
select*from employees limit 10;

-- 만약 limit 숫자1,숫자2 와 같이 숫자2개를 넣는경우
-- 숫자 1번부터 숫자 2에 기입한 갯수만큼 보여줍니다.
select*from employees limit 8,16;

-- group by는 같은 데이터를 하나의 그룹으로 묶어줍니다.
-- 조건절은 where이 아닌 having절로 처리합니다.

select user_id, amount from buytbl order by user_id;

-- select 컬럼명 ,집계함수...from 테이블명 group by 묶을 
select user_id,sum(amount) from buytbl group by user_id;

-- 각 유저별 총 구매액을 구하기
select user_id,sum(price*amount)as 'total' from buytbl group by user_id;

-- 각 유저별 구매 물품의 평균가를 구하기(총액아님) 평균은 avg()로 처리
select user_id,avg(price) as '평균' from buytbl group by user_id;
select*from buytbl;

-- 자주쓰는 집계함수 정리
-- avg() 평균
-- min() 최소값
-- max() 최대값
-- count() row개수
-- count(distinct) 종류 개수
-- stdev() 표준편차
-- var_samp() 분산
select count(*) from employees.employees;

-- usertbl 에서 키가 제일 큰 회원을 찾아주세요
select user_name,max(height) from usertbl;
select*from usertbl;

select user_name,height from usertbl 
where height=(select max(height) from usertbl);

-- usertbl에서 키가 가장 작은 회원을 찾기
select user_name,height from usertbl where height=
(select min(height)from usertbl);
-- usertbl 사용자 전체 키 평균 구하기
select avg(height)as '키평균' from usertbl;

-- 기존 쿼리문에서의 조건절은 where절을 이용해서 처리했었습니다.
-- 하지만 group by 를 통해 집계하는 경우 where절을 받을수 없습니다.
-- 대신 조건절을 having으로 대체해 사용합니다.
-- where과 사용법은 완전동일합니다.
-- 우선 사용자별 총 구매액을 다시구해보기
select user_id,sum(price*amount)as '총구매액' from buytbl group by user_id;

-- 구매액이 250000을 넘는 사람만 남겨보기

select user_id,sum(price*amount)as '총구매액' from buytbl group by user_id 
having sum(price*amount)>250000;

-- 키가 평균보다 큰 지역만 화면에 출력하기

select addr,avg(height) from usertbl group by addr
having avg(height)>(select avg(height) from usertbl);

-- sql 구문의 분류

-- DML : date manipulation Language
-- 데이터 조작언어로 select,insert,update,delete 구문을 의미
-- 테이블의 데이터를 조히하거나 변경하기 위해서 사용한다.

-- DDL : data definition Language
-- 데이터 정의언어로 데이터베이스,테이블,뷰,인덱스 등을 생성하고
-- 삭제하는 구문으로 create,drop,alter 가 있습니다.
-- dml과는 달리 commit; 없이도 바로바로 서버에 반영됩니다

-- DCL : Date control language
-- 데이터 제어 언어로 특정 계정에 대한 권한을 부여하거나 했을 때 사용합니다.
-- grant,revoke,deny 등이 있습니다.

-- 테이블 생성

Create table testtbl1(
id int,
user_name varchar(3),
age int
);


-- 테이블 명뒤에 컬럼정보를 적지 않으면, create table 시 설정한
-- 컬럼정보가 순서대로 대입됩니다.
INSERT INTO testtbl1 values(1,'홍길동',25);
-- id와 이름쪽에만 데이터를 넣을때에는 컬러명을 생략할 수 없습니다.
INSERT INTO testtbl1(id,user_name) values(2,'김길동');

select*from testtbl1;

-- 만약 컬럼명 지정을 안 했지만 age에는 null을 넣고 싶다면
INSERT INTO testtbl1 values (3,'이호영',null);

-- 만약 입력하는 컬럼(옆)의 순서를 바꿔서 지정하는 경우는(id,user_name,agr가 아닌 순으로 넣음)
-- 모든 컬럼에 값을 입력하는 상황이여도 컬럼명을 따로 기입해야 합니다.
INSERT INTO testtbl1(user_name,age,id)values('채종훈',10,4);
