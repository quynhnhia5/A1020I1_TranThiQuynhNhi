package Model.repository.Impl;

import Model.BEAN.employee.position;
import Model.repository.PositionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements PositionRepository {
    private static final String SELECT_ALL_POSITION = "SELECT * FROM furama_resort_mvc.position;";
    @Override
    public List<position> findALl() {
        Connection conn = DBConnection.CreateConnection();
        List<position> list = new ArrayList<>();
        if (conn != null) {
            try {
                PreparedStatement ptmt = conn.prepareStatement(SELECT_ALL_POSITION);
                ResultSet rs = ptmt.executeQuery();
                while (rs.next()) {
                    int position_id = rs.getInt("position_id");
                    String position_name = rs.getString("position_name");
                    list.add(new position(position_id, position_name));
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