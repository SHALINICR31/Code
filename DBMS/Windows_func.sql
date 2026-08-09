ROW_NUMBER()
How do you assign a sequential ranking to employees within each department based on 
  their salary (highest to lowest), ensuring every row gets a unique number?

SELECT department_id, employee_name, salary,
       ROW_NUMBER() OVER(PARTITION BY department_id ORDER BY salary DESC) AS row_num
FROM employees;


RANK()
How do you rank products by sales volume within their category, skipping ranks if there is a tie?

SELECT category_id, product_name, sales_volume,
       RANK() OVER(PARTITION BY category_id ORDER BY sales_volume DESC) AS rank_val
FROM products;
-- If two products tie for #1, the next product will be ranked #3.


DENSE_RANK()
How do you rank students by test scores in a class without skipping any rank numbers when scores tie?
  
SELECT class_id, student_name, test_score,
       DENSE_RANK() OVER(PARTITION BY class_id ORDER BY test_score DESC) AS dense_rank_val
FROM students;
-- If two students tie for #1, the next student will be ranked #2.


LEAD()
 How do you display a customer's order amount alongside the amount of their next subsequent order?

  SELECT customer_id, order_date, order_amount,
       LEAD(order_amount, 1) OVER(PARTITION BY customer_id ORDER BY order_date) AS next_order_amount
FROM orders;


  LAG()
  How do you track daily stock price changes by showing today's price alongside yesterday's closing price?


  SELECT stock_ticker, trade_date, close_price,
       LAG(close_price, 1) OVER(PARTITION BY stock_ticker ORDER BY trade_date) AS previous_day_price
FROM stock_history;



  Running Totals (SUM() OVER)

   How do you calculate a running total of monthly revenue across the year?

  SELECT fiscal_year, fiscal_month, monthly_revenue,
       SUM(monthly_revenue) OVER(PARTITION BY fiscal_year ORDER BY fiscal_month) AS running_total
FROM revenue_report;

  
  

