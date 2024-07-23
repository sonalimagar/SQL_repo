create table employee(emp_id int,name varchar(20),dept_id int)

create table department (depy_id int, dept_name varchar(20))

insert into employee values(1, 'Alice', 101),
(2, 'Bob', 102),
(3, 'Charlie', NULL),
(4, 'David', 103),
(5, 'Eve', 104)

insert into department values(101,'HR'),
(102,'engineering'),
(103,'marketing'),
(105,'sales')

--Q1 inner join
  select e.name,d.dept_name from employee e
  inner join department d
  on e.dept_id=d.depy_id
where d.dept_name="engineering"

--Q2 letft  join
  select e.emp_id, e.name,d.dept_name from employee e
  left join department d
  on e.dept_id=d.depy_id
--where e.dept_id is null

--Q3 right join
  select e.emp_id,e.name,d.dept_name from employee e
  right join department d
  on e.dept_id=d.depy_id


--Q4 full outer join
select e.emp_id ,e.name ,d.dept_name from employee e
  full outer join department d
on e.dept_id =d.depy_id
