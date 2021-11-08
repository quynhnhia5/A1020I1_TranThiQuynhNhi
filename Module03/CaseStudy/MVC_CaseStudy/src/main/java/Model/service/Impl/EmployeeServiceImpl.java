package Model.service.Impl;


import Model.BEAN.employee.employee;
import Model.repository.EmployeeRepository;
import Model.repository.Impl.EmployeeRepositoryImpl;
import Model.service.EmployeeService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl  implements EmployeeService {
  EmployeeRepository employeeRepository=new EmployeeRepositoryImpl();
  public List<employee> selectAllEmployee() throws SQLException {
    return employeeRepository.selectAllEmployee();
  }
  public void insertEmployee(employee employee) throws SQLException {
    employeeRepository.insertEmployee(employee);
  }


  //  public employee findByName(String name) {
//    return employeeRepository.findByName(name);
//  }
public List<employee> findByName(String name) {
  return employeeRepository.findByName(name);
  }
  public void deleteEmployee(int id) throws SQLException {
    employeeRepository.deleteEmployee(id);
  }
   public  void updateEmployee(int employee_id, String employee_name, String employee_birthday,
                      String employee_id_card, double employee_salary, String employee_phone,
                      String employee_email, String employee_address, int position_id,
                      int education_degree_id, int division_id) throws SQLException {
     employeeRepository.updateEmployee(employee_id,employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id);
   }

  public employee selectEmployeeById(int id) throws SQLException {
    return employeeRepository.selectEmployeeById(id);
  }
}
