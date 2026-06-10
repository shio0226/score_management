package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import bean.StudentExp;
import dao.StudentDAO;

@WebServlet("/StudentSearchServlet.action")
public class StudentSearchServlet extends HttpServlet {

    // 🔹 画面表示（検索画面）
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/koukasokutei/studentSearch.jsp")
               .forward(request, response);
    }

    // 🔹 検索処理
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            request.setCharacterEncoding("UTF-8");

            // 入力取得
            String keyword = request.getParameter("keyword");

            // DAO呼び出し（DB検索）
            StudentDAO dao = new StudentDAO();
            List<StudentExp> list = dao.partialMatchSearchByName(keyword);

            // JSPに渡す
            request.setAttribute("list", list);

            //検索結果画面へ
            request.getRequestDispatcher("/koukasokutei/studentSearchResult.jsp")
                   .forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();

            // エラー時は検索画面に戻す
            request.getRequestDispatcher("/koukasokutei/studentSearch.jsp")
                   .forward(request, response);
        }
    }
}