//package tool;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import dao.StudentDAO;
//
//public class StudentListAction extends Action {
//
//    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//        StudentDAO dao = new StudentDAO();
//
//        // コース名付きで取得
//        request.setAttribute("list", dao.selectAllWithCourseName());
//
//        return "koukasokutei/studentList.jsp";
//    }
//}