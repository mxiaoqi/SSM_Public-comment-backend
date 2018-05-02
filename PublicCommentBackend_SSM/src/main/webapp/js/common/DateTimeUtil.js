//endTime.valueOf()   返回这个时间的时间戳

/**
 * 格式化时间戳返回时间格式
 * @param inputTime 时间戳
 * @returns {String} 日期格式
 */
function formatDateTime(inputTime) {    
    var date = new Date(inputTime);  
    var y = date.getFullYear();    
    var m = date.getMonth() + 1;    
    m = m < 10 ? ('0' + m) : m;    
    var d = date.getDate();    
    d = d < 10 ? ('0' + d) : d;    
    var h = date.getHours();  
    h = h < 10 ? ('0' + h) : h;  
    var minute = date.getMinutes();  
    var second = date.getSeconds();  
    minute = minute < 10 ? ('0' + minute) : minute;    
    second = second < 10 ? ('0' + second) : second;   
    return y + '-' + m + '-' + d+' '+h+':'+minute+':'+second;    
};  


/**
 * 返回相差分钟数
 * @param datestr1 更早的日期 小的日期
 * @param datestr2 后面的日期 大的日期
 * @returns 返回两个时间差的天数小时数分数秒数和毫秒数
 */
function DiffLong(datestr1, datestr2) {
	var date1 = new Date(Date.parse(datestr1.replace(/-/g, "/")));
	var date2 = new Date(Date.parse(datestr2.replace(/-/g, "/")));
	var datetimeTemp;
	//前面一个值是否大于后面一个值
	var isLater = true;
	if (date1.getTime() > date2.getTime()) {
		isLater = false;
		datetimeTemp = date1;
		date1 = date2;
		date2 = datetimeTemp;
	}
	difference = date2.getTime() - date1.getTime();
	thisdays = Math.floor(difference / (1000 * 60 * 60 * 24));
	difference = difference - thisdays * (1000 * 60 * 60 * 24);
	thishours = Math.floor(difference / (1000 * 60 * 60));
	minute = Math.floor(difference / (1000 * 60));

	if (!isLater) {
		//前面一个值大于后面一个值
		minute = minute - 2 * minute;
	}
	return minute;
}
