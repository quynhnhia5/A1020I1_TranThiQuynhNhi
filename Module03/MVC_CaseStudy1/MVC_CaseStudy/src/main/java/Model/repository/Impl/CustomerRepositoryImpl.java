package Model.repository.Impl;

import Model.BEAN.customer.customer;
import Model.BEAN.customer.customerType;
import Model.repository.CustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl  implements CustomerRepository {
    public List<customer> selectAll() throws SQLException {
        Connection conn=DBConnection.CreateConnection();
        List<customer> list=new ArrayList<>();
        String sql="SELECT * FROM furama_resort_mvc.customer;";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ResultSet rs=ptmt.executeQuery();
        while (rs.next()){
            list.add(new customer(
                    rs.getInt(1),
                    getCustomerTypeById(rs.getInt(2)),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getBoolean(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9)
            ));
        }
        conn.close();
        ptmt.close();
        rs.close();

        return list;
    }


    public void insertCustomer(int customer_type_id, String customer_name, String customer_birthday,
                               boolean customer_gender, String customer_is_card, String customer_phone
            , String customer_email, String customer_address) throws SQLException {
        PreparedStatement ptmt=null;
        Connection conn=DBConnection.CreateConnection();
        String sql="INSERT INTO `furama_resort_mvc`.`customer` ( `customer_type_id`, `customer_name`, `customer_birthday`, `customer_gender`, `customer_is_card`, `customer_phone`, `customer_email`, `customer_address`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?);";
        ptmt=conn.prepareStatement(sql);

        ptmt.setInt(1, customer_type_id);
        ptmt.setString(2,customer_name);
        ptmt.setString(3, customer_birthday);
        ptmt.setBoolean(4,customer_gender);
        ptmt.setString(5,customer_is_card);
        ptmt.setString(6,customer_phone);
        ptmt.setString(7,customer_email);
        ptmt.setString(8,customer_address);
        ptmt.executeUpdate();
        conn.close();
        ptmt.close();


    }


    public void deleteCustomer(int id) throws SQLException {
        Connection conn=DBConnection.CreateConnection();
        String sql="delete from customer where id = ?;";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ptmt.setInt(1, id);
        ptmt.executeUpdate();
        conn.close();
        ptmt.close();
    }


    public customer selectCustomerById(int id) throws SQLException {
        customer customer=null;
        Connection conn=DBConnection.CreateConnection();
        String sql="select id,name,email,country from customer where id =?";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ptmt.setInt(1,id);
        ResultSet rs=ptmt.executeQuery();
        while (rs.next()){

            int customer_id=customer.getCustomer_id();
            customerType customer_type_id=customer.getCustomerType();
            String customer_name=customer.getCustomer_name();
            String customer_birthday=customer.getCustomer_birthday();
            boolean customer_gender=customer.isCustomer_gender();
            String customer_is_card=customer.getCustomer_is_card();
            String customer_phone=customer.getCustomer_phone();
            String customer_email=customer.getCustomer_email();
            String customer_address=customer.getCustomer_address();
            customer=new customer(customer_id,customer_type_id,customer_name,customer_birthday,customer_gender,customer_is_card,customer_phone,customer_email,customer_address);
        }
        conn.close();
        ptmt.close();
        rs.close();


        return customer;
    }

    public void updateCustomer(int customer_id, int customerType, String customer_name, String customer_birthday,
                               boolean customer_gender, String customer_is_card, String customer_phone
            , String customer_email, String customer_address) throws SQLException {
        Connection conn=DBConnection.CreateConnection();
        String sql="UPDATE customer " +
                "SET customer_type_id = ?," +
                "customer_name = ?," +
                "customer_birthday = ?," +
                "customer_gender = ?," +
                "customer_id_card = ?," +
                "customer_phone = ?," +
                "customer_email = ?," +
                "customer_address = ?" +
                "WHERE customer_id = ?;";
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, customerType);
        ptmt.setString(2, customer_name);
        ptmt.setString(3, customer_birthday);
        ptmt.setBoolean(4, customer_gender);
        ptmt.setString(5, customer_is_card);
        ptmt.setString(6, customer_phone);
        ptmt.setString(7, customer_email);
        ptmt.setString(8, customer_address);
        ptmt.setInt(9, customer_id);

        ptmt.executeUpdate();
        conn.close();
        ptmt.close();

    }




    public customerType getCustomerTypeById(int customer_type_id) throws SQLException {
        Connection conn=DBConnection.CreateConnection();
        String sql="SELECT * FROM customer_type WHERE customer_type_id=?;";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ptmt.setInt(1,customer_type_id);
        ResultSet rs=ptmt.executeQuery();
        if (rs.next()) {
            return new customerType(
                    rs.getInt(1),
                    rs.getString(2)
            );
        }
        conn.close();
        ptmt.close();
        rs.close();


        return null;
    }


}