package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDAO;

@WebServlet("/Login")
public class login extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("logid");
		String pw = request.getParameter("logpw");
		
		MemberDAO dao = new MemberDAO();
		String isCheck = dao.loginCheck(id, pw);
		
		if(isCheck!=null) {
			//���ǿ����� �̸����� �����Ͻÿ�.
			HttpSession session = request.getSession();
			session.setAttribute("name", isCheck);
			session.setAttribute("id", id);
			//main.jsp�� �̵�
			response.sendRedirect("index.jsp");
			
		}else {
			System.out.println("�α��� ����");
		}
	}

}
