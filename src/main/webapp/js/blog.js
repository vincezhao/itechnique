function check(){
	var username = $("#username").val();
	$.ajax({
		type : "POST",
		url : "https://localhost:8443/itechnique/index/check.htm",
		data : {"username":username},
		success : function(msg) {
			alert(msg);
			if(msg == "yes"){
				$("#nametip").val("用户名已经存在");
			}
			if(msg == "no"){
				$("#nametip").val("用户名可用");
			}
		}
	});
}


function register() {
	var username = $("#username").val();
	var password = $("#password").val();
	$.ajax({
		type : "POST",
		url : "https://localhost:8443/itechnique/index/register.htm",
		data : {"username":username,"password":password},
		success : function(msg) {
			alert(msg);
		}
	});
}