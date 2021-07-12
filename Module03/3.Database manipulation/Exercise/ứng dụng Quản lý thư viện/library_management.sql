create database library_management;

use library_management;

create table Book
(
idBook int(10) primary key,
nameBook varchar(30) not null,
publisher varchar(30) not null,
author varchar(30) not null,
PublishingYear varchar(4) not null,
publicationsOfNumber int not null,
price double ,
image binary

);

alter table Book
add cate_number int(10) not null,
add foreign key(cate_number) references Category(cate_number);


create table Students
(
student_number varchar(15) primary key,
student_name varchar(50) not null,
address varchar(500),
email varchar(50) not null,
image binary

);

create table Category
(
cate_number int(10) primary key,
category varchar(50)
);
alter table Category
add idBook int(10) not null,
add foreign key(idBook) references Book(idBook);


create table BorrowOrder
(
student_number varchar(15) not null,
idBook int(10) not null,
borrowedDate date not null,
returnDate date not null,
foreign key (student_number) references Students(student_number),
foreign key (idBook) references Book(idBook)
);






