//package tool;
//
//import java.util.List;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import bean.StudentExp;
//import dao.StudentDAO;
//
//public class StudentSearchAction extends Action{
//
//	@Override
//	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO 自動生成されたメソッド・スタブ
//		String keyword = request.getParameter("keyword");
//		
//		StudentDAO dao = new StudentDAO();
//		List<StudentExp> list = dao.partialMatchSearchByName(keyword);
//		
//		request.setAttribute("keyword", list);
//		
//		return "studentSearch.jsp";
//	}
//
//}
