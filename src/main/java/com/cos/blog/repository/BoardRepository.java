package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.blog.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer>{

}

/*
 * 
 * config

../.../../** -> controller been - 의존성주입

mvc 패턴

model view controller

data - dto 

Map<String, Object> paramMap = ha

key "id", value "ggg111"

개발자가 db 

> 목표 : 게시판


목표 - 홈쇼핑 - 기준 쿠팡

대충 안다 -> 의미x

내가 그게 뭔지 안다 

내가 @controller 에 대해서 완벽히 안다
Spring - @controller 를 붙였을때 처음부터 끝까지 어떻게 동작 하는지
req get post put(rest) delete -> 각자 차이, 동작 원리

원리 - 오류 쉽게 고치기


개발자맵 - 로드맵


테이블 O -> entity -> 수정x DB 완전 똑같아야 함
DTO -> Map (param)
+ id
+ deptCode
extend 

마이바티스 xml 조건문 where 값 -> DB x

DAO - (DTO + 커넥션 풀 DB 연결 세팅) 객체 

의존성 DI 



자바 프로그래밍 - 스터디 해야 하는 페이지

9p 클래스
10p static 키워드
13p import package
14p 생성자

30 - 메모리 구조 전부 다
JVM 메모리 구조 30
4.1 메소드 영역
메서드 영역은 JVM이 시작될 때 생성되는 공간으로 바이트 코드(.class)를 처음 메모리 공간에 올릴 때 초기화되는 대상을 저장하기 위한 메모리 공간이다.
프로그램이 종료될 때까지 저장

4.2 스택 영역
int, long, boolean 등 기본 자료형을 생성할 때 저장하는 공간 = 스택 영역
LIFO 구조

4.3 힙 영역
new 연산자로 생성되는 클래스와 인스턴스 변수, 배열 타입 등 Reference Type이 저장되는 공간 =  힙 영역


자바 플랫폼 38. EE
자바 플랫폼 소개
5.1 Java SE
5.2 Java EE
5.3 Java ME

75p ~ 105 전부 다
Java Collection Framework
9.1 Collection 프레임워크, JCF
JCF란 자료구조 모음

List 인터페이스: 순서가 있는 데이터의 집합으로, 중복된 데이터를 허용합니다. ArrayList, LinkedList, Vector 등이 대표적인 구현 클래스입니다.
Set 인터페이스: 순서가 없는 유일한 데이터의 집합으로, 중복된 데이터를 허용하지 않습니다. HashSet, TreeSet 등이 대표적인 구현 클래스입니다.
Queue 인터페이스: FIFO(First-In-First-Out) 방식의 데이터 구조로, 데이터의 추가와 제거가 끝에서만 일어납니다. LinkedList, PriorityQueue 등이 대표적인 구현 클래스입니다.
Map 인터페이스: 키와 값으로 이루어진 데이터의 집합으로, 순서가 없습니다. 키는 중복될 수 없으며, 값은 중복될 수 있습니다. HashMap, TreeMap, LinkedHashMap 등이 대표적인 구현 클래스입니다.

9.2 JCF 인터페이스

9.3 JCF 컬렉션

9.4 JCF 기반구조(Infrastructure)

9.5 JCF 유틸리티






자바 서적
173
233
261
285
375~482
532
558 Interger
583
611
713(어려울 수 있음)



클래스 : 틀 또는 설계도
오브젝트 : 객체
인스턴스 : 클래스 안에 각각의 객체들
인스턴스화 하다 : 메서드
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
ex) 붕어빵틀 = 클래스
	 붕어빵 = Object
	 각각의 붕어빵 = 인스턴스
	 붕어빵을 굽다 = 인스턴스화( 동작 / 메소드)
	 
	 
스테틱은 상수 정의 할 때 같이 사용.
const / final : 상수

Static(정적)은 고정된이라는 의미를 가지고 있으며, 
프로그램이 시작되는 시점에 클래스 로더가 클래스를 해석하여 메소드 영역 혹은 
힙 영역에 클래스 메타 데이터 및 정적 변수 등을 적재한다.

스테틱은 힙 영역에 저장

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
스프링 작동 원리

1. 톰켓 시작이 되면 필터가 메모리에 올라감
필터 -권한, 인증, 한글 등 걸러짐

2. 그다음 디스패처가 메모리에 올라감
- 사용자들이 주소("/","/admin"등등 )를 요청하면 디스패처가 확인을 해서 적절한 컨트롤러에게 요청을 함.
디스패처란: 중간에 어떤 주소가 들어오는지 확인, 그 주소에 맞는 컨트롤러에게 요청을 하는 것

3. controller > sevice > JPArepository > 영속성 컨텍스트
- 기존의 떠있는 애들 재사용x 
요청 시마다 메모리에 뜨고, 쓰레드를 추가해서 이 4개가 지속적으로 계속 뜨게 됨.

4. 톰켓 시작 시 datasource는 미리 딱 한개가 메모리에 뜸
DB랑 직접적으로 연결이 되어 있음

view resoluer, 인터셉터 메모리에 뜸



사용자가 로그인 요청 > request 요청을 함 
그럼 톰켓이 시작이 되어 있어야 하고, 
필터가 걸러주고
디스패처도 메모리에 떠있어야 함. 

ex) http://localhost:8000/login (POST요청) 이렇게 보내면
http Body : username, password의 값을 들고 요청이 들어옴

그러면 디스패처가 /login이라는 주소가 들어있는 controller를 메모리에 띄우고 찾음.
그 컨트롤러에서 username과 password를 받음.

>그다음 서비스한테 넘김
login 해달라고 요청을 하면 
서비스에서 login이라는 서비스 시작.

서비스가 로그인을 하려면 
이 username과 password에 맞는 사용자가 있나요 하고 

JPArepository에 select 요청을 해야됨.

JPArepository는 자기가 들고있는 함수 호출
ex) select * from user
where username = ?
and password = ?

> 해당 요청에 대한 영속성 컨텍스트가 있는지 확인을 함

user 테이블에서 확인을 하면
영속성 컨텍스트에 존재하니?

서비스에서 userObject가 null이 아니면 세션에 userObject 등록하고
그사람한테 인증이 필요한 페이지로 이동 ex) "/"



- 인터셉터 실행 전, 후로 권한처리, 인증처리
: 함수가 실행되기 전에
세션이 있는지 확인 - 권한체크

- 필터는 걸러내기


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
1. 스프링 부트 - 블로그
2. 스프링 부트 - Validation 체크 
3. 스프링 부트 - AoP 로그 파일 생성!! - 파일!!
4. 스프링 부트 - Sentry.io - 휴대폰 바로바로 확인
5. 스프링 부트 - Security - OAuth2.0-Client 페이스북, 구글 로그인 (공식)
6. 스프링 부트 - Security - OAuth2.0-Client 네이버 로그인 구현 (비공식)
7. 스프링 부트 - Security - JWT 웹 토큰을 이용해서 인증, 권한
8. 스프링 부트 - Security - OAuth2.0-Client - 페이스북, 구글 로그인 - JWT 이용 - Sentry 로그 관리 - Validation 체크 - Exception 처리

- React 그리고 앱(flutter)

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
React - Node.js - Firestore - 8번에 붙임
Flutter - 고급 강의 (앱) 8번에 붙임

- 넷플릭스, 유튜브, 오늘의집, 당근마켓, 인스타그램 (하나 선택)
- React, Flutter, 스프링부트 JPA
- 배포 (코버네티스)





 */
