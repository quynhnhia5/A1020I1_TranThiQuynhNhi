package model;

public class BenhNhanBaoHiemYTe extends BenhNhan {
    private String maBaoHiemYTe;

    public BenhNhanBaoHiemYTe() {
    }

    public BenhNhanBaoHiemYTe(String maBaoHiemYTe) {
        this.maBaoHiemYTe = maBaoHiemYTe;
    }

    public String getMaBaoHiemYTe() {
        return maBaoHiemYTe;
    }

    public void setMaBaoHiemYTe(String maBaoHiemYTe) {
        this.maBaoHiemYTe = maBaoHiemYTe;
    }

    @Override
    public long tinhHoaDonVienPhi() {
        if (isPhongTheoYeuCau()) return (soNgayNhapVien()*getDONGIA()*200000)-(soNgayNhapVien()*getDONGIA()*70/100);
        else return (soNgayNhapVien()*getDONGIA()-(soNgayNhapVien()*getDONGIA()*70/100));
    }
}
