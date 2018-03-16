$(function() {
	common.showMessage($("#message").val());
});

//分页查询功能，获取分页组件传过来的当前页码
function search(currentPage) {
	$("#currentPage").val(currentPage);
	$("#mainForm").submit();
}

//删除方法（根据传进来的id，currentPage是记录当前的分页数，才不会让删除后分页失效）
function remove(id,currentPage) {
	if(confirm("确定要删除这条广告吗？？？")) {
		$("#id").val(id);
		$("#currentPage").val(currentPage);
		$("#mainForm").attr("action",$("#basePath").val() + "/ad/remove");
		$("#mainForm").submit();
	}
}

function modifyInit(id) {
	$("#id").val(id);
	$("#mainForm").attr("action",$("#basePath").val() + "/ad/modifyInit");
	$("#mainForm").submit();
}