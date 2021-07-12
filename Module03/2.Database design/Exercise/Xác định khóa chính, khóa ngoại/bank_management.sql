create database bank_management;

use bank_management;

create table  Customer
(
 customer_number int(20) primary key ,
 full_name varchar(40),
    address varchar(40),
    email varchar(30),
    phone varchar(20)
 );
 
create table Accounts
(
   account_number int(20) primary key ,
    account_type  varchar(30),
    date date,
    balance int (20)
    );
    
create table Transactions
(
tran_number int(20) primary key,
account_number int (20) not null,
 amounts int(30),
date  date,
descriptions varchar(30)
);

alter table Accounts
add customer_number int(20),
add foreign key (customer_number) references Customer(customer_number);

alter table Transactions
add foreign key(account_number) references Accounts(account_number);
