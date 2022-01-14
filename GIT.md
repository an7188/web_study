# 😺 GIT 



## GIT이란?

→ 버전 관리 시스템

- CLI로 관리하는  git bash
- GUI로 관리하는 소스트리

## GITHub

git으로 관리하는 프로젝트를 올려둘 수 있는 git 호스팅 사이트

### 용어

- Working Directory: 개발자의 현재 시점으로 소스코드를 수정하며 개발하는 공간을 의미
- Staging Area: Working Directory에서 작업한 파일을 Local Repository에 전달하기 위해 파일들을 분류하는 공간
- Local Repository: 로컬 저장소이며 작업한 파일들을 저장해두는 내부 저장소 (.git 폴더)
- Remote Repository: 원격 저장소이며 인터넷으로 연결되어 있어 있는 외부 저장소 (웹 페이지에서 보이는 공간)
- Branch: Remote Repository의 현재 상태를 복사하여 master 브랜치와 별개의 작업을 진행할 수 있는 공간 (보통 브랜치를 생성하여 개발을 진행하고 개발을 완료하면 master 브랜치에 병합하여 개발 완료된 소스코드를 합침)
- Head: 현재 작업중인 브랜치의 최근 커밋된 위치
- fork : 다른 프로잭트의 저장소에 들어있는 모든 내용을 복사해 와서 자신의 저장소를 만드는 작업.
- master : master branch 라고도 하며 맨처음 프로잭트를 시작했을때 생성된 개발라인을 말한다.
- github : git의 기능을 이용하여 저장소를 쉽게 서비스할 수 있는 서버.
- pull request : fork하여 온 내용에서 변경사항이 있을 경우 원본 저장소의 관리자에게 pull을 요청하는 작업
- repository : 프로잭트를 위한 파일이 저장되어있는 저장소.
- commit : 코드의 변경사항이 있을시 변경자가 변경된 모든 내용을 메모하여 기록하는 것.
- merge : 서로 다른 두 코드를 병합하여 하나의 결과물로 만드는 작업.
- push : 개인이 로컬에서 커밋한 모든 변경사항을 원격저장소로 업로드 하여 병합하는 작업.
- pull : 원격저장소의 커밋을 로컬저장소에 내려받는 것
- fetch : 원격저장소의 버전을 로컬로 병합하지 않고 내려받는 작업.
- fork : 다른 프로잭트의 저장소에 들어있는 모든 내용을 복사해 와서 자신의 저장소를 만드는 작업.
- pull request : fork하여 온 내용에서 변경사항이 있을 경우 원본 저장소의 관리자에게 pull을 요청하는 작업.
- branch : 현 시점의 저장소를 프로잭트 내에서 복사하여 만든 새로운 개발라인.
- master : master branch 라고도 하며 맨처음 프로잭트를 시작했을때 생성된 개발라인을 말한다.
- github : git의 기능을 이용하여 저장소를 쉽게 서비스할 수 있는 서버.
- checkout :  원하는 지점으로 파일을 되돌릴 수 있다.

### 명령어

**1. 처음 시작**

`git init` : 저장소 초기화 (.git 폴더 생성)

- .git을 로컬저장소라고 부른다.

`git clone`   : 저장소 복제

`git add`  : 백업에 포함할 파일들 설정! (.으로 시작하면 이 폴더 안에 있는 모든 것을 대상으로 하겠다는것!)

`git commit -m “메세지 내용”` : 변경 사항 기록!

`git push`  : 저장!

`git pull` : 저장소에 있는 파일들을 내 피씨로 당겨올때



**2. 백업 내용을 되돌리기**

`git logs` : 커밋 히스토리들 확인

```
git reset —hard 주소
```





**3. 브랜치**

`git branch “브랜치명”` : 브랜치 생성

`git branch` : 브랜치 확인





**4. 계정 정보 확인**

```
git config --list
git config --global --list
```

**(1) 계정 정보 설정**

✔️ 작업 폴더의 이름과 아이디 변경

`git config user.name 이름`

`git config user.email 이메일`

✔️ git 전체에 email 변경

`git config --global user.name 이름`

`git config --global user.email 이메일`



**5. 커밋 돌리기**

`git log` : 커밋 내역 보기

`git checkout (커밋 아이디 전체 또는 앞 7자리)` : 커밋 되돌리기
