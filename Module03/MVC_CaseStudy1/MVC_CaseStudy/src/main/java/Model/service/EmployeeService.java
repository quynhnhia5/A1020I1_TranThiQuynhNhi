package Model.service;

import Model.BEAN.employee.employee;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface EmployeeService {

    List<employee> selectAllEmployee() throws SQLException;
    void insertEmployee(employee employee) throws SQLException;

    List<employee> findByName(String name);
    void deleteEmployee(int id) throws SQLException;
//    void updateEmployee(int employee_id, String employee_name, String employee_birthday,
//                        String employee_id_card, double employee_salary, String employee_phone,
//                        String employee_email, String employee_address, int position_id,
//                        int education_degree_id, int division_id,String username) throws SQLException;
    employee selectEmployeeById(int id) throws SQLException;

    void updateEmployee(employee employee);
}
