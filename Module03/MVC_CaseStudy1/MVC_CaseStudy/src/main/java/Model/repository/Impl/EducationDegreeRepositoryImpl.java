package Model.repository.Impl;

import Model.BEAN.employee.education_degree;
import Model.repository.EducationDegreeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationDegreeRepositoryImpl  implements EducationDegreeRepository {
    private static final String SELECT_ALL_EDUCATION = "SELECT * FROM furama_resort_mvc.education_degree;";
    @Override
    public List<education_degree> findALl() {
        Connection conn = DBConnection.CreateConnection();
        List<education_degree> list = new ArrayList<>();
        if (conn != null) {
            try {
                PreparedStatement ptmt = conn.prepareStatement(SELECT_ALL_EDUCATION);
                ResultSet rs = ptmt.executeQuery();
                while (rs.next()) {
                    int education_degree_id = rs.getInt("education_degree_id");
                    String education_degree_name = rs.getString("education_degree_name");
                    list.add(new education_degree (education_degree_id, education_degree_name));
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