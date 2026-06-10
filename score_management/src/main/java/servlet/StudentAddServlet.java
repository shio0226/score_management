//
package servlet;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import bean.Student;
import dao.StudentDAO;

@WebServlet("/StudentAddServlet.action")
public class StudentAddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            request.setCharacterEncoding("UTF-8");

            // 入力取得
            String name = request.getParameter("student.name");
            int courseId = Integer.parseInt(request.getParameter("student.course"));

            // Student作成
            Student stu = new Student();
            stu.setStudentName(name);
            stu.setCourseId(courseId);

            //DBに登録
            StudentDAO dao = new StudentDAO();
            dao.insertStudent(stu);

            // 完了画面へ
            request.getRequestDispatcher("/koukasokutei/studentAddResult.jsp")
            .forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            request.getRequestDispatcher("/koukasokutei/studentAdd.jsp")
                   .forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}