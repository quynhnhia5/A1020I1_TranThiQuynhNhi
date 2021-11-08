package manage;


import model.BenhNhan;
import model.BenhNhanBaoHiemXaHoi;
import model.BenhNhanBaoHiemYTe;

import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Scanner;

public class DS_BenhNhan {
    public LinkedList<BenhNhan> danhSach = new LinkedList<>();

    public void nhapThongTin(BenhNhan bn){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ID: ");
        bn.setId(sc.nextLine());

        System.out.print("Nhap Ho ten: ");
        bn.setHoTen(sc.nextLine());

        bn.setNgayNhapVien();

        System.out.print("Phong theo yeu cau (1: co, 0: khong): ");
        int i = sc.nextInt();
        bn.setPhongTheoYeuCan(i == 1);
    }

    public void themBenhNhan(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Benh Nhan co bao hiem y te");
        System.out.println("2. Benh Nhan co bao hiem xa hoi");
        System.out.println("Chon loai ben nhan muon them: ");
        int choice = sc.nextInt();

        if (choice == 1){
            BenhNhanBaoHiemYTe moi = new BenhNhanBaoHiemYTe();
            nhapThongTin(moi);
            danhSach.add(moi);
        }else {
            BenhNhanBaoHiemXaHoi moi = new BenhNhanBaoHiemXaHoi();
            nhapThongTin(moi);
            danhSach.add(moi);
        }

        System.out.println("Them thanh cong");
    }

    public boolean delete(String id){
        for (BenhNhan bn : danhSach) {
            if (bn.getId().equals(id)){
                danhSach.remove(bn);
            return true;}
        }
        return false;
    }

    public void xoaBenhNhan(String id){
        if (delete(id)){
            System.out.println("Xoa thanh cong");
        }else System.out.println("Benh nhan khong ton tai");
    }

    public void capNhatBenhNhan(String id){
        Scanner sc = new Scanner(System.in);
        for (BenhNhan bn : danhSach) {
            if (bn.getId().equals(id)){
                System.out.println("Cap nhat thong tin Benh Nhan " + id);

                System.out.print("Nhap Ho ten: ");
                bn.setHoTen(sc.nextLine());

                System.out.print("Phong theo yeu cau (1: co, 0: khong): ");
                int i = sc.nextInt();
                bn.setPhongTheoYeuCan(i == 1);

                System.out.println("Cap nhat thanh cong");
                return;
            }
        }

        System.out.println("Ma so benh nhan khong ton tai");
    }

    public void inThongTin(BenhNhan bn){
        System.out.println("ID: " + bn.getId());
        System.out.println("HoTen: " + bn.getHoTen());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Ngay Nhap Vien: " + dtf.format(bn.getNgayNhapVien()));

        System.out.println("Phong theo yeu cau: " + ((bn.isPhongTheoYeuCau())?"Co":"Khong"));
    }

    public void timKiemBenhNhan(String id){
        for (BenhNhan bn : danhSach) {
            if (bn.getId().equals(id)){
               inThongTin(bn);
            }
        }
    }

    public void tinhTien(){
        long tongTienBNYT = 0;
        long tongTienBNXH = 0;
        for (BenhNhan bn : danhSach) {
            if (bn instanceof BenhNhanBaoHiemYTe){
                tongTienBNYT += bn.tinhHoaDonVienPhi();
            }
            if (bn instanceof BenhNhanBaoHiemXaHoi){
                tongTienBNXH += bn.tinhHoaDonVienPhi();
            }
        }

        System.out.println("Tong tien benh nhan dung bao hiem y te: " + tongTienBNYT);
        System.out.println("Tong tien benh nhan dung bao hiem xa hoi : " + tongTienBNXH);
    }
}
