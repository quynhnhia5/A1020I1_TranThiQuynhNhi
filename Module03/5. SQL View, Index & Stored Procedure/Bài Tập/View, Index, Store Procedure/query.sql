create database view_index;

use view_index;

create table products
(
  id int(10) primary key,
  productCode varchar(30) not null,
  productName varchar(30) not null,
  productPrice double not null,
  productAmount double not null,
  productDescription text,
  productStatus text
  );
  
  create unique index productCode
  on products(productCode);
  
  create index name_price
  on products(productName,productPrice);
  
  
create view Information as
select productCode, productName, productPrice, productStatus
from Products;

create or replace view  Information as
select productCode, productName
from Products;

drop view Information;


DELIMITER //

CREATE PROCEDURE showAll()


BEGIN

  SELECT * FROM products;

END //
DELIMITER ;
CALL showAll;

-- them san pham
DELIMITER //
CREATE PROCEDURE addProduct(
IN id int(10),
IN productCode varchar(30),
IN productName varchar(30),
IN productPrice double,
IN productAmount double,
IN productDescription text,
IN productStatus text
 )
BEGIN

  insert into products() values(id,
  productCode,
  productName,
  productPrice,
  productAmount,
  productDescription,
  productStatus);

END//
DELIMITER ;

call  addProduct(5,'113','iphone',2000,3,'tot','khong');

-- sua gia san pham theo id
DELIMITER //
CREATE PROCEDURE edit(
IN idProduct int(10),
IN Price double
 )
BEGIN

  update products set productPrice=Price where id=idProduct;

END//
DELIMITER ;

call edit(1,1100);
-- xoa san pham theo id
DELIMITER //
CREATE PROCEDURE deleteProduct(
IN idProduct int(10)
 )
BEGIN

  delete from products where id=idProduct;

END//
DELIMITER ;

call deleteProduct(1);