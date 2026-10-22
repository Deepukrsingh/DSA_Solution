select max(salary) as SecondHighestSalary from 
employee where salary < (select max(salary) as secondhighestsalary from employee);