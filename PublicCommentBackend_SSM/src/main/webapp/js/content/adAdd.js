$(function() {
	common.showMessage($("#message").val());
});

function add() {
	if(check()) {
		$("#mainForm").submit();
	}
}

//验证
function check() {
	//表单添加上验证信息
	$("#mainForm").validate({
		rules:{
			"title" : "required",
			"link" : "required",
			"imgFile" : "required",
			"weight" : {
				required : true,
				digits : true,
				maxlength : 5
			}
		},
		messages : {
			"title" : "标题不可缺少！",
			"imgFile" : "请选择上传的图片！"
		}
	})
	return true;
}

//返回列表方法
function goback() {
	location.href = $('#basePath').val() + '/ad';
}