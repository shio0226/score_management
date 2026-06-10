//package tool;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//import bean.Student;
//import dao.StudentDAO;
//
//public class LoginAction extends Action {
//	public String execute(
//		HttpServletRequest request, HttpServletResponse response
//	) throws Exception {
//		
//		HttpSession session=request.getSession();
//		
//		String login=request.getParameter("login");
//		String password=request.getParameter("password");
//		StudentDAO dao=new StudentDAO();
//		Student customer=dao.search(login, password);
//		
//		if (customer!=null) {
//			session.setAttribute("customer", customer);
//			return "login-out.jsp";
//		}
//	
//		return "login-errer.jsp";
//	}
//}
