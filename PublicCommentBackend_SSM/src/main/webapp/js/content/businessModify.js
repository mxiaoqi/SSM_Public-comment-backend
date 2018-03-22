//给修改的表单添加验证信息
$(function(){
	//调用显示信息的方法
	if($("#message").val().length>0){
		common.showMessage($("#message").val());
		//显示一次后，将消息制空
		$("#message").attr("value","");
	}
})


function modify() {
	debugger;
	if(check()) {
		$("#mainForm").submit();
	}
}

//表单添加上验证信息
function check() {
	$("#mainForm").validate({
		rules:{
			"title" : "required",
			"subtitle" : "required",
			"city" : "required",
			"category" : "required",
			"price" : {
				required : true,
			},
			"distance" : {
				required : true,
				digits : true,
				maxlength : 6
			},
			"desc" :  "required"
			
		},
		messages : {
			"title" : "标题不可缺少！",
			"subtitle" : "副标题不可缺少!",
			"imgFile" : "请选择上传的图片！",
			"city" : "请选择商户所在城市。。。",
			"category" : "请选择商户的类别。。。",
			"distance" : "没有距离用户怎么看。",
			"price" : "钱不赚了吗？",
			"desc" : "描述一下呗"
		}
	})
	
	return true;
}


