1. Basic Data Filtering (SELECT, WHERE, AND, OR, NOT, IN, BETWEEN)

How do you find all employees in the 'Sales' department?

SELECT * FROM employees 
WHERE department = 'Sales';


How do you list products that cost more than $50?

SELECT * FROM products 
WHERE price > 50;

How do you find active users who live in 'New York'?

SELECT * FROM users 
WHERE status = 'active' AND city = 'New York';

 How do you select orders from the UK, France, or Germany?


SELECT * FROM orders 
WHERE country IN ('UK', 'France', 'Germany');


How do you get books published between 2020 and 2025?

SELECT * FROM books 
WHERE publish_year BETWEEN 2020 AND 2025;


