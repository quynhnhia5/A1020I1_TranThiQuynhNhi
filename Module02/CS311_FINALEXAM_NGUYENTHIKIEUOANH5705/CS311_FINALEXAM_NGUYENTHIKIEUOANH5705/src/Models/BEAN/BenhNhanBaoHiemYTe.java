package Models.BEAN;

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
        if (isPhongTheoYeuCau()) return (getDayCount()*getDONGIA()*200000)-(getDayCount()*getDONGIA()*70/100);
        else return (getDayCount()*getDONGIA()-(getDayCount()*getDONGIA()*70/100));
    }
    @Override
    public void showInfo() {
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",
                getId(),
                getHoTen(),
                getNgayNhapVien(),
                getNgayRaVien(),
                isPhongTheoYeuCau(),
                tinhHoaDonVienPhi()
              );
    }


}
