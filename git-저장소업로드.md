# git repository(저장소)업로드 하기 
## 원격 저장소
* https://github.com/1zzang-sm/프로젝트.git
* github.com 의 생성한 repository

## local project 
* C:/bizworks/javaworks

## local repository
* local 프로젝트를 local 저장소로 설정 

## git-hub 저장소 생성
1. https://github.com/1zzang-sm 접속
2. github.com/ 로그인 
3. New repository 생성
4. 1zzang-sm/Biz_403_2021_03_Java 이름 지정후 create..

## local 저장소 설정(생성)
* local 프로젝트 폴더를 local 저장소로 설정하기 
1. c:/bizworks/javaworks 폴더에서 git bash 실행
	-bash shell 화면 나타남, window의 cmd와 비슷하게 생김
2. local 저장소 선언
	-git init 
3. local 저장소를 github 계정과 연결
	* git config --local user.name 1zzang-sm
	* git config --local user.email captain1152@naver.com
4. local 프로젝트 압축 준비
* 압축금지 파일 설정 
* touch .gitignore 로 파일 생성
* .gitignore 파일을 sublime text로 열어서 압축금지 파일 정보 등록

5. local 프로젝트를 압축하여 local 저장소에 옮길 준비를 하라. 
* git add .

6. local 저장소에 옮겨라
* git commit -m "comment"

7. local 저장소에 있는 파일들을 원격저장소로 업로드하라
* git push https://github.com/1zzang-sm/biz_403_2021_03_Java.git master


## git local 저장소 설정
* git init
* git config --local user.name ()
* git config --local user.email ()
* git add .
* git commit -m "comment"
* git push https://.... master
* git push https://github.com/1zzang-sm/Biz_403_2021_03_Java.git master

## 원격저장소와 연결된 프로젝트에 새로운 코드 추가하기
* git add . 
* git commit -m "Hello_02 추가"
* git push https://github.com/1zzang-sm/Biz_403_2021_03_Java.git master