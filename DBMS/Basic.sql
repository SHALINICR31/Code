2. Wildcards & Pattern Matching

 Write a query to find all employees whose names start with 'A' and have 'n' as their third letter.

SELECT * FROM employees 
WHERE name LIKE 'A_n%';
The _ matches exactly one character (the second letter), and % matches zero or more characters after 'n'.


It checks if the character at position 20 is 'n'.
SELECT * FROM employees 
WHERE name LIKE 'A%' 
  AND SUBSTRING(name, 20, 1) = 'n';


 tells the database to match exactly 18 characters between 'A' and 'n'.
SELECT * FROM employees 
WHERE name REGEXP '^A.{18}n';

  
3. Sorting Results
  
How do you sort a product list by category alphabetically, and then by price from highest to lowest within each category?

SELECT * FROM products 
ORDER BY category ASC, price DESC;


4. Limiting Rows

Write a query to fetch the 11th to 20th highest-priced items from a table

SELECT * FROM products 
ORDER BY price DESC 
LIMIT 10 OFFSET 10;

 LIMIT 10 specifies how many rows to return. OFFSET 10 skips the first 10 rows (the top 10 highest-priced items).


5. Aggregate Functions

SELECT 
    COUNT(*) AS total_items,
    SUM(price * stock_quantity) AS total_inventory_value,
    AVG(price) AS average_item_price,
    MIN(price) AS cheapest_item,
    MAX(price) AS most_expensive_item
FROM products;


 How do you count the number of unique customers who made a purchase?

SELECT COUNT(DISTINCT customer_id) AS unique_customers 
FROM orders;


