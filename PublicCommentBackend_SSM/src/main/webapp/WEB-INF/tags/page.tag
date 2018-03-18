<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ attribute type="cn.lqandzy.bean.Page" name="page" required="true" %>
<%@ attribute type="String" name="jsMethodName" required="true" %>

<script type="text/javascript">
	//返回分页数量 
	function transCurrentPage(currentPage) {
		//计算分页数量,解决分页问题
		var rule = /^[0-9]*[1-9][0-9]*$/;
		if(!rule.test(currentPage)) {
			currentPage = 1;
		}
		//计算完成分页，将主权交回去。调用其他的js方法
		eval("${jsMethodName}(currentPage)");
	}
</script>

<div class="page fix">
	<a href="javascript:transCurrentPage('1');" class="first">首页</a>
	<a href="javascript:transCurrentPage('${page.currentPage - 1}');" class="pre">上一页</a>
	
	当前第<span>${page.currentPage}/${page.totalPage}</span>页
	
	<a href="javascript:transCurrentPage('${page.currentPage + 1}');" class="next">下一页</a>
	<a href="javascript:transCurrentPage('${page.totalPage}');" class="last">末页</a>
	
	跳至 &nbsp;<input id="currentPageText" value="1" class="allInput w28" type="text"/>&nbsp;页 &nbsp;
	
	<a href="javascript:transCurrentPage($('#currentPageText').val());" class="go">GO</a>
</div>