use ict_practice;

-- 앞에 스키마 명을 추가로 입력해 스키마명.테이블명으로 조회도 가능함
select *from ict_practice.userTbl;
-- 유저를 두명만 더 추가하기



set sql_safe_updates=0;

update userTbl SET addr='서울' where user_id='zzz';
-- 정보는 전부 여러분들이 알아서 집어넣어주시되, 키는 한명은 160대로 해주세요
INSERT INTO userTbl VALUES('LSH','페이커',1994,'인천','234324',168,'2020-03-05');

-- 새로 추가한 2명의 구매내역을 추가해주세요
-- 2명 구매내역 합산 3개를 추가해주세요
select*from buytbl;
INSERT INTO buytbl values(null,'kec','몰라','몰라',4485,1);
insert into buytbl (user_id,prod_name,group_name,price,amount)
values('kec','asd','asdf',1652,1);
insert into buytbl values(null,'kec','sdf','sdf',5615,1);

-- 여태까지의 select 구문은 조건 없이 모든 데이터를 다 조회했습니다.
-- 극단적인 경우 employees 테이블의 모든 row를 조회하다보니
-- 조회시간이 굉장히 오래 잡히는 케이스가 발생했습니다.
-- 따라서 조건에 맞도록 필터링을 할 수있고, 이를 위해 사용하는 구문은 where구문입니다.
-- select 컬럼명1,컬럼명2 from 테이블명 where 컬럼명=조건식;

-- 아래는 이름이 손흥민인 사람만 조회하는 구문입니다.
select*from usertbl where user_name='손흥민';
select*from usertbl;

-- 서울에 사는 사람만 조죄하기
select*from usertbl where addr = '인천';

-- 관계연산자를 이용해서 대소비교를 하거나
-- and,or을 이용해 조건 여러개를 연결할 수 있습니다.
-- 키가 180 이상인 사람

select*from usertbl where height>=100;

-- AND를 이용해 91~99년생까지만 조회하는 구문을 만들기
-- hint : 91보다는 크거나 같고, "그리고",99보다는 작거나 같다
select*from usertbl where (1991<=birth_year) AND (birth_year<=1999);

-- between ~ and 구문을 이용하면 birth_year를 한 번만 적고도
-- 해당 범위의 조회가 가능합니다.
-- 적은 두 개의 숫자는 포함하지 않습니다.
select*from usertbl where birth_year between 1991 and 1999;

-- 위와 같이 숫자는 연속된 범위를 갖기 때문에 범위연산자로 처리가 가능하지만
-- addr같은 자료는 서울이 크다던가 영구이 작다던가 연산처리 불가능
-- 먼저 지역이 서울이거나 혹은 화성인 사람의 정보를 where절로 조회해주세요
select*from usertbl where (addr='인천')or(addr='서울');

-- in 키워드를 사용하면 컬렴명 in(데이터1,2,3,4);
-- 특정 컬럼에 괄호에 담긴 데이터가 포함되는 경우를 전부출력
-- 경기,화성,영국에 있는 사람들만 in키워드로 조회하기

select*from usertbl where height in(111,168);

-- like 연산자는 일종의 표현 양식을 만들어줍니다.
-- like 연산자를 이용하며 %라고 불리는 와일드 카드나 혹은_라고불리는
-- 와일드 카드 문자를 이용해 매칭되는 문자나 문자열을 찾습니다.

-- 채씨를 찾는 케이스(%는 몇 글자가 오더라도 상관 없음)
-- 아래 구문은 채로 시작하는 모든 요소를 다 가져옵니다. '채'도 포함
select*from usertbl where user_name like '김%';

-- 휴대폰번호가 01로 시작하는사람찾기
select*from usertbl where phone_number like '01%';

select*from usertbl;

-- 두글자만 찾는 케이스(_는 하나에 한글자임)
select*from usertbl where user_name like '__';

-- user_id가 3글자이면서 h로 끝나는 사람만 조회하기

select*from usertbl where user_id like '__c';

-- 서브쿼리(하위쿼리)란 1차적 결과를 얻어놓고,
-- 거기서 다시 조회구문을 중첩해서 날리는것을 의미합니다.
-- 채종훈보다 키가 큰 사람을 조회하는 예시

-- 원시적인 방법
-- 1.채종훈의 키를 where절을 이용해 확인한다.
select height from usertbl where user_name='김은총';
-- 2. 175보다 큰 사람의 이름과 키만 조회하기
select height,user_name from usertbl where height>111;

-- 서브쿼리 활용방법
-- 서브쿼리는 from절 다음에 ()를 이용해서
-- select 구문을 한 번 더 활용합니다.
select user_name,height from usertbl where height>
(select height from usertbl where user_name='김은총');

update usertbl set user_id='MED' where user_name='김김';

select*from usertbl;
-- 서브쿼리를 활용해 '페이커'보다 먼저 태어난 사람들 만 골라내보기
select birth_year from usertbl where user_name='페이커';

select user_name,birth_year from usertbl where birth_year<
(select birth_year from usertbl where user_name='페이커');

-- 최대값은 max()로 구합니다.
-- 현재 user_tbl 컬럼에서 가장 나이가 적은 사람
select max(birth_year) from usertbl;

-- user_id에 m이 포함된 사람들 중 키가 제일 작은사람보다
-- 키가 더 큰 사람을 구하시오 (min활용)

select*from usertbl where height>
(select min(height) from usertbl where user_id like '%M%');

-- 2021년 가입자중 가입일이 제일 빠른 사람보다 키가 큰 사람을 조회해주세요

-- 1. 2021년 가입자중 가입일이 제일 빠른사람의 가입일자 구하기
select min(reg_date) from usertbl where reg_date>='2021-01-01';
-- 2. 1의 쿼리문을 조건으로 해서 가입일이 제일 빠른 사람의 키 구하기.
SELECT height from usertbl where reg_date=
(select min(reg_date) from usertbl where reg_date>='2021-01-01');
-- 3. 2에서 구한 키를 조건으로 해서 최종적인 명단을 얻어냄
select *from usertbl where height>
((select min(reg_date) from usertbl where reg_date>='2021-01-01'));

INSERT INTO usertbl VALUES('KJV','김자바',1983,'서울','011123456',173,'2020-06-15');
INSERT INTO usertbl VALUES('ADR','압둘라',1995,'경기','01048451845',165,'2021-09-15');
INSERT INTO usertbl VALUES('YSO','야스오',2001,'부산','01074104125',170,'2021-03-15');
INSERT INTO usertbl VALUES('ABC','무링카',1987,'강원',01063450789,175,'2021-12-15');
INSERT INTO usertbl VALUES('CDM','나몰라',1989,'전라',01027872678,186,'2022-01-15');
SELECT*FROM USERTBL;

-- ANY,ALL,SOME 구문은 서브쿼리와 조합해서 사용함
-- 지역이 서울인 사람보다 키가 작은 사람을 찾는 쿼리문
SELECT height from usertbl where addr='서울';
-- 위 구문을 서브쿼리로 해서 서울사람보다 키가 작은 사람을 찾을 경우 에러가 납니다.
-- 현재 데이터셋은 결과가 168,173 2개인데 어느 데이터를 기반으로
-- height를 조건에 잡아줄지 모호하기때문에 에러가납니다.
select *from usertbl where height<
(SELECT height from usertbl where addr='서울');

-- ANY 구문을 사용하면 168,173 모든 데이터에 대해 OR로 처리가 됩니다.
-- 개별값 모두에 대해 OR처리가 붙고 그래서 아래와 같이 
-- (height <168) or (height<173)
-- 2개 조건이 or로연결됩니다.
-- any는 or로 연결된다는 특성상 범위가 가장 넓은 조건 하나로 통일됩니다.
-- 현재 코드에서는 173보다 작은 데이터는 전부 나옵니다.
-- any 와 some은 사실상 차이가 없는 구문으로 봐도 무방
-- 아래 any자리에 some을 대신 넣어도 똑같이 작동
select *from usertbl where height<any
(SELECT height from usertbl where addr='서울');

-- all 구문을 사용하면 173,168 모든 데이터에 대해 and로 처리됩니다.
-- 개별값 모두에 대해 and처리가 붙고 그래서 아래와 같이
-- (height<169) and (hegiht<171) and(height<186)
-- 2개 조건이 and로 연결됩니다.
-- 현대 코드에서 몇 보다 작은 숫자가 다 잡혀나오는지 적어보기
select *from usertbl where height<all
(SELECT height from usertbl where addr='서울');


















