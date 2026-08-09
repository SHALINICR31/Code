LEFT & RIGHT (Quick Extractions)
How do you extract the final 4 digits of a credit card number?

SELECT RIGHT(card_number, 4) AS last_four_digits 
FROM payments;


INSTR / CHARINDEX (Find Character Position)
How do you find the numeric position of the @ symbol in user email addresses?

SELECT INSTR(email, '@') AS symbol_position 
FROM users;
-- Note: SQL Server uses CHARINDEX('@', email)


TRIM / LTRIM / RTRIM (Remove Spaces)
How do you clean up user inputs by removing accidental spaces at both the beginning and end of product codes?

SELECT TRIM(product_code) AS clean_code 
FROM inventory;


UPPER & LOWER (Case Modification)
SELECT LOWER(email) AS standardized_email 
FROM employees;


REPLACE (Substitute Text)
How do you update website links by replacing all instances of http:// with https://?

SELECT REPLACE(website_url, 'http://', 'https://') AS secure_url 
FROM companies;


LENGTH / LEN (Character Count)
How do you find all usernames that are too short (fewer than 6 characters long)?
SELECT username 
FROM users 
WHERE LENGTH(username) < 6;


SUBSTRING / SUBSTR (Extract Text)
How do you extract just the area code (the first 3 digits) from a phone number column?

SELECT SUBSTRING(phone_number, 1, 3) AS area_code 
FROM contacts;


CONCAT (Combine Strings)
How do you combine first names and last names into a single column named full_name with a space between them?

SELECT CONCAT(first_name, ' ', last_name) AS full_name 
FROM customers;
