package Model.service.Impl;

import Model.BEAN.BenhNhan.BenhNhan;
import Model.repository.BenhNhanRepository;
import Model.repository.Impl.BenhNhanRepositoryImpl;
import Model.service.BenhNhanService;

import java.sql.SQLException;
import java.util.List;

public class BenhNhanServiceImpl implements BenhNhanService {

    BenhNhanRepository benhNhanRepository=new BenhNhanRepositoryImpl();
    public List<BenhNhan> selectAllBenhNhan() throws SQLException {
        return benhNhanRepository.selectAllBenhNhan();
    }
    public BenhNhan selectBenhNhanById(String  Mabn) throws SQLException {
        return benhNhanRepository.selectBenhNhanById(Mabn);
    }

    public  void updateBenhNhan(String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String maBenhAn) throws SQLException {
        benhNhanRepository.updateBenhNhan(maBenhNhan,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDoNhapVien,maBenhAn);
    }

    public void deleteBenhNhan(String Mabn) throws SQLException {
        benhNhanRepository.deleteBenhNhan(Mabn);
    }
}
