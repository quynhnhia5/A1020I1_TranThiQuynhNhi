package Model.repository.Impl;

import Model.BEAN.BenhNhan.BenhNhan;
import Model.repository.BenhNhanRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanRepositoryImpl implements BenhNhanRepository {


    private static final String SELECT_ALL_BENHNHAN= "SELECT * FROM benhnhan INNER JOIN benhan ON benhan.MaBenhAn=benhnhan.MaBenhAn;";



    public List<BenhNhan> selectAllBenhNhan() throws SQLException {
        Connection conn = DBConnection.CreateConnection();
        List<BenhNhan> list = new ArrayList<>();
        if (conn != null) {
            try {
                PreparedStatement ptmt = conn.prepareStatement(SELECT_ALL_BENHNHAN);
                ResultSet rs = ptmt.executeQuery();
                while (rs.next()) {
                    String MaBenhNhan=rs.getString("MaBenhNhan");
                    String TenBenhNhan=rs.getString("TenBenhNhan");
                    String NgayNhapVien=rs.getString("NgayNhapVien");
                    String NgayRaVien=rs.getString("NgayRaVien");
                    String LyDoNhapVien=rs.getString("LyDoNhapVien");
                    String MaBenhAn=rs.getString("MaBenhAn");

                    list.add(new BenhNhan(MaBenhNhan,TenBenhNhan,NgayNhapVien,NgayRaVien,LyDoNhapVien,MaBenhAn));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return list;

    }


    public BenhNhan selectBenhNhanById(String  Mabn) throws SQLException {
        BenhNhan benhnhan=null;
        Connection conn=DBConnection.CreateConnection();
        String sql="select * from benhnhan where MaBenhNhan =?;";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ptmt.setString(1,Mabn);
        ResultSet rs=ptmt.executeQuery();
        while (rs.next()){
            String MaBenhNhan=rs.getString("MaBenhNhan");
            String TenBenhNhan=rs.getString("TenBenhNhan");
            String NgayNhapVien=rs.getString("NgayNhapVien");
            String NgayRaVien=rs.getString("NgayRaVien");
            String LyDoNhapVien=rs.getString("LyDoNhapVien");
            String MaBenhAn=rs.getString("MaBenhAn");
            benhnhan =new BenhNhan(MaBenhNhan,TenBenhNhan,NgayNhapVien,NgayRaVien,LyDoNhapVien,MaBenhAn);


        }
        conn.close();
        ptmt.close();
        rs.close();
        return benhnhan;
    }


    public void updateBenhNhan(String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String maBenhAn) throws SQLException {
        Connection conn=DBConnection.CreateConnection();
        String sql="UPDATE benhnhan " +
                "SET maBenhNhan = ?," +
                "tenBenhNhan = ?," +
                "ngayNhapVien = ?," +
                "ngayRaVien = ?," +
                "lyDoNhapVien = ?," +
                "maBenhAn = ?;" ;

        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setString(1,maBenhNhan);
        ptmt.setString(2, tenBenhNhan);
        ptmt.setString(3,ngayNhapVien);
        ptmt.setString(4,ngayRaVien);
        ptmt.setString(5,lyDoNhapVien);
        ptmt.setString(6,maBenhAn);

        ptmt.executeUpdate();
        conn.close();
        ptmt.close();

    }

    public void deleteBenhNhan(String Mabn) throws SQLException {
        Connection conn=DBConnection.CreateConnection();
        String sql="delete from benhnhan where maBenhNhan = ?;";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ptmt.setString(1, Mabn);
        ptmt.executeUpdate();
        conn.close();
        ptmt.close();
    }
}
