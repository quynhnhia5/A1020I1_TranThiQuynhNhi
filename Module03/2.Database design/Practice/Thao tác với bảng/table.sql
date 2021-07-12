create database th1;

use th1;

CREATE TABLE contacts
(
 contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_id PRIMARY KEY (contact_id)
);


create table suppliers
( supplier_id int not null ,
  supplier_name varchar(50) not null,
  account_rep varchar(30) not null default 'TBD',
  constraint suppliers_pk primary key (supplier_id)
);

DROP TABLE suppliers;

ALTER TABLE contacts
  ADD name varchar(40) NOT NULL
    AFTER contact_id;
    
ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;
  
ALTER TABLE contacts
  DROP COLUMN name;
  
ALTER TABLE contacts
  RENAME TO people;