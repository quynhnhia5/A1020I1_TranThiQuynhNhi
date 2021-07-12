create database Foreign_Key;

use Foreign_Key;

CREATE TABLE customers(
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(40),
   address VARCHAR(255),
   email VARCHAR(255)
);

CREATE TABLE orders(
   id INT AUTO_INCREMENT,
   staff VARCHAR(50),
   PRIMARY KEY(id)
   );
   alter table orders
   add customers_id INT not null, 
   add FOREIGN  KEY (customers_id) references customers(id);
