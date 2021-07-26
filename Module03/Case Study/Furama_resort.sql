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
  
  /*Hiển thị thông tin của tất cả nhân viên có trong hệ thống 
có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” 
 và có tối đa 15 ký tự.*/
 
 select*
 from NhanVien
 where ( HoTen like ' H%' or HoTen like ' T%'or HoTen like ' K%' ) and length(HoTen) <=15;
 
 
 
/*Hiển thị thông tin của tất cả khách hàng có độ tuổi 
từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.*/
 
select* 
from khachhang
where (year(now())-year(NgaySinh) between 18 and 50 )
       and (DiaChi='Da Nang' or  DiaChi='Quang Tri');

 /*Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
 Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.*/

select khachhang.IDKhachHang,Hoten,TenLoaiKhach,count(IDHopDong) as SoLanDatPhong
from hopdong
 join khachhang on hopdong.IDKhachHang = khachhang.IDKhachHang
 join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
where TenLoaiKhach='Diamond'
group by IDKhachHang
order by count(IDHopDong) ;

/*	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong,
 NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, 
 với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng.
 (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
*/

select khachhang.IDKhachHang,Hoten,TenLoaiKhach,TenDichVu,NgayLamHopDong,NgayKetThuc,(ChiPhiThue+SoLuong*Gia) as TongTien
from khachhang
	 left join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDloaiKhach
	 left join hopdong  on khachhang.IDKhachHang=hopdong.IDKhachHang
	 left join dichvu on hopdong.IDDichVu=dichvu.IDDichVu
	 left join hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
	 left join dichvudikem on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem;



/*Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu
 của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019
 (Quý 1 là tháng 1, 2, 3).
*/

select dichvu.IDDichVu,TenDichVu,DienTich,ChiPhiThue,TenLoaiDichVu
from dichvu
 join hopdong on dichvu.IDDichVu=hopdong.IDDichVu
 join loaidichvu on dichvu.IDLoaiDichVu=loaidichvu.IDLoaiDichVu
where hopdong.IDDichVu not in 
					(select distinct hopdong.IDDichVu
                    from hopdong
                    where (month(NgayLamHopDong) between 1 and 3)
                    and year(NgayLamHopDong)=2019)
	group by hopdong.IDDichVu;

/*⦁	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018
 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
*/

select dichvu.IDDichVu,TenDichVu,DienTich,SoNguoiToiDa,ChiPhiThue,TenLoaiDichVu
from dichvu
join hopdong on dichvu.IDDichVu=hopdong.IDDichVu
join loaidichvu on dichvu.IDLoaiDichVu=loaidichvu.IDLoaiDichVu
where 
 hopdong.IDDichVu not in (
 select distinct hopdong.IDDichVu
from hopdong where year(NgayLamHopDong)=2019) and
 year(NgayLamHopDong)=2018
 group by hopdong.IDDichVu;

/*Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên*/
-- c1
select distinct Hoten
from khachhang;

-- c2
 select Hoten
 from khachhang
 group by Hoten ;
 
 -- c3
  select Hoten
  from khachhang
  union
  select Hoten
  from khachhang;
  
  /*⦁	Thực hiện thống kê doanh thu theo tháng,
  nghĩa là tương ứng với mỗi tháng trong năm 2019
  thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
  */
  
  select NgayLamHopDong,count(IDKhachHang) as Soluongkhachhangdattrongthang
  from hopdong
  where year(NgayLamHopDong)=2019
  group by month(NgayLamHopDong)
  having count(IDKhachHang);
  
  
  
  /*⦁	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
  Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
  (được tính dựa trên việc count các IDHopDongChiTiet).
  */
  
  select hopdong.IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCoc,count(*) as SoLuongDichVuDiKem 
    from hopdong
    join hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
    join dichvudikem on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
    group by hopdongchitiet.IDHopDong
    having count(*);
  
  
  
  /*⦁	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng 
  có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
  */
  select hopdong.IDHopDong,khachhang.IDKhachHang,Hoten,DiaChi,TenLoaiKhach,dichvudikem.IDDichVuDiKem,TenDichVuDiKem,Gia
  from khachhang join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
       join hopdong on khachhang.IDKhachHang=hopdong.IDKhachHang
       join hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
       join dichvudikem on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
  where TenLoaiKhach='Diamond' and ( DiaChi='Vinh' or DiaChi='Quang Ngai')
  group by hopdong.IDHopDong;
  
  
  
  /*Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, 
  SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ
  đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt 
  vào 6 tháng đầu năm 2019.
  */
  select hopdong.IDHopDong,nhanvien.Hoten as Ho_Ten_Nhan_Vien,khachhang.Hoten as Ho_Ten_Khach_Hang,khachhang.SDT as SDT_Khach_Hang,TenDichVu,SoLuong as SoLuongDichVuDiKem
  from hopdong join dichvu on hopdong.IDDichVu=dichvu.IDDichVu
       join khachhang on hopdong.IDKhachHang=khachhang.IDKhachHang
       join nhanvien on hopdong.IDNhanVien=nhanvien.IDNhanVien
	   join hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
   where (hopdong.IDDichVu not in (
               select distinct IDDichVu
               from hopdong
			   where ( month(NgayLamHopDong) between 1 and 6) 
                                     and year(NgayLamHopDong)=2019))
        and ( hopdong.IDDichVu in (
			select distinct IDDichVu
			from hopdong
			where ( month(NgayLamHopDong) between 10 and 12) 
            and year(NgayLamHopDong)=2019))
group by hopdong.IDHopDong;
	
  
    /*⦁	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
    (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
    */
    
    select dichvudikem.IDDichVuDiKem,TenDichVuDiKem,count(*) as SoLanSuDung
    from dichvudikem join hopdongchitiet on dichvudikem.IDDichVuDiKem=hopdongchitiet.IDDichVuDiKem
    group by dichvudikem.IDDichVuDiKem
    having count(*)
    >= all ( select count(*) from hopdongchitiet group by IDDichVuDiKem);
   
    
    /*Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
    Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
    */
    select hopdong.IDHopDong, TenDichVuDiKem,TenLoaiDichVu,count(*) as SoLuongDuocSuDung
    from hopdong join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
		join dichvu  on hopdong.IDDichVu = dichvu.IDDichVu
        join loaidichvu on dichvu.IDLoaiDichVu = loaidichvu.IDLoaiDichVu
        join dichvudikem on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
    group by dichvudikem.IDDichVuDiKem
    having count(*) =1;
	
    /*Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi
    mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
    */
    
    select nhanvien.IDNhanVien,HoTen,count(hopdong.IDHopDong)
    from nhanvien
    join hopdong on nhanvien.IDNhanVien=hopdong.IDNhanVien
	where (year(NgayLamHopDong) between 2018 and 2019 ) 
    group by hopdong.IDNhanVien
    having count(*)
    <= all( select count(hopdong.IDHopDong) 
    from nhanvien join hopdong on nhanvien.IDNhanVien=hopdong.IDNhanVien
	group by hopdong.IDNhanVien
    having count(hopdong.IDHopDong)<3);
    
    
    /*Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.*/

    delete
    from nhanvien 
    where IDNhanVien not in 
    ( select IDNhanVien
    from hopdong
    where year(NgayLamHopDong) between 2017 and 2019
    group by IDNhanVien);
    
    
    
    /*Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
    chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019
    là lớn hơn 10.000.000 VNĐ.
    */
    
    update loaikhach
    set TenLoaiKhach='Diamond'
    where  TenLoaiKhach=(
    select TenLoaiKhach from khachhang
    join hopdong on khachhang.IDKhachHang=hopdong.IDKhachHang
    join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
    where year(NgayLamHopDong )=2019 and TongTien>10000000
    group by khachhang.IDLoaiKhach 
    having khachhang.IDLoaiKhach=1);
    
    /*⦁	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng */

	delete 
    from khachhang
    where IDKhachHang=(
    select IDKhachHang from hopdong
    where year(NgayLamHopDong)<2016);
    
/*⦁	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.*/ 

select count(IDHopDongChiTiet)
from dichvudikem 
join hopdongchitiet on dichvudikem.IDDichVuDiKem=hopdongchitiet.IDDichVuDiKem
join hopdong on hopdongchitiet.IDHopDong=hopdong.IDHopDong
where year(NgayLamHopDong)=2019
 group by hopdongchitiet.IDDichVuDiKem
having count(hopdongchitiet.IDHopDongChiTiet)>=all
(select  count(IDHopDongChiTiet)
from hopdongchitiet 
group by IDDichVuDiKem
having count(IDHopDongChiTiet)=3);

/*Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống,
 thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
*/
-- chua lam duoc

/*Tạo khung nhìn có tên là V_NHANVIEN để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu”
 và đã từng lập hợp đồng cho 1 hoặc nhiều Khách hàng bất kỳ  với ngày lập hợp đồng là “12/12/2019
*/

create view V_NHANVIEN as
select nhanvien.IDNhanVien,HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SDT,DiaChi
from nhanvien join hopdong on nhanvien.IDNhanVien=hopdong.IDNhanVien
where DiaChi='Hai Chau' and NgayLamHopDong='2019-12-12';

drop view V_NHANVIEN

/*Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu” 
đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này
*/

update  V_NHANVIEN
set DiaChi='Lien Chieu'
where  DiaChi='Hai Chau';
-- update cả nhân viên có dia hai chau

-- kiem tra view duoc update khong
select table_name, is_updatable 
from information_schema.views
where table_schema='Furama_resort';
drop database Furama_resort

/*Tạo Clustered Index có tên là IX_KHACHHANG trên bảng Khách hàng.
Giải thích lý do và thực hiện kiểm tra tính hiệu quả của việc sử dụng INDEX
*/bophan
create Clustered Index 

