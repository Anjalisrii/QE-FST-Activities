--Activity1--
CREATE TABLE salesman(
    salesman_id int, salesman_name varchar2(20),salesman_city VARCHAR2(20),commission int);

--Activity2--
INSERT INTO salesman VALUES(5001 ,'james Hoog','New York', 15);
INSERT INTO salesman VALUES(5002 ,'Nail Knite','paris', 13);
INSERT INTO salesman  VALUES(5005 ,'Pit Alex','London', 11);
INSERT INTO salesman VALUES(5006 ,'MCLyon','paris', 14);
INSERT INTO salesman VALUES(5007 ,'Paul Adam','Rome', 13);
INSERT INTO salesman VALUES(5003 ,'Lauson Hen','San Jose', 12);

SELECT * FROM salesman;


--ACTIVITY3--
SELECT salesman_id,salesman_city FROM salesman;
SELECT * FROM salesman WHERE salesman_city='paris';
SELECT salesman_id,commission FROM salesman WHERE salesman_name='Paul Adam';

--Activity4--
ALTER TABLE salesman ADD grade INT;
UPDATE salesman SET grade=100;
SELECT * FROM salesman;


--Activity5--

UPDATE salesman 
SET grade = 200
WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE SALESMAN_NAME='james Hoog';

UPDATE salesman SET SALESMAN_NAME='Pierre' WHERE SALESMAN_NAME='MCLyon';

SELECT * FROM salesman;

--Activity6--
-- Create a table named orders
create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);

-- Add values to the table
INSERT ALL
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)
SELECT 1 FROM DUAL;

SELECT * FROM ORDERS;

SELECT DISTINCT salesman_id FROM ORDERS;

SELECT order_no FROM orders ORDER BY order_date ASC;

SELECT order_no FROM orders ORDER BY PURCHASE_AMOUNT DESC;

SELECT * FROM orders WHERE PURCHASE_AMOUNT<500;

SELECT * FROM orders WHERE PURCHASE_AMOUNT BETWEEN 1000 AND 2000;

--Activity7--

SELECT SUM(purchase_amount) AS total_purchase FROM orders;

SELECT AVG(purchase_amount) AS average_purchase FROM orders;

SELECT MAX(purchase_amount) AS max_purchase FROM orders;

SELECT MIN(purchase_amount) AS min_purchase FROM orders;

SELECT COUNT(DISTINCT salesman_id) AS num_salesmen FROM orders;

SELECT * FROM orders;


--Activity8--

SELECT customer_id , MAX(purchase_amount) AS highest_purchase 
FROM ORDERS 
GROUP BY customer_id;


SELECT salesman_id , MAX(purchase_amount) AS highest_purchase
FROM ORDERS
WHERE order_date = DATE '2012-08-17'
GROUP BY salesman_id;

SELECT customer_id , order_date ,MAX(purchase_amount) AS highest_purchase
FROM ORDERS
WHERE PURCHASE_AMOUNT > ANY(2030,3450,5760,6000)
GROUP BY customer_id , order_date ;

SELECT * FROM ORDERS;


--Activity 9-- 
-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

-- Insert values into it
INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;

SELECT * FROM customers;

SELECT c.customer_name , s.salesman_name 
FROM CUSTOMERS c
JOIN salesman s ON c.salesman_id=s.salesman_id;

SELECT c.customer_name , s.salesman_name , c.grade
FROM CUSTOMERS c
JOIN salesman s ON c.salesman_id=s.salesman_id
WHERE c.grade < 300
ORDER BY c.customer_name ASC;

SELECT c.customer_name , s.salesman_name , s. commission
FROM CUSTOMERS c
JOIN salesman s ON c.salesman_id=s.salesman_id
WHERE s.COMMISSION > 0.12 ;

SELECT o.order_no,o.order_date, o.purchase_amount,c.customer_name , s.salesman_name ,s.commission 
FROM orders o 
JOIN customers c ON o.customer_id=c.customer_id
JOIN salesman s ON c.salesman_id=s.salesman_id;

SELECT * FROM customers;
SELECT * FROM salesman;

--activity 10--

SELECT * FROM orders 
WHERE salesman_id = (
    SELECT salesman_id 
    FROM customers 
    WHERE customer_id = 3007
);
SELECT * FROM orders 
WHERE salesman_id IN (
    SELECT salesman_id 
    FROM salesman 
    WHERE salesman_city = 'New York'
);
SELECT COUNT(*) 
FROM customers 
WHERE grade > (
    SELECT AVG(grade) 
    FROM customers 
    WHERE city = 'New York'
);
SELECT * FROM orders 
WHERE salesman_id IN (
    SELECT salesman_id 
    FROM salesman 
    WHERE commission = (SELECT MAX(commission) FROM salesman)
);








