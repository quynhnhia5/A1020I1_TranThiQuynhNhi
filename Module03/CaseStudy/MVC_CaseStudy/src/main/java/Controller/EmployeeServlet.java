package Controller;

import Model.BEAN.customer.customer;
import Model.BEAN.employee.employee;
import Model.service.*;
import Model.service.Impl.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;


@WebServlet(name = "EmployeeServlet",urlPatterns = {"/employee"})
public class EmployeeServlet extends HttpServlet {
  EmployeeService employeeService=new EmployeeServiceImpl();
  PositionService positionService=new PositionServiceImpl();
  EducationDegreeService educationDegreeService=new EducationDegreeServiceImpl();
  DivisionService divisionService=new DivisionServiceImpl();
  UserService userService=new UserServiceImpl();
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if (action == null) {
      action = "";
    }
    switch (action){
      case "create":
        try {
          createEmployee(request, response);
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
        break;
      case "delete":
        try {
          deleteEmployee(request,response);
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
        break;
      case "edit":
        try {
          updateEmployee(request,response);
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
        break;


      default:
        try {
          showListEmployee(request,response);
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
    }
  }
  private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException {
    int id = Integer.parseInt(request.getParameter("employee_id"));
    employeeService.deleteEmployee(id);
    try {
      response.sendRedirect("/employee");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    int employee_id = Integer.parseInt(request.getParameter("employee_id"));
    String employee_name = request.getParameter("employee_name");
    String employee_birthday = request.getParameter("employee_birthday");
    String employee_id_card = request.getParameter("employee_id_card");
    double employee_salary = Double.parseDouble(request.getParameter("employee_salary"));
    String employee_phone = request.getParameter("employee_phone");
    String employee_email = request.getParameter("employee_email");
    String employee_address = request.getParameter("employee_address");
    int  position_id = Integer.parseInt(request.getParameter("position_id"));
    int  education_degree_id = Integer.parseInt(request.getParameter("education_degree_id"));
    int  division_id = Integer.parseInt(request.getParameter("division_id"));
    String username = request.getParameter("username");
    employee employee=new employee(employee_id,employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,
            employee_email,employee_address,position_id,education_degree_id,division_id,username);

    employeeService.updateEmployee(employee);
    showListEmployee(request,response);
//    RequestDispatcher dispatcher = request.getRequestDispatcher("user/edit.jsp");
//    dispatcher.forward(request, response);

  }

  private void searchEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("nameSearch");
    List<employee> employeeList=employeeService.findByName(name);
    request.setAttribute("employeeList", employeeList);
    request.getRequestDispatcher("/employee/list.jsp").forward(request, response);

  }

  private void createEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    int employee_id = Integer.parseInt(request.getParameter("employee_id"));
    String employee_name = request.getParameter("employee_name");
    String employee_birthday = request.getParameter("employee_birthday");
    String employee_id_card = request.getParameter("employee_id_card");
    double employee_salary = Double.parseDouble(request.getParameter("employee_salary"));
    String employee_phone = request.getParameter("employee_phone");
    String employee_email = request.getParameter("employee_email");
    String employee_address = request.getParameter("employee_address");
    int  position_id = Integer.parseInt(request.getParameter("position_id"));
    int  education_degree_id = Integer.parseInt(request.getParameter("education_degree_id"));
    int  division_id = Integer.parseInt(request.getParameter("division_id"));
    String username = request.getParameter("username");
    employee employee=new employee(employee_id,employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,
            employee_email,employee_address,position_id,education_degree_id,division_id,username);
    employeeService.insertEmployee(employee);
   showListEmployee(request,response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if (action == null) {
      action = "";
    }
    switch (action){
      case "create":
        showCreateForm(request, response);
        break;
      case "search":
        searchEmployee(request,response);
        break;
      case "edit":
        showFormEdit(request,response);
        break;
      default:
        try {
          showListEmployee(request,response);
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
    }
  }

  private void showListEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    List<employee> employeeList = employeeService.selectAllEmployee();
    request.setAttribute("employeeList", employeeList);
    request.getRequestDispatcher("/employee/list.jsp").forward(request, response);
  }
  private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    int employee_id=Integer.parseInt(request.getParameter("employee_id"));
    employee employee=employeeService.selectEmployeeById(employee_id);
    request.setAttribute("employee",employee);
    request.getRequestDispatcher("/employee/edit.jsp").forward(request,response);
  }

  private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("listPosition", positionService.findALl());
    request.setAttribute("listEducationDegree", educationDegreeService.findALl());
    request.setAttribute("listDivision", divisionService.findALl());
    request.setAttribute("ListUser", userService.findALl());
    request.getRequestDispatcher("/employee/create.jsp").forward(request, response);
  }
}
