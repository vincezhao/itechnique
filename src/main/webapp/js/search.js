/**
 * @author 13075694
 */
function check() {
	var input = $("#kw").val();
	$.ajax({
		type : "POST",
		url : "q/prequery.action",
		data : input,
		success : function(msg) {
			document.getElementById('cn').innerHTML = msg;
		}
	});
}
function clr() {
	$("#kw").val("");
	document.getElementById('cn').innerHTML = "";
}
function verify() {
	var checi = $("#kw").val();
	var regex = /^[a-zA-Z]{0,1}[0-9]{1,5}$/;
	if (checi == "" || null == checi) {
		document.getElementById('cn').innerHTML = "<font color='red'>*请输入车次号</font>";
	} else {
		if (regex.test(checi)) {
			document.getElementById('cn').innerHTML = "<font color='blue'>√ 格式正确</font>";
		} else {
			document.getElementById('cn').innerHTML = "<font color='red'>╳ 请输入正确的车次号</font>";
		}
	}
}

function load(){
	 var latitude = ${latitude};
	 var longitude = ${longtitude};
    var map = new GMap2(document.getElementById("googlemap"));
    map.enableScrollWheelZoom();
    var point = new GLatLng(latitude,longitude);
    var marker = new GMarker(point);//实例化一个标点
    GEvent.addListener(marker, "click", function(){
   	 marker.openInfoWindowHtml("这就是您要找的景点哦,快去看看吧");
    });
    map.setCenter(point , 10);//纬度，经度
    map.addControl(new GSmallMapControl());//地图控件
    map.addControl(new GMapTypeControl());
    map.addOverlay(marker);//把标点添加到地图覆盖物
    window.setTimeout(function(){
      map.panTo(new GLatLng(latitude,longitude));
    }, 5000);
};