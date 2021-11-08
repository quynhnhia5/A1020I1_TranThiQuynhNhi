package Model.repository.Impl;

import Model.BEAN.employee.user;
import Model.repository.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private static final String SELECT_ALL_USER = "SELECT * FROM furama_resort_mvc.user;";
    @Override
    public List<user> findALl() {
        Connection conn = DBConnection.CreateConnection();
        List<user> list = new ArrayList<>();
        if (conn != null) {
            try {
                PreparedStatement ptmt = conn.prepareStatement(SELECT_ALL_USER);
                ResultSet rs = ptmt.executeQuery();
                while (rs.next()) {
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    list.add(new user(username, password));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return list;
    }
}