package Model.repository.Impl;

import Model.BEAN.employee.*;
import Model.repository.EmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeRepositoryImpl  implements EmployeeRepository {

  private static final String SELECT_ALL_EMPLOYEE= "SELECT * FROM employee INNER JOIN position ON employee.position_id=position.position_id\n" +
          "                       INNER JOIN education_degree on employee.education_degree_id=education_degree.education_degree_id\n" +
          "                       INNER JOIN division on employee.division_id=division.division_id\n" +
          "                       INNER JOIN user on employee.username=user.username;";
  private static final String INSERT_EMPLOYEE = "INSERT INTO `furama_resort_mvc`.`employee` (`employee_id`, `employee_name`, `employee_birthday`, `employee_id_card`, `employee_salary`, `employee_phone`, `employee_email`, `employee_address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
  private static final String SELECT_BY_NAME = "SELECT * FROM furama_resort_mvc.employee WHERE employee_name=?;";
  public List<employee> selectAllEmployee() throws SQLException {
    Connection conn = DBConnection.CreateConnection();
    List<employee> list = new ArrayList<>();
    if (conn != null) {
      try {
        PreparedStatement ptmt = conn.prepareStatement(SELECT_ALL_EMPLOYEE);
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()) {
          int employee_id=rs.getInt("employee_id");
          String employee_name=rs.getString("employee_name");
          String employee_birthday=rs.getString("employee_birthday");
          String employee_id_card=rs.getString("employee_id_card");
          double employee_salary=rs.getDouble("employee_salary");
          String employee_phone=rs.getString("employee_phone");
          String employee_email=rs.getString("employee_email");
          String employee_address=rs.getString("employee_address");
          int position_id =rs.getInt("position_id");
          int education_degree_id =rs.getInt("education_degree_id");
          int division_id=rs.getInt("division_id");
          String username=rs.getString("username");
          list.add(new employee(employee_id,employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,
                  employee_address,position_id,education_degree_id,division_id,username));

        }
      } catch (SQLException e) {
        e.printStackTrace();
      } finally {
        try {
          conn.close();
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
      }
    }
    return list;

  }


  public void insertEmployee(employee employee) {
    Connection conn = DBConnection.CreateConnection();
    if (conn != null) {
      try {
        PreparedStatement ptmt = conn.prepareStatement(INSERT_EMPLOYEE);
        ptmt.setInt(1, employee.getEmployee_id());
        ptmt.setString(2, employee.getEmployee_name());
        ptmt.setString(3, employee.getEmployee_birthday());
        ptmt.setString(4, employee.getEmployee_id_card());
        ptmt.setDouble(5, employee.getEmployee_salary());
        ptmt.setString(6, employee.getEmployee_phone());
        ptmt.setString(7, employee.getEmployee_email());
        ptmt.setString(8, employee.getEmployee_address());
        ptmt.setInt(9, employee.getPosition_id());
        ptmt.setInt(10, employee.getEducation_degree_id());
        ptmt.setInt(11, employee.getDivision_id());
        ptmt.setString(12, employee.getUsername());
        ptmt.executeUpdate();
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      } finally {
        try {
          conn.close();
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
      }
    }


  }

  public List<employee> findByName(String name) {
    Connection conn = DBConnection.CreateConnection();
    List<employee> list = new ArrayList<>();
    if (conn != null) {
      try {
        PreparedStatement ptmt = conn.prepareStatement(SELECT_BY_NAME);
        ptmt.setString(1, name);
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()) {
          int employee_id=rs.getInt("employee_id");
          String employee_name=rs.getString("employee_name");
          String employee_birthday=rs.getString("employee_birthday");
          String employee_id_card=rs.getString("employee_id_card");
          double employee_salary=rs.getDouble("employee_salary");
          String employee_phone=rs.getString("employee_phone");
          String employee_email=rs.getString("employee_email");
          String employee_address=rs.getString("employee_address");
          int position_id =rs.getInt("position_id");
          int education_degree_id =rs.getInt("education_degree_id");
          int division_id=rs.getInt("division_id");
          String username=rs.getString("username");
          list.add(new employee(employee_id,employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id,username));
        }
      } catch (SQLException e) {
        e.printStackTrace();
      } finally {
        try {
          conn.close();
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
      }
    }
    return list ;
  }



  public void deleteEmployee(int id) throws SQLException {
    Connection conn=DBConnection.CreateConnection();
    String sql="delete from employee where employee_id = ?;";
    PreparedStatement ptmt=conn.prepareStatement(sql);
    ptmt.setInt(1, id);
    ptmt.executeUpdate();
    conn.close();
    ptmt.close();
  }



  public employee selectEmployeeById(int id) throws SQLException {
    employee employee=null;
    Connection conn=DBConnection.CreateConnection();
    String sql="select * from employee where employee_id =?";
    PreparedStatement ptmt=conn.prepareStatement(sql);
    ptmt.setInt(1,id);
    ResultSet rs=ptmt.executeQuery();
    while (rs.next()){
      int employee_id=rs.getInt("employee_id");
      String employee_name=rs.getString("employee_name");
      String employee_birthday=rs.getString("employee_birthday");
      String employee_id_card=rs.getString("employee_id_card");
      double employee_salary=rs.getDouble("employee_salary");
      String employee_phone=rs.getString("employee_phone");
      String employee_email=rs.getString("employee_email");
      String employee_address=rs.getString("employee_address");
      int position_id =rs.getInt("position_id");
      int education_degree_id =rs.getInt("education_degree_id");
      int division_id=rs.getInt("division_id");
      String username=rs.getString("username");
      employee=new employee(employee_id,employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id,username);

    }
    conn.close();
    ptmt.close();
    rs.close();
    return employee;
  }



  public void updateEmployee(int employee_id, String employee_name, String employee_birthday,
                             String employee_id_card, double employee_salary, String employee_phone,
                             String employee_email, String employee_address, int position_id,
                             int education_degree_id, int division_id) throws SQLException {
    Connection conn=DBConnection.CreateConnection();
    String sql="UPDATE employee " +
            "SET employee_name = ?," +
            "employee_birthday = ?," +
            "employee_id_card = ?," +
            "employee_salary = ?," +
            "employee_phone = ?," +
            "employee_email = ?," +
            "employee_address = ?" +
            "position_id = ?" +
            "education_degree_id = ?" +
            "division_id = ?" +
            "WHERE employee_id = ?;";
    PreparedStatement ptmt = conn.prepareStatement(sql);
   ptmt.setString(1,employee_name);
   ptmt.setString(2, employee_birthday);
   ptmt.setString(3,employee_id_card);
   ptmt.setDouble(4,employee_salary);
   ptmt.setString(5,employee_phone);
   ptmt.setString(6,employee_email);
   ptmt.setString(7,employee_address);
   ptmt.setInt(8,position_id);
   ptmt.setInt(9,education_degree_id);
   ptmt.setInt(10,division_id);
   ptmt.setInt(11,employee_id);

    ptmt.executeUpdate();
    conn.close();
    ptmt.close();

  }





}
