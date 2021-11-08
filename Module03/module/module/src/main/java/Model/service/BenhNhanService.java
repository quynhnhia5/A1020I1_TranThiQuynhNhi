package Model.service;

import Model.BEAN.BenhNhan.BenhNhan;

import java.sql.SQLException;
import java.util.List;

public interface BenhNhanService {
    List<BenhNhan> selectAllBenhNhan() throws SQLException;
    BenhNhan selectBenhNhanById(String  Mabn) throws SQLException;
    void updateBenhNhan(String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String maBenhAn) throws SQLException;
    void  deleteBenhNhan(String Mabn) throws SQLException;
}
