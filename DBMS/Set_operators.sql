
UNION
  How do you get a unique list of all cities where you have either a customer or a supplier?

SELECT city FROM customers
UNION
SELECT city FROM suppliers;


UNION ALL
How do you combine all active and archived order IDs into a single list, including any IDs that might exist in both tables?
  

  SELECT order_id FROM active_orders
UNION ALL
SELECT order_id FROM archived_orders;

INTERSECT
  How do you find employees who are both certified software developers and certified project managers?

  SELECT employee_id FROM developer_certifications
INTERSECT
SELECT employee_id FROM manager_certifications;


EXCEPT / MINUS
How do you list premium customers who have never opened a customer support ticket?
SELECT customer_id FROM premium_customers
EXCEPT
SELECT customer_id FROM support_tickets;




  
  


INTERSECT ALL
How do you find matching transaction amounts between two accounts, keeping every duplicate instance 
where the exact same amount was processed multiple times in both accounts?

SELECT amount FROM account_a_transactions
INTERSECT ALL
SELECT amount FROM account_b_transactions;


EXCEPT ALL
How do you compare inventory batches to find exactly how many items are missing,
keeping duplicate records if multiple identical items are lost?

SELECT item_id FROM expected_inventory
EXCEPT ALL
SELECT item_id FROM actual_inventory;


Database System	INTERSECT / EXCEPT	        INTERSECT ALL / EXCEPT ALL
PostgreSQL 	✅ Supported	                  ✅ Supported
Oracle DB	✅ Supported (MINUS)            	❌ Not Supported
SQL Server	✅ Supported	                  ❌ Not Supported
MySQL	✅ Supported (v8.0.31+)             	❌ Not Supported
SQLite	✅ Supported	                      ❌ Not Supported
