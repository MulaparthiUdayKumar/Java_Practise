--create table SDetails(rollno int, sname varchar(25), gender varchar(10), age int, marks float,deptid int, subjectname varchar(20), address varchar(50));

-- insert into SDetails values(1, "Jagadeesh", "male", 20, 750, 1, "Python", "Rajahumdry"),(2, "Uday", "male", 17, 650, 2, "Cybersecurity","Rajahumdry"),(11, "Vijaya", "Male", 18, 550, 5, "Machines","Ongole"),(4, "Mounika","Female", 17, 650, 6, "HTML", "Chirala"),(5, "Sravani", "Female", 17, 700, 7, "Java", "Bapatala"),(6, "Sivasai", "Male", 22, 777, 1, "Python", "kovvur"),(7, "Sandeep", "Male", 21, 650, 2, "Cybersecurity", "ongole"),(10,"vinay","Male",19,450,1,"Python","Annavaram"),(9,"Vikram","male",19,500,2,"Cybersecurity","Annavaram");

-- select * from SDetails;

-- 1.	Write the query to update the age as 20 where sname is starting with â€˜vâ€™
 --update SDetails set age = 20 where sname like "v%";
-- select * from SDetails;

-- 2.	Write the query to select all the ages whose name ends with â€˜aâ€™
--select age from SDetails where sname like "%a";

-- 3.	Write the query to delete the records from studentdetails whose sname contains â€˜vâ€™.
--delete from SDetails where sname like "v%";
--select * from SDetails;

-- 4.	Write the query to select the studentdetails whose age is from 18 to 20 and sname starts with v
--select * from SDetails where age between 18 and 20 and sname like "V%";
--select * from SDetails;

-- 5.	Write the query to get student who have scored maximum marks.
-- select max(marks) from SDetails;

-- 6.	Write a query to sort the students in studentdetails tables by rollno in descending order.
--select * from SDetails order by rollno desc;

-- 7.	Write the query to display the students count whose age is less than 20
-- select count(age) from SDetails where age<20;


-- 8.	Write the query to display studentname with max marks of each student group by studentname.
-- select max(marks),sname from SDetails group by subjectname;

-- 9. Write the query to display studentname with sum of                 marks of each student group by studentname.
-- select sum(marks),sname from SDetails group by subjectname;

-- 10.Write the query to display studentname with max marks of each student group by studentname having sum of marks greater than 500.
--select max(marks),sname from SDetails group by sname having sum(marks)>500;

--     11.Write the query to display studentname with max marks of each student group by studentname having sum of marks greater than 500 and studentname starts with â€˜vâ€™.
--select max(marks) sname from SDetails group by sname having sum(marks)>500 and sname like "v%";


-- 12.Write the query to display studentname with min marks of each student group by studentname having sum of marks greater than 600.
--select min(marks),sname from SDetails group by sname having sum(marks)>600;

-- 13.  Write the query to display subjectname whose subject name starts with "p" and deparment id in (1,2,7).
--select subjectname from SDetails where subjectname like "P%" and rollno in(1,2,7);

-- 14.  Write the query the students count based on gender.
--select count(gender) from SDetails where gender = "Male";

-- 15. Write the query the students count based the address and having count greater than 30. 
--select count(sname) from SDetails group by address having count(address)>5;
