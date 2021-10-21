package Controller;

import Model.BEAN.User;
import Model.service.Impl.UserServiceImpl;
import Model.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet",urlPatterns = {"","/user"})
public class UserServlet extends HttpServlet {
  UserService userService = new UserServiceImpl();

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if (action == null) {
      action = "";
    }
    switch (action) {
      case "create":
        try {
          createUser(request, response);
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
        break;
      case "edit":
        try {
          updateUser(request,response);
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
        break;
    }

  }

  private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String count = request.getParameter("country");
    User user = new User(id, name, email, count);
    userService.update(user);
    showListUser(request,response);
//    RequestDispatcher dispatcher = request.getRequestDispatcher("user/edit.jsp");
//    dispatcher.forward(request, response);

  }

  private void createUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String count = request.getParameter("country");
    User user = new User(id, name, email, count);
    userService.create(user);
    showListUser(request, response);

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if (action == null) {
      action = "";
    }
    switch (action) {
      case "create":
        showFormCreate(request, response);
        break;
      case "delete":
        try {
          deleteUser(request,response);
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
        break;
      case "edit":
        try {
          showFormEdit(request,response);
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
        break;
      case "search":
        try {
          searchCountry(request,response);
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
        break;

      default:
        try {
          showListUser(request, response);
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
    }
  }

  private void searchCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    String countrySearch=request.getParameter("country");
    List<User> UserCountryList = userService.searchCountry(countrySearch);
    request.setAttribute("UserCountryList",UserCountryList);
    request.getRequestDispatcher("user/search.jsp").forward(request,response);
  }

  private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    int id=Integer.parseInt(request.getParameter("id"));
    User user=userService.selectById(id);
    request.setAttribute("user",user);
    request.getRequestDispatcher("user/edit.jsp").forward(request,response);
  }

  private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    int id=Integer.parseInt(request.getParameter("id"));
    userService.delete(id);
    request.setAttribute("msgDelete","delete successful");
    showListUser(request, response);

  }

  private void showListUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    List<User> userList = userService.findAll();
    request.setAttribute("userList", userList);
    request.getRequestDispatcher("user/list.jsp").forward(request, response);
  }

  private void showFormCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("user/create.jsp").forward(request, response);
  }
}
