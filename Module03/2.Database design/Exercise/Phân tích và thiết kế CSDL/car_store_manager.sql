create database car_store_manager;

use car_store_manager;

create table Customers
(
customerNumber int  primary key ,
customerName varchar(50) not null,
contactLastName varchar(50) not null,
contactFirstName varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50),
city varchar(50) not null,
state varchar(50) not null,
postalCode varchar(15) not null,
country  varchar(50) not null,
creditLimit  double
);
alter table Customers
add salesRepEmployeeNumber int not null,
add foreign key(salesRepEmployeeNumber) references employees(employeeNumber);


create table orders
(
orderNumber int primary key,
orderDate  date not null,
requiredDate date not null,
shippedDate  date,
status varchar(15) not null,
comments text,
quantityOrdered int not null,
priceEach double not null
);
alter table orders
add customerNumber int not null,
add foreign key (customerNumber) references Customers(customerNumber);


create table  payments
(
customerNumber int not null,
checkNumber varchar(50) not null,
paymentDate date not null,
amount  double not null
);
alter table payments
add foreign key (customerNumber) references Customers(customerNumber);

create table products
(
productCode varchar(15) primary key,
productName varchar(70) not null,
productScale varchar(10) not null,
productVendor varchar(50) not null,
productDescription text not null,
quantityInStock int not null,
buyPrice double not null,
MSRP  double not null
);
alter table  products
add productLine varchar(50) not null,
add foreign key (productLine) references productlines(productLine);


create table  productlines
(
productLine varchar(50) primary key,
textDescription text,
image text
);

create table employees
(
employeeNumber int primary key,
lastName varchar(50) not null,
firstName varchar(50) not null,
email varchar(100) not null,
jobTitle varchar(50) not null
);
alter table employees
add reportTo int not null,
add foreign key (reportTo) references employees(employeeNumber);

alter table  offices
add primary key(officeCode);

alter table employees
add officeCode varchar(10) not null,
add foreign key (officeCode) references offices(officeCode);

 
create table offices
(
officeCode varchar(10) not null,
city varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50) ,
state varchar(50),
country varchar(50) not null,
postalCode varchar(15) not null
);

create table OrderDetails
(
orderNumber int not null,
productCode varchar(15) not null,
foreign key (orderNumber) references orders(orderNumber),
foreign key (productCode) references products(productCode)
);














 
