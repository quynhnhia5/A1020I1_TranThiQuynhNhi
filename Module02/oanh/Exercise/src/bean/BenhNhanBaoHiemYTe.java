package bean;

public class BenhNhanBaoHiemYTe extends BenhNhan{
private String MaBaoHiemYte;

  public BenhNhanBaoHiemYTe() {
  }

  public BenhNhanBaoHiemYTe(String maBaoHiemYte) {
    MaBaoHiemYte = maBaoHiemYte;
  }

  public String getMaBaoHiemYte() {
    return MaBaoHiemYte;
  }

  public void setMaBaoHiemYte(String maBaoHiemYte) {
    MaBaoHiemYte = maBaoHiemYte;
  }

  @Override
  public long tinhHoaDonVienPhi() {
    if (isPhongTheoYeuCau())
      return (soNgayNhapVien()*getDONGIA()*200000)-(soNgayNhapVien()*getDONGIA()*70/100);
    else return (soNgayNhapVien()*getDONGIA()-(soNgayNhapVien()*getDONGIA()*70/100));
  }
}
