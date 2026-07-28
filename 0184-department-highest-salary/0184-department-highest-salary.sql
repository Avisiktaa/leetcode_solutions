# Write your MySQL query statement below
select d.name as Department,
       e.name as Employee ,
       e.salary as salary
from (
    select *,
    rank() over(partition by departmentId order by salary desc)as rnk
    from employee
    )e
    join Department d on e.departmentId=d.id
    where e.rnk=1;