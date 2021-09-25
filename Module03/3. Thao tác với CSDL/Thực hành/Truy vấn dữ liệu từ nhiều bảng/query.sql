use furama_resort;

/*•	1.Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thõa mãn 
 các yêu cầu bên dưới.*/
 
 INSERT INTO bophan VALUES 
						(1,'Sale – Marketing'),
                        (2,'Hanh Chinh'),
                        (3,'Phuc vu'),
                        (4,'Quan Ly');
                        
INSERT INTO trinhdo VALUES
						(1,'Trung Cap'),
                        (2,'Cao Dang'),
                        (3,'Dai Hoc'),
                        (4,'Sau Dai Hoc');
                        
INSERT INTO vitri VALUES
						(1,'Le Tan'),
                        (2,'Phuc Vu'),
                        (3,'Chuyen Vien'),
                        (4,'Giam Sat'),
                        (5,'Quan Ly'),
                        (6,'Giam Doc');
                        
INSERT INTO nhanvien VALUES
						(1,'Quynh Nhi',5,3,2,'2000-01-17','2132121','10000000','012345678','quynhnhi@gmail.com','Da Nang');
                        


INSERT INTO loaikhach VALUES
						(1,'Diamond'),
                        (2,'Platinium'),
                        (3,'Gold'),
                        (4,' Silver'),
                        (5,'Member');

INSERT INTO khachhang VALUES
						(1,1,'Kieu Oanh','1995-04-24','1432322','0314234','kieuoanh@gmail.com','Gia Lai');
                        
INSERT INTO kieuthue VALUES
						(1,'Ngay',1000000),
                        (2,'Thang',30000000);

INSERT INTO loaidichvu VALUES
						(1,'Villa'),
                        (2,'House'),
                        (3,'Room');
                        

 
 /* •	2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu 
 là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.*/
 
 SELECT * FROM nhanvien
 WHERE (HoTen LIKE 'H%' or HoTen LIKE 'T%' or HoTen LIKE 'K%') 
						AND length(HoTen)<=15;
                        
/* •	3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và 
có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.*/

SELECT * FROM khachhang
WHERE (year(now())-year(Ngaysinh) BETWEEN 18 AND 50) AND (DiaChi='Da Nang' or DiaChi='Quang Tri');

/*•	4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
 Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
 Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.*/
 
 SELECT khachhang.IDKhachHang,hopdong.IDHopDong,TenLoaiKhach,COUNT(IDHopDong) AS Solandatphong  FROM hopdong
 JOIN khachhang ON hopdong.IDKhachHang=khachhang.IDKhachHang
 JOIN loaikhach ON khachhang.IDLoaiKhach=loaikhach.IDloaiKhach
 WHERE TenLoaiKhach='Diamond'
 GROUP BY(IDKhachHang)
 ORDER BY COUNT(IDHopDong)   ASC;
 
 /*•	5.Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, 
 NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia,
 với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng.
 (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).*/
 
 SELECT khachhang.IDKhachHang,Hoten,TenLoaiKhach,hopdong.IDHopDong,TenDichVu,NgayLamHopDong,NgayKetThuc,(ChiPhiThue+SoLuong*gia) as TongTien
 FROM khachhang
 LEFT JOIN hopdong ON khachhang.IDKhachHang=hopdong.IDKhachHang
 LEFT JOIN dichvu on hopdong.IDDichVu=dichvu.IDDichVu
 LEFT JOIN hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
 LEFT JOIN dichvudikem ON hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
 LEFT JOIN loaikhach ON khachhang.IDLoaiKhach=loaikhach.IDloaiKhach;
 
 
 /*•	6.Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu
 của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1
 của năm 2019 (Quý 1 là tháng 1, 2, 3).*/
 
 SELECT dichvu.IDDichVu,TenDichVu,DienTich,ChiPhiThue,TenLoaiDichVu from hopdong
 JOIN dichvu on hopdong.IDDichVu=dichvu.IDDichVu
 JOIN loaidichvu on dichvu.IDLoaiDichVu=loaidichvu.IDLoaiDichVu
 WHERE hopdong.IDDichVu not in(
 SELECT hopdong.IDDichVu hopdong
 WHERE (month(NgayLamHopDong)BETWEEN 1 and 3) and (year(NgayLamHopDong)=2019)
 );
 
 
 
 
 
 /*•	7.Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
 của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018
 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.*/
 
 SELECT dichvu.IDDichVu,TenDichVu,DienTich,ChiPhiThue,TenLoaiDichVu  FROM hopdong
 JOIN dichvu on hopdong.IDDichVu=dichvu.IDDichVu
 JOIN loaidichvu on dichvu.IDLoaiDichVu=loaidichvu.IDLoaiDichVu
 WHERE (hopdong.IDDichVu NOT in (
 SELECT hopdong.IDDichVu FROM hopdong WHERE
 year(NgayLamHopDong)=2019)) AND year(NgayLamHopDong) =2018;
 
 
 
 /*•	8.Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
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
  
  
  /*•	9.Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019
  thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.*/
  
  SELECT  month(NgayLamHopDong)as thang,count(*) as soluonghopdong FROM hopdong 
  WHERE year(NgayLamHopDong)=2019
  GROUP BY month(NgayLamHopDong);
  
  
  /*•	10.Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
  Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem
  (được tính dựa trên việc count các IDHopDongChiTiet).*/
  
  SELECT hopdong.IDHopDong,NgayLamHopDong,NgayKetThuc,TienDatCoc,count(*)as soluongdichvudikem FROM hopdong
  JOIN hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
  JOIN dichvudikem on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
  GROUP BY hopdongchitiet.IDHopDong
  HAVING COUNT(*);
  
  
  
  
  /*•	11.Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là
  “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.*/
  
  SELECT  khachhang.IDKhachHang,TenLoaiKhach,DiaChi,TenDichVuDiKem
  FROM hopdongchitiet
  JOIN hopdong on hopdongchitiet.IDHopDong=hopdong.IDHopDong
  JOIN khachhang on hopdong.IDKhachHang=khachhang.IDKhachHang
  JOIN loaikhach on khachhang.IDLoaiKhach=loaikhach.IDloaiKhach
  JOIN dichvudikem on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
  WHERE TenLoaiKhach='Diamond' AND (DiaChi='Vinh' OR DiaChi='Quang ngai');
  
  /*•	12.Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu,
  SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ 
  đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.*/
  SELECT hopdong.IDHopDong,nhanvien.Hoten as TenNhanVien, khachhang.Hoten as TenKhachHang,khachhang.SDT,TenDichVu,
  count(IDDichVuDiKem) as soluongdichvudikem,TienDatCoc FROM hopdong
  JOIN nhanvien on hopdong.IDNhanVien=nhanvien.IDNhanVien
  JOIN khachhang on hopdong.IDKhachHang=khachhang.IDKhachHang
  JOIN dichvu on hopdong.IDDichVu=dichvu.IDDichVu
  JOIN hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
  WHERE ( hopdong.IDDichVu not in(
  SELECT hopdong.IDDichVu FROM hopdong WHERE
  year(NgayLamHopDong)=2019 and month(NgayLamHopDong) BETWEEN 1 and 6)) AND
  (year(NgayLamHopDong)=2019 and month(NgayLamHopDong) BETWEEN 10 and 12)
  GROUP BY IDHopDongChiTiet;
  
  
  /*•	13.Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
  (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).*/
  
  
  
  /*•	14.Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
  Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.*/
  
  /*•	15.Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
  mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.*/
  
  /*•	16.Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.*/
  
  /*•	17.Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
  chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.*/
  
  /*•	18.Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).*/
  
  /*•	19.Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.*/
  
  /*•	20.Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID
  (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.*/
  
  