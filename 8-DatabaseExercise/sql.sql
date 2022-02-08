
-- create database and initial data;

Drop database IF EXISTS EmployeeDB;
CREATE DATABASE EmployeeDB;
Use EmployeeDB;

 create table If Not exists Employee (
    EmpID INT NOT NULL AUTO_INCREMENT,
    EmpName VARCHAR(100) NOT NULL,
    DOB DATE,
    Salary decimal(10,2),
    Age INT,
    PRIMARY KEY (EmpID)
 );

INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES ("Liam","1995-03-04",30000.00,26);
INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES ("Oliver","1997-03-04",40000.00,24);
INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES ("James","1996-03-24",25000.00,25);
INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES ("Lucas","1990-12-24",45000.00,31);
INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES ("Bryan","1994-12-24",65000.00,27);


select * from Employee where EmpID>0;

