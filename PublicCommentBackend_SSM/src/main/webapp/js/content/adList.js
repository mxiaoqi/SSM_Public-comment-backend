$(function() {
	common.showMessage($("#message").val());
});

function search(currentPage) {
	$("#currentPage").val(currentPage);
	$("#mainForm").submit();
}

function remove(id,currentPage) {
	if(confirm("确定要删除这条广告吗？？？")) {
		$("#id").val(id);
		$("#currentPage").val(currentPage);
		$("#mainForm").attr("action",$("#basePath").val() + "/ad/remove.action");
		$("#mainForm").submit();
	}
}

function modifyInit(id) {
	$("#id").val(id);
	$("#mainForm").attr("action",$("#basePath").val() + "/ad/modifyInit.action");
	$("#mainForm").submit();
}