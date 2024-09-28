# Write your MySQL query statement below
#select distinct email from Person;
select email from Person Group by email having count(email)>1;
