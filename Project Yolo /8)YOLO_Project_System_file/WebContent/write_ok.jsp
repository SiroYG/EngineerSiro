<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<jsp:useBean id="dao" class="board.DAO" />
<jsp:useBean id="vo" class="board.VO" />
<jsp:setProperty name="vo" property="*" />

<%
	String hotelid = request.getParameter("hotelid");
	request.setCharacterEncoding("euc-kr");
	int max = dao.getMax();
	dao.insertWrite(vo, max, hotelid);
%>

<script language=javascript>
	self.window.alert("�Է��� ���� �����Ͽ����ϴ�.");
	location.href = "board.jsp?hotelid=<%=hotelid%>";
</script>