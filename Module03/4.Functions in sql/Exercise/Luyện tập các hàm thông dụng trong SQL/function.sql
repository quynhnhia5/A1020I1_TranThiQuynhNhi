create database function;

use function;

create table hocvien
( id int not null,
ten varchar(20) not null,
tuoi int not null,
khoahoc varchar(10) not null,
sotien int not null
);

select * 
from hocvien
where ten='Huong';

select sum(sotien)as TONG
from hocvien
where ten='Huong';

select distinct ten
from hocvien



