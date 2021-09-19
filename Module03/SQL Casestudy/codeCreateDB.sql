create database Furama_resort;

use Furama_resort;

create table khachhang
(
   IDKhachHang int primary key auto_increment,
   IDLoaiKhach int,
   Hoten varchar(45),
   Ngaysinh date,
   SoCMND varchar(45),
   SDT varchar(45),
   Email varchar(45),
   DiaChi varchar(45)
   );
   alter table khachhang
    ADD foreign key(IDLoaiKhach) references LoaiKhach(IDloaiKhach) on delete cascade on update cascade;
   
create table LoaiKhach
(
   IDloaiKhach int primary key auto_increment,
   TenLoaiKhach varchar(45)
   );
   
   
create table HopDong
(
    IDHopDong int primary key auto_increment,
    IDNhanVien int,
    IDKhachHang int,
    IDDichVu int,
    NgayLamHopDong date,
    NgayKetThuc date,
    TienDatCoc int,
    TongTien int
    );
    alter table HopDong
    ADD foreign key(IDKhachHang) references  khachhang(IDKhachHang) on update cascade on delete cascade,
    ADD foreign key(IDDichVu) references  DichVu(IDDichVu) on update cascade on delete cascade,
    ADD foreign key(IDNhanVien) references NhanVien(IDNhanVien)on update cascade on delete cascade;
    
    
    
    
create table DichVu
(
    IDDichVu int primary key auto_increment,
    TenDichVu varchar(45),
    DienTich int,
    SoTang int,
    SoNguoiToiDa varchar(45),
    ChiPhiThue varchar(45),
    IDKieuThue int,
    IDLoaiDichVu int,
    TrangThai varchar(45)
    );
    alter table DichVu
    ADD foreign key(IDKieuThue) references KieuThue(IDKieuThue) on update cascade on delete cascade,
    ADD foreign key(IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu) on update cascade on delete cascade;
    
create table KieuThue
(
    IDKieuThue int primary key auto_increment,
    TienKieuThue varchar(45),
    Gia int
    );
    
create table LoaiDichVu
(
	IDLoaiDichVu int primary key auto_increment,
    TenLoaiDichVu varchar(45)
    );
    
    
create table NhanVien
(
   IDNhanVien int primary key auto_increment,
   HoTen varchar(45),
   IDViTri int,
   IDTrinhDo int,
   IDBoPhan int,
   NgaySinh date,
   SoCMND varchar(45),
   Luong varchar(45),
   SDT varchar(45),
   Email varchar(45),
   DiaChi varchar(45)
   );
   alter table NhanVien
   add foreign key(IDViTri) references ViTri(IDViTri) on update cascade on delete cascade,
   add foreign key(IDTrinhDo) references TrinhDo(IDTrinhDo) on update cascade on delete cascade,
   add foreign key(IDBoPhan) references BoPhan(IDBoPhan) on update cascade on delete cascade;
   
create table ViTri
(
  IDViTri int primary key auto_increment,
  TenViTri varchar(45)
);

create table TrinhDo
(
  IDTrinhDo int primary key auto_increment,
  TrinhDo varchar(45)
  );
  
create table BoPhan
( 
  IDBoPhan int primary key auto_increment,
  TenBoPhan varchar(45)
  );
  
create table HopDongChiTiet
(
  IDHopDongChiTiet int primary key auto_increment,
  IDHopDong int,
  IDDichVuDiKem int,
  SoLuong int
  );
  alter table HopDongChiTiet
  add foreign key(IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem) on update cascade on delete cascade,
  add foreign key(IDHopDong) references HopDong(IDHopDong) on update cascade on delete cascade;

create table DichVuDiKem
(
  IDDichVuDiKem int primary key auto_increment,
  TenDichVuDiKem varchar(45),
  Gia int,
  DonVi int,
  TrangThaiKhaDung varchar(45)
  );