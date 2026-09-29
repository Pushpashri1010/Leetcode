# Write your MySQL query statement below
SELECT emp.name AS Employee 
FROM Employee AS emp
WHERE emp.salary > (
    SELECT mgr.salary 
    FROM Employee AS mgr 
    WHERE mgr.id = emp.managerId
);
