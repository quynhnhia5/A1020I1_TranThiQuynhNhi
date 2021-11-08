package Model.repository.Impl;

import Model.BEAN.employee.division;
import Model.repository.DivisionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivisionRepositoryImpl  implements DivisionRepository {
  private static final String SELECT_ALL_DIVISION_ = "SELECT * FROM furama_resort_mvc.division;";
  @Override
  public List<division> findALl() {
    Connection conn = DBConnection.CreateConnection();
    List<division> list = new ArrayList<>();
    if (conn != null) {
      try {
        PreparedStatement ptmt = conn.prepareStatement(SELECT_ALL_DIVISION_);
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()) {
          int division_id = rs.getInt("education_degree_id");
          String division_name = rs.getString("education_degree_name");
          list.add(new division(division_id, division_name));
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
