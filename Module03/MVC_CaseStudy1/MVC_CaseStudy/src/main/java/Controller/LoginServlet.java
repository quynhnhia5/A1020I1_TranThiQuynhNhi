package Controller;

import Model.BEAN.employee.user;
import Model.repository.Impl.DBConnection;
import Model.service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "LoginServlet" ,urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = DBConnection.CreateConnection();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user user = new user();
        user.setUsername(username);
        user.setPassword(password);

////        username = LoginService.exportMembername(request, conn, user);
        String authentication = LoginService.AuthenticationMember(request, conn, user);
        HttpSession session = request.getSession(true);
//
//        session.setAttribute("sessionuser", username);
//        RequestDispatcher rd = request.getRequestDispatcher("HomeForward");
//        rd.forward(request, response);

        if (authentication.equals("success")) {
//            HttpSession session = request.getSession(true);

            session.setAttribute("sessionuser", username);
            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            rd.forward(request, response);


        } else {
            if (authentication.equals("fail")) {
                request.setAttribute("msglogin", "Tên đăng nhập hoặc mật khẩu sai");
                RequestDispatcher rd = request.getRequestDispatcher("loginForward");
                rd.forward(request, response);

            }
        }


    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}