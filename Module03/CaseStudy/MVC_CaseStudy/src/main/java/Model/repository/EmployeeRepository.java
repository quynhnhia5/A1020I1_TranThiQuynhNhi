package Model.repository;


import Model.BEAN.employee.employee;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface EmployeeRepository {
  List<employee> selectAllEmployee() throws SQLException;
  void insertEmployee(employee employee) throws SQLException;
//  employee findByName(String name);
  List<employee> findByName(String name);
  void deleteEmployee(int id) throws SQLException;
  employee selectEmployeeById(int id) throws SQLException;
  void updateEmployee(int employee_id, String employee_name, String employee_birthday,
                      String employee_id_card, double employee_salary, String employee_phone,
                      String employee_email, String employee_address, int position_id,
                      int education_degree_id, int division_id)throws SQLException;
}
