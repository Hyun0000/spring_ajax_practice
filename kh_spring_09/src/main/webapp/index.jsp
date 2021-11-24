<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 중복 체크 테스트</title>
</head>
<body>
	<h3>아이디 중복 체크 확인</h3>
	<label>ID : </label>
	<input type="text" name="id">

	<h3 id="id"></h3>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$("input[name=id]").on("input", function() {
		console.log($("input[name=id]").val());
		$.ajax({
			url : "idCheck",
			type : "post",
			data : {
				id : $("input[name=id]").val()
			},
			success : function(result) {
				console.log(result);
				if (result == "true") {
					$("#id").text("사용 가능한 아이디 입니다.");
				} else {
					$("#id").text("사용할 수 없는 아이디 입니다.");
				}
			},
			error : function(e) {
				$("#checkId").text("ajax 통신 실패");
			}
		});
	});
</script>
</body>
</html>
