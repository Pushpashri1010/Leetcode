# Write your MySQL query statement below
SELECT Person.firstName  ,Person.lastName,Address.city,Address.state from person LEFT JOIN Address ON Person.personId=Address.personId;