//package tool;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//import bean.Student;
//
//public class StudentAddAction extends Action {
//
//    @SuppressWarnings("unchecked")
//    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//        HttpSession session = request.getSession();
//
//        int id = Integer.parseInt(request.getParameter("student.id"));
//        String name = request.getParameter("student.name");
//        int courseId = Integer.parseInt(request.getParameter("student.course"));
//
//        List<Student> list = (List<Student>)session.getAttribute("list");
//
//        if (list == null) {
//            list = new ArrayList<>();
//            session.setAttribute("list", list);
//        }
//
//        Student student = new Student();
//        student.setStudentId(id);
//        student.setStudentName(name);
//        student.setCourseId(courseId);
//
//        list.add(student);
//
//        return "koukasokutei/studentAdd.jsp";
//    }
//}