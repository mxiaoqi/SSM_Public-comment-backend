//给修改的表单添加验证信息
$(function(){
	//调用显示信息的方法
	if($("#message").val().length>0){
		common.showMessage($("#message").val());
		//显示一次后，将消息制空
		$("#message").attr("value","");
	}
})


function remove(id) {
	if(confirm("确定要删除这条广告吗？？？")) {
		$("#mainForm").attr("action",$("#basePath").val() + "/businesses/remove?id="+id);
		$("#mainForm").submit();
	}
}

function search(currentPage) {
	$("#currentPage").val(currentPage);
	$("#mainForm").submit();
}

function modifyInit(id) {
	location.href = $("#basePath").val() + "/businesses/modifyInit/" + id;
}