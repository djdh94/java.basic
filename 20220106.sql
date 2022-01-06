-- 권한 뺏기
-- grant가 들어갈 자리에 revoke를 사용하면 됩니다.
-- 단, revoke는 grant와 to from과 연동해서 씁니다.
-- revoke 권한명..on 디비명.테이블이름 from 계정명;

-- [조인(join)]
-- 테이블 2개를 합쳐주는 기능
-- 연관된 데이터를 여러 테이블에 나눠담았을때
-- 그것을 다시 재조립해줍니다.
-- 조인 문법
-- select 테이블1.컬럼1.테이블1.컬럼2..
--  from 테이블1.조인구문 테이블2.
-- on 테이블1. 공통컬럼 = 테이블2.공통컬럼;
-- where 구문은 on으로 합쳐진 결과컬럼에 대한 필터링을 해줍니다.
use ict_practice;
select*from buytbl inner join usertbl on buytbl.user_id=usertbl.user_id;

-- 지금 현재 구매자 정보를 조회하려고 하는데, 필요한 정보는
-- buytbl의 구매 물품정보 전체에, 구매자 정보는 택배를 받기 위해서
-- 이름,주소,휴대폰번호만 있으면 되는 상황입니다.
-- 조인구문을 활용해 필요한 컬럼만 출력되게 수정해주세요
select buytbl.*,usertbl.phone_number,usertbl.user_name,usertbl.addr from buytbl inner join usertbl
on buytbl.user_id=usertbl.user_id;

select b.prod_name,b.group_name,b.price,b.amount,u.user_name,u.addr,u.phone_number from buytbl b inner join usertbl u
on b.user_id=u.user_id where price>=1;

-- from구문에서 테이블명만 적는게아니라, 테이블명 별명 형식으로 적을 경우는
-- 테이블명을 풀로 적지않고 별명으로 대체해서 호출하기 때문에 좀더 편리
select*from buytbl b inner join usertbl u on b.user_id=u.user_id;

-- 위쪽 join 구문을 활용하시되, 가격이 20000만원 이하인 품목만 남겨주시고
-- 그 남은 자료들을 가격순으로 내림차순 출력해주세요.

select b.prod_name,b.group_name,b.price,b.amount,u.user_name,u.addr,u.phone_number
from buytbl b inner join usertbl u on b.user_id=u.user_id where price<=200000 order by b.price desc;



-- left join,right join은 공통데이터가 아닌 데이터도 방향에 따라
-- 출력이 되기 때문에 공통데이터(inner)가 아닌 데이터(outer)까지
-- 출력되는 점을 이용해 outer join이라고 부릅니다.
-- left outer join은 join 구문의 왼쪽 테이블의 자료는 모두 출력하고
-- 오른쪽 테이블 데이터는 왼쪽 기준컬럼과 일치할때만 출력합니다.
-- 반대로 right outer join은 join 구문의 오른쪽 테이블의 자료는 전부 출력하고a
-- 왼쪽 테이블 데이터는 오른쪽 테이블의 기준컬럼과 일치할때만 출력합니다.

select*from usertbl;
select*from buytbl;

-- left join인데,usertbl를 left에, buytbl을 right에 두고 작성하기
-- inner join을 넣은 자리에 대신 left outer join으로 고쳐주시기만 하면 작동합니다.
-- 테이블의 컬럼은 전체를 출력합니다.
 
select*from usertbl u left outer join buytbl b on b.user_id=u.user_id;

-- right join인데,usertbl를 right에, buytbl을 left에 두고 작성하기
-- inner join을 넣은 자리에 대신 right outer join으로 고쳐주시기만 하면 작동합니다.
-- 테이블의 컬럼은 전체를 출력합니다.

select*from buytbl b right outer join usertbl u on u.user_id=b.user_id;

-- full outer join은 누락데이터 없이 양쪽 테이블의 모든 자료를 보여줍니다.
-- oracle sql에는 full outer join을 구문으로 지원하지만 mysql에서는 
-- full outer join을 union 명령어를 이용해 left outer join과 right outer join의
-- 결과물을 합쳐서 구현. 
-- 이때 접점이 없는 데이터는 반대쪽 데이터를 null로 가집니다.
-- union은 위쪽 결과물과 아래쪽 결과물을 합쳐줌.

select*from buytbl b left outer join usertbl u on b.user_id=u.user_id
union -- union 구문은 위 아래 결과 화면을 합쳐줍니다.(left,right 사이에 넣으면 full)
select*from buytbl b right outer join usertbl u on b.user_id=u.user_id;

-- full outer join 이뱋를 돕기위한 추가데이터 설정
create table student(
user_name varchar(3) primary key,
user_addr varchar(2) not null
);

create table membership(
user_name varchar(3) primary key,
user_point INT not null
);

insert into student values('강건마','서울');
insert into student values('노영웅','수원');
insert into student values('이상용','인천');
select*from student;

insert into membership values('강건마',15000);
insert into membership values('노영웅',37000);
insert into membership values('김철수',500);
select*from membership;


select s.user_name,s.user_addr,m.user_point from student s left outer join membership m on s.user_name=m.user_name
union
select m.user_name,s.user_addr,m.user_point from student s right outer join membership m  on m.user_name=s.user_name;

