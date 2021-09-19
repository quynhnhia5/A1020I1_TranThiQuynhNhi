create database ex4;

use ex4;

create table hocvien
( id int not null,
ten varchar(20) not null,
tuoi int not null,
khoahoc varchar(10) not null,
sotien int not null
);
INSERT INTO hocvien  VALUES (1, 'Hoang', '21', 'CNTT', 400000),
							(2, 'Viet', '19', 'DTVT', 320000),
							(3, 'Thanh', '18', 'KTDN', 400000),
							(4, 'Nhan', '19', 'CK', 450000),
							(5, 'Huong', '20', 'TCNH', 500000),
							(6, 'Huong', '21', 'DTVT', 200000);
                            
select * 
from hocvien
where ten='Huong';

select sum(sotien)as TONG
from hocvien
where ten='Huong';

select distinct ten
from hocvien
                            
