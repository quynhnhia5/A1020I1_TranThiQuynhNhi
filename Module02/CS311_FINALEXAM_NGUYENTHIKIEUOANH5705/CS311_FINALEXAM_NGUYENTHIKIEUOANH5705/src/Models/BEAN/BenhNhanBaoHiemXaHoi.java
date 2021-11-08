package Models.BEAN;

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
    public  long tinhHoaDonVienPhi() {
        if (isPhongTheoYeuCau())
            return getDayCount()*getDONGIA()*200000;
        else return  getDayCount()*getDONGIA();
    }
    @Override
    public void showInfo() {
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",
                getId(),
                getHoTen(),
                getNgayNhapVien(),
                getNgayRaVien(),
                isPhongTheoYeuCau(),
                tinhHoaDonVienPhi());
    }


}
