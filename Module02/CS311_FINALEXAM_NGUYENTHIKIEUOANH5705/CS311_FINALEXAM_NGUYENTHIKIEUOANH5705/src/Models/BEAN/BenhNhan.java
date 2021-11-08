package Models.BEAN;


import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BenhNhan {
    private String id;
    private String hoTen;
    private static String ngayNhapVien;
    private static String ngayRaVien;
    private static boolean phongTheoYeuCau;
    private final int  DONGIA = 150000;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public static String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public static void setNgayNhapVien(String ngayNhapVien) {
        BenhNhan.ngayNhapVien = ngayNhapVien;
    }

    public static String getNgayRaVien() {
        return ngayRaVien;
    }

    public static void setNgayRaVien(String ngayRaVien) {
        BenhNhan.ngayRaVien = ngayRaVien;
    }

    public static boolean isPhongTheoYeuCau() {
        return phongTheoYeuCau;
    }

    public static void setPhongTheoYeuCau(boolean phongTheoYeuCau) {
        BenhNhan.phongTheoYeuCau = phongTheoYeuCau;
    }

    public int getDONGIA() {
        return DONGIA;
    }

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public static <ngayNhapVien, ngayRaVien> long getDayCount() {
        long diff = -1;
        try {
            Date dateStart = simpleDateFormat.parse(ngayNhapVien);
            Date dateEnd = simpleDateFormat.parse(ngayRaVien);

            //time is always 00:00:00, so rounding should help to ignore the missing hour when going from winter to summer time, as well as the extra hour in the other direction
            diff = Math.round((dateEnd.getTime() - dateStart.getTime()) / (double) 86400000);
        } catch (Exception e) {
            //handle the exception according to your own situation
        }
        return diff;
    }

    public abstract long tinhHoaDonVienPhi();
    public abstract void showInfo();

}
