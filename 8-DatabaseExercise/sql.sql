-- create database;

-- Drop database IF EXISTS EmployeeDB;
-- CREATE DATABASE EmployeeDB;
Use EmployeeDB;

create table If Not exists Employee (
   EmpID INT NOT NULL AUTO_INCREMENT,
   EmpName VARCHAR(100) NOT NULL,
   DOB DATE,
   Salary decimal(10,2),
   Age INT,
   PRIMARY KEY (EmpID)
);

select * from Employee;

