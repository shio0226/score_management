//DBから学生一覧を取って、JSPに渡して表示するクラス
package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.StudentDAO;

@WebServlet("/StudentListServlet.action")
public class StudentListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	//listという名前でデータをJSPに渡す
        try {
            StudentDAO dao = new StudentDAO();
            request.setAttribute("list", dao.selectAllWithCourseName());
            request.getRequestDispatcher("/koukasokutei/studentList.jsp").forward(request, response);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}