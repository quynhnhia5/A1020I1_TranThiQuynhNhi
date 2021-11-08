package Model.service.Impl;
import Model.BEAN.customer.customer;
import Model.repository.CustomerRepository;
import Model.repository.Impl.CustomerRepositoryImpl;
import Model.service.CustomerService;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository=new CustomerRepositoryImpl();
    public List<customer> selectAll() throws SQLException {
        return customerRepository.selectAll();
    }
    public void insertCustomer(int customer_type_id, String customer_name, String customer_birthday,
                               boolean customer_gender, String customer_is_card, String customer_phone
            , String customer_email, String customer_address) throws SQLException {
        customerRepository.insertCustomer(customer_type_id, customer_name, customer_birthday,
                customer_gender,  customer_is_card,  customer_phone
                , customer_email, customer_address);
    }
    public void deleteCustomer(int id) throws SQLException {
        customerRepository.deleteCustomer(id);
    }

    public void updateCustomer(int customer_id, int customerType,String customer_name,String customer_birthday,
                               boolean customer_gender,String customer_is_card, String customer_phone
            , String customer_email, String customer_address) throws SQLException {
        customerRepository.updateCustomer( customer_id, customerType,customer_name, customer_birthday,
                customer_gender, customer_is_card, customer_phone
                , customer_email,  customer_address);
    }
    public customer selectCustomerById(int id) throws SQLException {
        return customerRepository.selectCustomerById(id);
    }

}