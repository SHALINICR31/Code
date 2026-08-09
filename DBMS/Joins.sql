INNER JOIN
How do you list all employees along with their specific department names?

SELECT e.employee_id, e.employee_name, d.department_name
FROM employees e
INNER JOIN departments d ON e.department_id = d.department_id;


LEFT JOIN (LEFT OUTER JOIN)
How do you list all customers and any orders they have placed, 
  including customers who haven't ordered anything?

SELECT c.customer_id, c.customer_name, o.order_id
FROM customers c
LEFT JOIN orders o ON c.customer_id = o.customer_id;


RIGHT JOIN (RIGHT OUTER JOIN)
 How do you display all projects and the employees assigned to them, 
  ensuring projects with no assigned employees still appear?

SELECT e.employee_name, p.project_name
FROM employees e
RIGHT JOIN projects p ON e.project_id = p.project_id;


  
FULL OUTER JOIN
  How do you get a complete list of students and classes, showing students without 
  classes and classes with no students?

  SELECT s.student_name, c.class_name
FROM students s
FULL OUTER JOIN classes c ON s.class_id = c.class_id;

  

  CROSS JOIN
  How do you generate every possible combination of clothing sizes and shirt colours?

  SELECT s.size_name, c.color_name
FROM sizes s
CROSS JOIN colors c;



  SELF JOIN
  How do you display a list of all employees alongside the name of their direct manager?

  SELECT e.employee_name AS employee, m.employee_name AS manager
FROM employees e
INNER JOIN employees m ON e.manager_id = m.employee_id;



  ANTI JOIN (Filtering for Unmatched Rows)
 How do you find a list of all products that have never been sold to any customer?


  SELECT p.product_id, p.product_name
FROM products p
LEFT JOIN sales s ON p.product_id = s.product_id
WHERE s.product_id IS NULL;

  
