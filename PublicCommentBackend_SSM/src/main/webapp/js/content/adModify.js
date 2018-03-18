//给修改的表单添加验证信息
$(function(){
	//调用显示信息的方法
	if($("#message").val().length>0){
		common.showMessage($("#message").val());
		//显示一次后，将消息制空
		$("#message").attr("value","");
	}
	
	
	//表单添加上验证信息
	$("#mainForm").validate({
		rules:{
			"title" : "required",
			"link" : "required",
			"weight" : {
				required : true,
				digits : true,
				maxlength : 5
			}
		},
		messages : {
			"title" : "标题不可缺少！"
		}
	})
})

//修改的表单提交
function modify() {
	$("#mainForm").submit();
}

//返回广告管理初始页
function goback() {
	location.href = $('#basePath').val() + '/ad';
}