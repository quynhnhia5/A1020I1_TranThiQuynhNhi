package model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public abstract class BenhNhan {
    private String id;
    private String hoTen;
    private LocalDateTime ngayNhapVien;
    private LocalDateTime ngayRaVien;
    private boolean phongTheoYeuCau;
    private final int  DONGIA = 150000;

    public int getDONGIA() {
        return DONGIA;
    }

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

    public LocalDateTime getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien() {
        ngayNhapVien = LocalDateTime.now();
    }

    public LocalDateTime getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien() {
        ngayRaVien = LocalDateTime.now();
    }

    public boolean isPhongTheoYeuCau() {
        return phongTheoYeuCau;
    }

    public void setPhongTheoYeuCan(boolean phongTheoYeuCau) {
        this.phongTheoYeuCau = phongTheoYeuCau;
    }

    public long soNgayNhapVien(){
        return ChronoUnit.DAYS.between(ngayNhapVien, ngayRaVien);
    }

    public abstract long tinhHoaDonVienPhi();
}
