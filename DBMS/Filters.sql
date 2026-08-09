6. Data Grouping & Filtering Groups

  Find all departments that have more than 5 employees and display the department ID along with their average salary.
  
SELECT department_id, AVG(salary) 
FROM employees 
GROUP BY department_id 
HAVING COUNT(employee_id) > 5;


8. Subqueries

Write a correlated subquery to find employees who earn more than the average salary of their specific department


SELECT name, salary, department_id 
FROM employees e 
WHERE salary > (
    SELECT AVG(salary) 
    FROM employees 
    WHERE department_id = e.department_id
);



10. Null Value Handling

If an item's sale_price can be null, how do you display the retail_price as a backup value?

SELECT item_name, COALESCE(sale_price, retail_price) AS final_price 
FROM inventory;


  11. Conditional Logic

  SELECT customer_id,
    CASE 
        WHEN total_spent > 1000 THEN 'High'
        WHEN total_spent BETWEEN 500 AND 1000 THEN 'Medium'
        ELSE 'Low'
    END AS customer_tier
FROM customer_spending;




