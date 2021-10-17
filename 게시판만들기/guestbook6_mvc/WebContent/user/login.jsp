<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp" %>
<c:if test="${cookie.ssafy_id.value ne null}">
	<c:set var="saveid" value="${cookie.ssafy_id.value}"/>
	<c:set var="idck" value=" checked=\"checked\""/>
</c:if>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SSAFY - 로그인</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        mark.orange {
            background: linear-gradient(to top, orange 20%, transparent 30%);
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#loginBtn").click(function () {
                if (!$("#userid").val()) {
                    alert("아이디 입력!!!");
                    return;
                } else if (!$("#userpwd").val()) {
                    alert("비밀번호 입력!!!");
                    return;
                } else {
                    $("#loginform").attr("action", "${root}/user").submit();
                }
            });
            $("#mvRegisterBtn").click(function () {
                location.href = "${root}/user?act=mvregister";
            });
        });
    </script>
</head>
<body>
    <div class="container text-center mt-3">
        <div class="col-lg-8 mx-auto">
            <h2 class="p-3 mb-3 shadow bg-light"><mark class="orange">로그인</mark></h2>
            <form id="loginform" class="text-left mb-3" method="post" action="">
                <input type="hidden" name="act" id="act" value="login">
                <div class="form-group form-check text-right">
                    <label class="form-check-label">
                        <input class="form-check-input" type="checkbox" id="idsave" name="idsave" value="saveok"${idck}> 아이디저장
                    </label>
                </div>
                <div class="form-group">
                    <label for="userid">아이디</label>
                    <input type="text" class="form-control" id="userid" name="userid" placeholder="" value="${saveid}">
                </div>
                <div class="form-group">
                    <label for="userpwd">비밀번호</label>
                    <input type="password" class="form-control" id="userpwd" name="userpwd" placeholder="">
                </div>
                <div class="text-danger mb-2">${msg}</div>
                <div class="form-group text-center">
                    <button type="button" id="loginBtn" class="btn btn-outline-warning">로그인</button>
                    <button type="button" id="mvRegisterBtn" class="btn btn-outline-primary">회원가입</button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>