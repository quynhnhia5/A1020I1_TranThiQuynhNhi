package Model.repository.Impl;

import Model.BEAN.BenhNhan.benhan;
import Model.repository.BenhAnRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhAnRepositoryImpl implements BenhAnRepository {
    private static final String SELECT_ALL_BENHAN = "SELECT * FROM thi.benhan;";
    @Override
    public List<benhan> findALl() {
        Connection conn = DBConnection.CreateConnection();
        List<benhan> list = new ArrayList<>();
        if (conn != null) {
            try {
                PreparedStatement ptmt = conn.prepareStatement(SELECT_ALL_BENHAN);
                ResultSet rs = ptmt.executeQuery();
                while (rs.next()) {
                    String MaBenhAn=rs.getString("MaBenhAn");
                    String TenBenhAn=rs.getString("TenBenhAn");

                    list.add(new benhan(MaBenhAn, TenBenhAn));
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
