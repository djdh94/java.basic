select *from student;
select*from membership;

select s.user_name,s.user_addr,m.user_point from student s left outer join membership m on
s.user_name=m.user_name
union
select m.user_name,s.user_addr,m.user_point from student s right outer join membership m on
s.user_name=m.user_name;

/* mysql 에서도 프로그래밍이 가능하고
 변수나 함수 등을 지정할수있습니다.
 제한되는 점이 있지만 이를 활용하는 경우가 빈번해서
 먼저 변수지정및출력부터 진행*/
 
 -- <mysql 변수 사용하기>
 -- mysql에서 변수 지정할때는 set @변수명=값; 의 문법을 사용
 set @myvar1=5;
 set @myvar2=3;
 set @myvar3=4.25;
 set @myvar4='가수의 이름->';
 
 -- 변수에 저장된 값을 출력할때는 select @변수명; 사용
 select @myvar1;
 select @myvar2;
 
 -- 만약 계산식 등이 있다면 select 구문 실행 이전에
 -- 계산을 모두 마치고 그 결과를 화면에 보여줍니다.
 select @myvar2+@myvar3;
 
 -- select 구문이 그렇듯 콤마를 이용해서
 -- 출력데이터를 여럿 나열가능
 select @myvar4,user_name from usertbl;
 
 -- 일반 구문에서 limit에는 변수를 입력해서 쓸수없습니다.
 select*from usertbl limit 3;
 select*from usertbl limit @myvar2;
 
 -- prepare 구문
 -- prepare 구문은 가변적으로 들어갈 문장요소 자리를
 -- ?로 구멍을 뚫어놓고, 그 자리를 채우는 방식으로 만듭니다.
 -- 사용법은 prepare구문이름 from '실제쿼리문';
 -- 호출은 execute 구문이름 using 전달변수;
 -- 로 호출
 set @myvar5=3;
 prepare myquery from 
 'select user_name,height from usertbl limit ?';
 -- myquery 실행하기
 -- 저장된 구문의 ?에 값을 전달하기위해 using 전달값을 씁니다.
 execute myquery using @myvar5;
 
 -- mysql 데이터형식과 형변환
 -- 데이터변환시는 cast(),convert() 등의 함수를 이용해서 처리하면 됩니다.
 -- 두 함수의 차이는 없습니다.
 -- cast(실행as바꿀자료형);
 -- convert(실행문,바꿀자료형);
 select avg(amount) from buytbl; -- 실수(double)로 나오는 평균구매수
 
 select cast(avg(amount) as signed integer) from buytbl; -- int로 avg(amount) 변경
 
 -- convert를 써서 자료형을 바꿔출력해보기
 select convert(avg(amount), signed integer)as'평균구매수'from buytbl;
 
 -- cast를 이용하면 날짜 양식을 통일시킬 수 있습니다.
 select cast('2022$01%07' as date);
 
 -- oracle sql 에서는 sysdate,mysql에서는 now()를 이용해
 -- 현재 시간을 확인가능
 select now();
 
 -- <암시적 형 변환(자동형변환)>
 select '100'+200; -- 문자와 숫자연산=>
 select '100'+'300'; -- 문자와 문자연산=>정수로 변환
 select '가나다'+100; -- 숫자로 변환할수없는 문자+정수=> 정수끼리만 연산
 
 -- 만약 문자를 붙여서 출력하고 싶다면 concat()을 활용한다.
 select concat('100','200'); -- 100200붙여서 출력
 select concat(100,'300');
 select concat('가나다',300);
 
 -- 문자는 첫 머리에 숫자가 포함된 경우: 첫글자를 숫자로 변환
 -- 문자만 있는 경우 : 0으로 변환
 -- 논리식의 경우 0은 false, 1은 true
 select 3>'2gmega';
 select 1>'amega';
 
 -- mysql 내장함수
 -- concat,cast,convert 등과 같이
 -- 내부에 이미 선언되어있어서 바로 호출해서 쓸수있는 함수
 
 -- if(수식,참일때 리턴,거짓일때 리턴)
 -- 삼항연산자와 비슷하게 판단
 select if(300>200,'참입니다','거짓입니다');
 
 -- ifnull(수식1,수식2)
 -- 수식1이 null이 아니면 수식1이 반환, 수식1이 null이면 수식2로 반환
 select ifnull(null,'널입니다'),ifnull(100,'널입니다');
 
 -- nullif(수식1,수식2)
 -- 수식1과 수식2가 같으면 null을 반환하고 다르면 수식1가 반환
 select nullif(100,100), nullif(200,100);
 
 -- case~when~else~end
 -- switch ~ case 문과 비슷하게 들어온 자료와 일치하는 구간이 있으면 출력
 -- 없을때는 else쪽 자료를 출력
 -- 단 sql{}로 코드시작,끝나는 범위를 표현하지 않기 때문에
 -- 구문이 끝나는 시점에 end를 써줘야 합니다.
 select 
 case 2
 when 1 then '일'
 when 2 then '오'
 when 10 then '십'
else'모름'
end as'결과';
 
 -- <문자열함수>
 -- 문자열을 조작하는데 쓰고 활용도가 높은 편입니다.
 -- ascii(문자), char(숫자)를 넣으면
 -- 문자는 숫자로,숫자는 문자로 바뀝니다.
 -- char()는 워크벤치상에 버그로 인해 모든 문자가 blob로 표현되고 있습니다.
 -- 원래 값을 보려면 blob -> 우클릭->open value in viewer -> text탭선택
 select ascii('B'),char(97);
 
 -- 문자열의 길이를 그때그때 확인하기 위해서는
 -- char_lenght(문자열)을 사용합니다.
 -- 이때 결과로 나오는 숫자는 문자열의 길이입니다.
 select char_length('가나다라마바사');
 
 -- concat(문자열1,문자열2...);
 select concat('가','다','마');
 
 -- concat_ws('구분자',문자열1,문자열2..);
 -- 문자와 문자열 사이를 구분자를 이용해 붙여줍니다.
 select concat_ws('--','1','3','4','5','10','22');
 
 -- format(숫자,소수점자리)
 select format(1234.588898485,3);
 
 -- bin(숫자),hex(숫자),oct(숫자)
 -- 2진수     16진수	 8진수
 -- 정수로 10진수 숫자를 바꿔서 표현해줍니다.
 select bin(31),hex(31),oct(31);
 
 -- insert(기준문자열,위치,길이,삽입할 문자열);
 -- 기준 문자열의 위치~길이 사이를 지워주고 그사이에 삽입할 문자열을 새로넣어줍니다.
 select insert('adfasdf',3,4,'@@@@');
 
 -- left(문자열,길이),right(문자열,길이)
 -- 해당 문자열의 왼쪽, 오른쪽에서 문자열 길이만큼만 남깁니다.
 select left('asdasd',3),right('asieif',4);
 
 -- ucase(영문자열),lcase(영문자열)
 -- 소문자를 대문자로(upcase)
 -- 대문자를 소문자로(lowcase)
 select lcase('sdfsdcSDFU'),ucase('dfdvASD');
 
 -- upper(문자열),lower(문자열)로 줄여서 쓰기도합니다.
 select upper('sddv'),lower('sdkvn');
 
 -- lpad(문자열,길이,채울문자열),rpad(문자열,길이,채울문자열)
 -- 문자열을 길이만큼 늘려놓고, 빈칸에 채울 문자열을 채워줍니다.
select lpad('마나',5,'#-'),rpad('저것이',6,'#-'); 

-- ltrim(문자열),rtrim(문자열)
-- 문자열의 왼쪽/오른쪽 부분의 공백을 모두 없애줍니다.
-- 단,가운데 부분의 공백은 사라지지않습니다.

select ltrim('    이것이'),rtrim('저것이   ');
select '		이것이','저것이		';

-- trim(문자열),trim(방향 '자를문자' from '대상문자')
-- trim은 기본적으로 ltrim+rtrim형식으로 양쪽의 모든 공백을 다 삭제해줍니다.
-- 공백이 아닌 특정 문자를 삭제하도록 구문을 지정 가능
select trim('	무야호	');

-- 방향은 both(양쪽다), leading(왼쪽),trailing(오른쪽)
-- 중 하나를 고르면 됩니다.
select trim(both 'z'from'zzzzzzdsdzzzz');

-- repeat(문자열,함수)
-- 문자열을 횟수만큼 반복합니다.
select repeat('z',10);

-- replace(문자열,원래문자열,바꿀문자열)
-- 문자열에서 원래문자열을 찾아 바꿀문자열로 교체합니다.
select replace('java로 작성되엇습니다.java','java','mysql');

-- reverse(문자열)
-- 문자열을 인덱스 역순으로 재배치해줍니다.
select reverse('mysql');

-- space(길이)
-- 길이만큼 공백을 사이에 넣어줍니다.
select concat('이것이',space(50),'저것이');

-- substring(문자열,시작위치,길이)
-- substring(문자열 from 시작위치 for 길이)
-- 시작위치부터 길이만큼의 문자를 반환합니다.
-- 길이를 생략하고 파라미터를 2개만 주면
-- 시작지점부터 끝까지 모든 문자를 반환합니다.
select substring('자바스프링야려어애',6,5);
select substring('가나다라마바사'from 1 for 6);
select substring('가나다라마바사'from 6);

-- <sql 프로그래밍과 프로시저>
-- sql에서도 변수선언이 되는것을 봤었지만
-- 심지어 프로그래밍을 진행할 수도 있습니다
-- 문법)
-- delimiter $$ -- 시작지점
-- create procedure 선언할프로시저이름()
-- begin -- 실제 실행코드는 begin 아래에 작성합니다
-- 실행코드..
-- end $$
-- delimiter;

-- 선언해둔 프로시저는
-- call 프로시저명(); 으로 호출 가능합니다.
-- if~else문을 프로시저로 작성

delimiter $$
create procedure ifproc()
begin
declare var1 int;
set var1 = 1000;
if var1 = 100 then
select '100이 맞습니다';
else
select '100이 아닙니다.';
end if;
end $$
delimiter ;
call ifproc();

-- 프로시저 삭제는 drop procedure 프로시저명; (프로시저명 오른쪽에 ()는 뺍니다);
drop procedure ifproc;

-- 테이블 호출 구문을 프로시저로 만들기
-- getuser()로 만들기 usertbl 조회해보기
delimiter $$
create procedure getUser()
begin # 프로시저 내부에서 주석쓰는법 ( #쓰고 한칸뛰는게 주석)
select *from usertbl;
end $$ # 중과로학 없으므로 닫는 부분을 end키워드로 대체
delimiter ;
call getUser();

drop procedure getUser;

-- 프로시저를 활용해 employees 테이블의 10001번 직원외
-- 입사일이 5년이 넘었는지 여부를 확인해보기
-- hire_date 컬럼의 date 자료를 이용해 판단합니다.
use employees;
delimiter $$
create procedure checkFiveYear()
begin
declare hireDATE DATE; #입사일 얻어오기
declare todayDATE DATE; #오늘 날짜 얻어오기
declare days int; # 오늘날짜-입사일 해서 경과일수 얻어오기

select hire_date into hireDate from employees where emp_no=10001;
# hire_date into hireDATE는 위 쿼리문의 결과로 나온 hire_date의 값을
# hireDATE에 저장해줍니다.
set todayDATE=current_DATE(); # 오늘날짜를 구해오는기본기능
set days=datediff(todayDATE,hireDATE); # todayDATE-hireDATE를 수행
# 경과 일수를 구하는 조건문
if(days/365) >=5 then # 입사경과일을 365로 나눠서 5년 이상 체크
select concat('입사한지',days,'일이 경과했습니다.');
else
select concat('5년미만이고,',days,'일째 근무중');
end if;
end $$
delimiter ;
call checkFiveYear();
drop procedure checkFiveYear;








-- 10001이라는 값을 직접 내부에서 선언하지 않고 그때그때 프로시저를 호출할 때마다
-- 값을 바꿔넣을수 있도록 파라미터 처리를 하겠습니다.
delimiter $$
create procedure checkFiveYear2(
emp_number integer
)# checkfiveyear2는 호출시 emp_number를 입력해야함.
begin
declare hireDATE DATE; #입사일 얻어오기
declare todayDATE DATE; #오늘 날짜 얻어오기
declare days int; # 오늘날짜-입사일 해서 경과일수 얻어오기

select hire_date into hireDate from employees where emp_no=emp_number; # 입력받은 emp_number를 활용해 번호를 처리
# hire_date into hireDATE는 위 쿼리문의 결과로 나온 hire_date의 값을
# hireDATE에 저장해줍니다.
set todayDATE=current_DATE(); # 오늘날짜를 구해오는기본기능
set days=datediff(todayDATE,hireDATE); # todayDATE-hireDATE를 수행
# 경과 일수를 구하는 조건문
if(days/365) >=5 then # 입사경과일을 365로 나눠서 5년 이상 체크
select concat('입사한지',days,'일이 경과했습니다.');
else
select concat('5년미만이고,',days,'일째 근무중');
end if;
end $$
delimiter ;
call checkFiveYear2(20000);
drop procedure checkFiveYear;





use ict_practice;

select distinct addr from usertbl;


