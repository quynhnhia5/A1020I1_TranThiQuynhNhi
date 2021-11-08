package Model.BEAN.BenhNhan;

public class benhan {
    private String MaBenhAn;
    private String TenBenhAn;

    public benhan() {
    }

    public benhan(String maBenhAn, String tenBenhAn) {
        MaBenhAn = maBenhAn;
        TenBenhAn = tenBenhAn;
    }

    public String getMaBenhAn() {
        return MaBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        MaBenhAn = maBenhAn;
    }

    public String getTenBenhAn() {
        return TenBenhAn;
    }

    public void setTenBenhAn(String tenBenhAn) {
        TenBenhAn = tenBenhAn;
    }
}
