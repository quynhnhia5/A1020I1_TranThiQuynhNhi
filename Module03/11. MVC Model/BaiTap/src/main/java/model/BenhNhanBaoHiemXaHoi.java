package model;

public class BenhNhanBaoHiemXaHoi extends BenhNhan {
    private String maBaoHiemXaHoi;

    public BenhNhanBaoHiemXaHoi() {
    }

    public BenhNhanBaoHiemXaHoi(String maBaoHiemXaHoi) {
        this.maBaoHiemXaHoi = maBaoHiemXaHoi;
    }

    public String getMaBaoHiemXaHoi() {
        return maBaoHiemXaHoi;
    }

    public void setMaBaoHiemXaHoi(String maBaoHiemXaHoi) {
        this.maBaoHiemXaHoi = maBaoHiemXaHoi;
    }

    @Override
    public long tinhHoaDonVienPhi() {
        if (isPhongTheoYeuCau())
            return soNgayNhapVien()*getDONGIA()*200000;
        else return  soNgayNhapVien()*getDONGIA();
    }
}
