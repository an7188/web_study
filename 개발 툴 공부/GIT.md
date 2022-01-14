# GIT 명령어



**1. 버전 확인 **

```
git --version
```



**2. 계정 정보 확인 **

```
git config --list
```

``` 
git config --global --list
```



📌 내 깃허브 이메일과 동일한지 꼭 확인!! 아님 잔디 안심어짐 



**3. 계정 정보 변경**

✔️ 작업 폴더의  이름과 아이디 변경

``` git config user.name
git config user.name 이름
```

```
git config user.email 이메일
```



✔️ git 전체에 email 변경

``` git config user.name
git config --global user.name 이름
```

``` git config user.name
git config --global user.email 이메일
```





**4. 깃 업로드**

[파일 스테이징]

```
git add .
```

[메시지와 함께 커밋]

```
git commit -m "내용"
```

[원격 저장소 저장]

```
git push
```



