<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/goods/css/index3.css" />
</head>
<body>
	<div align="center">
		<font size="6px" color="green">商品查询界面</font>
	</div>
	<table align="center" border="1" cellspacing="0" cellpadding="0">
		<tr>
			<td colspan="4"><a href="">
					<button>全选</button>
			</a> <a href="">
					<button>反选</button>
			</a> <a href="">
					<button>不选</button>
			</a></td>
			<td colspan="4"><a href="/goods/toAdd.do">
					<button>添加</button>
			</a> <a href="">
					<button>批量删除</button>
			</a> <a href="">
					<button>注销</button>
			</a></td>
		</tr>
		<tr>
			<td><input type="checkbox" /></td>
			<td>商品照片</td>
			<td><font size="3px" color="green">商品名称</font></td>
			<td><font size="3px" color="brown">商品尺寸</font></td>
			<td><font size="3px" color="red">商品价格</font></td>
			<td><font size="3px" color="blue">商品库存</font></td>
			<td><font size="3px" color="violet">商品简介</font></td>
			<td><font size="3px" color="brown">商品操作</font></td>
		</tr>
		<tr>
			<c:forEach items="${goodList}" var="good">
				<tr>
					<td><input type="checkbox" /></td>
					<td><img src="${good.img}" width="100px" height="100px" /></td>
					<td><font size="3px" color="green"> ${good.gname}</font></td>
					<td><font size="3px" color="brown">${good.size}</font></td>
					<td><font size="3px" color="red">￥${good.price}</font></td>
					<td><font size="3px" color="blue">${good.num}个</font></td>
					<td><font size="3px" color="violet">${good.label}</font></td>

					<td><a href="#">
							<button>修改</button>
					</a> <a href="#">
							<button>删除</button>
					</a></td>
				</tr>
			</c:forEach>
		<tr style="text-align: center">
			<td colspan="10">${pageList}</td>
		</tr>
	</table>

</body>
</html>