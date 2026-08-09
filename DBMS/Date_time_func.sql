Date & Time Functions

  
DATE_FORMAT() 
How do you format a date to display cleanly like 'Sunday, Dec 2026'?

SELECT DATE_FORMAT(order_date, '%W, %b %Y') AS readable_date 
FROM orders;
-- Note: Oracle/PostgreSQL uses TO_CHAR(order_date, 'Day, Mon YYYY')


EXTRACT() / YEAR / MONTH / DAY
  How do you filter transactions to show only those made in the month of December?

  SELECT transaction_id 
FROM transactions 
WHERE EXTRACT(MONTH FROM transaction_date) = 12;
-- Alternative: WHERE MONTH(transaction_date) = 12;

  
DATEDIFF() -(Calculate Days Between)
Write a query to find all subscriptions that expired exactly 30 days or more ago.

SELECT subscription_id 
FROM subscriptions 
WHERE DATEDIFF(NOW(), end_date) >= 30;



DATE_SUB() / DATESUB (Subtract Time Intervalls)
How do you pull a list of orders placed in the last 7 days?

SELECT order_id 
FROM orders 
WHERE order_date >= DATE_SUB(CURDATE(), INTERVAL 7 DAY);
-- Note: SQL Server uses DATEADD(day, -7, GETDATE())


DATE_ADD() / DATEADD (Add Time Intervalls)
How do you calculate a subscription expiry date that is exactly 30 days after the purchase date?

SELECT purchase_date, DATE_ADD(purchase_date, INTERVAL 30 DAY) AS expiry_date 
FROM subscriptions;
-- Note: SQL Server uses DATEADD(day, 30, purchase_date)


CURDATE() / CURRENT_DATE (Get Current Date Only)
SELECT invoice_id 
FROM invoices 
WHERE due_date = CURDATE();


 How do you record the exact date and time an entry was created?
SELECT NOW() AS entry_timestamp;
-- Note: SQL Server uses GETDATE() or CURRENT_TIMESTAMP







