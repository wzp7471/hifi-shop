<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String pathb = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + pathb + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script type="text/javascript"
        src="<%=basePath%>admin/js/jquery.js"></script>
<title>商品信息管理 &middot; jshoper</title>
</head>

<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
   <script type="text/javascript">
   function al() {
	   $.ajax({
		   type:"POST",
		   url:"http://123.57.216.21:8080/hifi-shop/app/findAllGoodsCategoryTforAndroid.action",
		   dataType:"jsonp",
		   jsonp:"callback",
		   success:function(data) {
			   alert(data);
		   }
	   });
   }
   al();
   </script>
</body>
</html>


<%!private String htmlspecialchars(String str) {
        str = str.replaceAll("&", "&amp;");
        str = str.replaceAll("<", "&lt;");
        str = str.replaceAll(">", "&gt;");
        str = str.replaceAll("\"", "&quot;");
        return str;
    }%>
