--create table StudentDetailsss(StudentId int, FName varchar(15), LName varchar(15), Age int, EmailId varchar(25), Gender varchar(10), Address varchar(15), RollNo int);

--insert into StudentDetails values(1, "Jagadeesh", "Dontamsetti", 23, "d.jagadeesh@gmail.com", "Male", "Rajahumdry", 12345),(2, "Uday", "Mulaparthi", 22, "m.udaykumar@gmail.com", "Male", "Annavaram", 12346),(3, "Sandeep", "Garnipudi", 22, "g.sandeep@gmail.com", "Male", "Kovvur", 12347),(4, "Sivasai", "Dava", 22, "dava.sivasai@gmail.com", "Male", "Ongole", 12348),(5, "Harsha", "Reddy", 23, "reddy.harsha@gmail.com", "Male", "Nellore", 12349),(6, "Yamuna", "Karra", 21,"k.yamuna@gmail.com","Female","Nellore", 12350),(7, "Mounika", "Upputuri", 20, "u.mouni@gmail.com", "Female", "Chirala", 12351),(8, "Siva", "Durga", 21, "durga@gmail.com", "Female","Rajahumdry", 12352),(9, "Sai", "Priya", 21, "saipriya@gmail.com", "Female", "Anakapalli",12353),(10, "Jeevan", "Kumar", 24, "jeevan@gmail.com", "Male", "Tenali", 12354);

--select * from StudentDetails;

--create table DeptDetailss(DeptId int, DeptName varchar(20), CreatedDate date);

--insert into DeptDetailss values(1, "EEE", '4/2/2000'),(2, "IT", '4/2/2000'),(3, "CSE", '5/2/2000'),(4, "MECH", '5/2/2000'),(5, "EIE", '4/2/200');

 -- select * from DeptDetails;

--create table SubjectDeptDetailss(SubjectId int, Subject varchar(15), DeptId int);

--insert into SubjectDeptDetailss values(1, "Python", 2),(2, "DBMS", 2),(3, "Cyber Security", 3),(4, "Hacking", 3),(5, "Machines", 1),(6, "Control Systems", 1),(7, "Thermodynamics", 4),(8, "GME", 4),(9, "Signals", 5),(10, "SoundWaves", 5);

--select * from SubjectDeptDetailss;

--create table StudentMarkss(SMID int, StudentId int, SubjectId int, Marks int, Percentage float);

-- insert into StudentMarkss values(1, 1, 5, 85, 85.2),(1, 2, 1, 90, 90.5),(1, 3, 2, 85, 85.4),(1, 4, 10, 75, 75.6),(1, 5, 7, 84, 84.7),(1, 6, 9, 94, 94.4),(1, 7, 4, 90, 90.1),(1, 8, 7, 86, 86.8),(1, 9, 2, 82, 82.9),(1, 10, 8, 88, 88.5);

-- select * from StudentMarkss;

-- create table StudentDeptDetailss(SDeptId int, StudentId int, DeptId int);

-- insert into StudentDeptDetailss values(1, 1, 1),(2, 2, 2),(2, 3, 2),(4, 4, 5),(4, 5, 4),(5, 6, 5),(3, 7, 3),(4, 8, 4),(2, 9, 2),(4, 8, 4);

-- select * from StudentDeptDetailss;

-- 1.	Write a query to select all columns of studentdetails table.
-- select * from StudentDetails;

-- 2.	Write a query to select studentid from studentdetails table
-- select StudentId from StudentDetails;

-- 3.	Write a query to select studentnames from studentdetails whose age is greater than 20
-- select FName from StudentDetails where Age>20;

-- 4.	Write a query to select sname as StudentName from studentdetails whose studentid is less than 10
-- select FName from StudentDetails where StudentId<10;

-- 5.	Write a query to select all columns of studentdetails table where studentid is either 1,2 and 7
--select FName from STudentDetailsss where StudentId=1 or StudentId=2 or StudentId=7;

-- 6.	Write a query to select all columns of studentdetails table  where studentid is from 1 to 10
-- select * from StudentDetails where StudentId>=1 and StudentId<=10;

-- 7.	Write a query to update sname as ‘vijay’ of studentdetails table where studentid is 1
--update StudentDetails set FName = "Vijay" where FName = "Jagadeesh";
--select FName from StudentDetails;

-- 8.	Write a query to update deptname as ‘CSE’ of deptdetails where deptid is 6
--update DeptDetails set DeptId = 6 where DeptId = 3;
--select * from DeptDetails;

-- 9.	Write the query to update the age as 20 where studentid is either 1,2,3
-- update StudentDetails set Age = 20 where StudentId=1 or StudentId=2 or StudentId=3;
-- select * from StudentDetails;


-- 10.	Write the query to get student who have scored maximum marks.
-- select max(Marks) from StudentMarks;

--11. Write a query to sort the students in studentdetails tables by rollno in descending order
-- select * from StudentDetails order by RollNo desc;

-- 12.Write a query to sort the students in studentdetails tables by studenid in ascending order.
-- select * from StudentDetails order by RollNo;

-- 13. Write the query to display studentname in ascending order.
-- select * from StudentDetails order by FName;

