package manager;


import Models.BEAN.BenhNhan;
import Models.BEAN.BenhNhanBaoHiemXaHoi;
import Models.BEAN.BenhNhanBaoHiemYTe;
import Models.Commons.FileUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DS_BenhNhan {
    public static final String FILE_EMPLOY="D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\DSBENHNHAN.txt";
    public static final String COMMA= ",";
    public  static  LinkedList<BenhNhan> danhSach = new LinkedList<>();
    public  static Scanner sc = new Scanner(System.in);

    public  static void nhapThongTin(BenhNhan bn){
        System.out.print("Nhap ID: ");
        bn.setId(sc.nextLine());

        System.out.print("Nhap Ho ten: ");
        bn.setHoTen(sc.nextLine());
        System.out.print("Nhap Ngày nhap vien: ");
        bn.setNgayNhapVien(sc.nextLine());
        System.out.print("Nhap Ngày ra vien: ");
       bn.setNgayRaVien(sc.nextLine());

        System.out.print("Phong theo yeu cau (1: co, 0: khong): ");
        int i = sc.nextInt();
        bn.setPhongTheoYeuCau(i==1);
    }

    public static  void themBenhNhan(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Benh Nhan co bao hiem y te");
        System.out.println("2. Benh Nhan co bao hiem xa hoi");
        System.out.print("Chon loai ben nhan muon them: ");
        int choice = sc.nextInt();

        if (choice == 1){
            BenhNhanBaoHiemYTe moi = new BenhNhanBaoHiemYTe();
            nhapThongTin(moi);
            danhSach.add(moi);
            String lineEmp;
            lineEmp=moi.getId()+COMMA+moi.getHoTen()+COMMA
                    +moi.getNgayNhapVien()+COMMA+moi.getNgayRaVien()
                    +COMMA+moi.isPhongTheoYeuCau()+COMMA
                    +moi.getDONGIA();
            FileUtils.writeFile(FILE_EMPLOY,lineEmp);
        }else {
            BenhNhanBaoHiemXaHoi moi = new BenhNhanBaoHiemXaHoi();
            nhapThongTin(moi);
            danhSach.add(moi);
            String lineEmp;
            lineEmp=moi.getId()+COMMA+moi.getHoTen()+COMMA
                    +moi.getNgayNhapVien()+COMMA+moi.getNgayRaVien()+COMMA+moi.isPhongTheoYeuCau()+COMMA
                    +moi.getDONGIA();
            FileUtils.writeFile(FILE_EMPLOY,lineEmp);
        }

        System.out.println("Them thanh cong");
    }

    public static void delete(){

        System.out.print("Nhap id muon xoa: ");
        String id = sc.nextLine();
        String lineBN= null;
        System.out.print("1.xoa benh nhan bao hiem y te\n" +
                "2.xoa benh nhan bao hiem xa hoi ");
        System.out.print("You choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                List<BenhNhanBaoHiemYTe> list = new ArrayList<>();
                list = FileUtils.fileListBenhNhanBHYT();
                list.removeIf(BenhNhanBaoHiemYTe -> id.equals(BenhNhanBaoHiemYTe.getId()));
                if (list.isEmpty()) {
                    FileUtils.overwriteFile(FILE_EMPLOY, "");
                } else {
                    for (BenhNhanBaoHiemYTe bn : list) {
                        lineBN=bn.getId()+COMMA+bn.getHoTen()+COMMA+bn.getNgayNhapVien()+COMMA+bn.getNgayRaVien()+COMMA+
                                bn.isPhongTheoYeuCau()+COMMA+bn.getDONGIA();

                    }
                    FileUtils.overwriteFile(FILE_EMPLOY, lineBN);
                }
                System.out.println("Xoa thanh cong");
                break;
            case 2:
                List<BenhNhanBaoHiemXaHoi> list1 = new ArrayList<>();
                list1 = FileUtils.fileListBenhNhanBHXH();
                list1.removeIf(benhNhanBaoHiemXaHoi -> id.equals(benhNhanBaoHiemXaHoi.getId()));
                if (list1.isEmpty()) {
                    FileUtils.overwriteFile(FILE_EMPLOY, "");
                } else {
                    for (BenhNhanBaoHiemXaHoi bn : list1) {
                        lineBN=bn.getId()+COMMA+bn.getHoTen()+COMMA+bn.getNgayNhapVien()+COMMA+bn.getNgayRaVien()+COMMA+
                                bn.isPhongTheoYeuCau()+COMMA+bn.getDONGIA();

                    }
                    FileUtils.overwriteFile(FILE_EMPLOY, lineBN);
                }
                System.out.println("Xoa thanh cong");
                break;
            default:
                System.out.println("Chi chon 1 hoac 2");
        }
    }

    public void capNhatBenhNhan(String id){
        for (BenhNhan bn : danhSach) {
            if (bn.getId().equals(id)){
                System.out.println("Cap nhat thong tin Benh Nhan " + id);

                System.out.print("Nhap Ho ten: ");
                bn.setHoTen(sc.nextLine());

                System.out.print("Phong theo yeu cau (1: co, 0: khong): ");
                int i = sc.nextInt();
                bn.setPhongTheoYeuCau(i==1);

                System.out.println("Cap nhat thanh cong");
                return;
            }
        }

        System.out.println("Ma so benh nhan khong ton tai");
    }

    public static void inThongTin(BenhNhan bn){
        System.out.println("ID: " + bn.getId());
        System.out.println("HoTen: " + bn.getHoTen());
        System.out.println("Ngay Nhap Vien: " + bn.getNgayNhapVien());
        System.out.println("Ngay ra Vien: " + bn.getNgayRaVien());

        String[] splitData;
        System.out.println("Phong theo yeu cau: " + ((bn.isPhongTheoYeuCau()?"Co":"Khong")));
    }

    public static void timKiemBenhNhan(){
        System.out.print("Nhap id muon xoa: ");
        String id = sc.nextLine();
        List<BenhNhanBaoHiemYTe> list = new ArrayList<>();
        list = FileUtils.fileListBenhNhanBHYT();
        for (BenhNhan bn : list) {
            if (bn.getId().equals(id)){
               inThongTin(bn);
            }
        }
    }

    public static void tinhTien(){
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

    public static void showListBNBHYT() {
        List<BenhNhanBaoHiemYTe> ListBN=new ArrayList<>();
        ListBN=FileUtils.fileListBenhNhanBHYT();
        for (BenhNhanBaoHiemYTe bn : ListBN) {
            bn.showInfo();
        }

    }

        public static void showListBNBHXH(){
            List<BenhNhanBaoHiemXaHoi> ListBN=new ArrayList<>();
            ListBN=FileUtils.fileListBenhNhanBHXH();
            for (BenhNhanBaoHiemXaHoi bn : ListBN) {
                bn.showInfo();
            }

        }

}

