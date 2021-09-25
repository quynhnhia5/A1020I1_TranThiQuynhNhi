SELECT * FROM customers WHERE customerNumber = 175; 

EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;

ALTER TABLE customers ADD INDEX idx_customerNumber(customerNumber);


ALTER TABLE customers ADD INDEX idx_full_name(contactFirstName, contactLastName);

EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';


EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;


ALTER TABLE customers DROP INDEX idx_full_name;