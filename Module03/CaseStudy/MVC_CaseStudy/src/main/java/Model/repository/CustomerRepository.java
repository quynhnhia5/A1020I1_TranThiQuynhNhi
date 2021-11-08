package Model.repository;

import Model.BEAN.customer.customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerRepository {
  List<customer> selectAll() throws SQLException;
  void insertCustomer(int customer_type_id, String customer_name, String customer_birthday,
                      boolean customer_gender, String customer_is_card, String customer_phone
          , String customer_email, String customer_address) throws SQLException;
  void deleteCustomer(int id) throws SQLException;
  customer selectCustomerById(int id) throws SQLException;
  void updateCustomer(int customer_id, int customerType, String customer_name, String customer_birthday,
                      boolean customer_gender, String customer_is_card, String customer_phone
          , String customer_email, String customer_address) throws SQLException;

}
