
-- create database and initial data;

Drop database IF EXISTS StudentDB;
CREATE DATABASE StudentDB;
Use StudentDB;

 create table If Not exists Student (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
 );

-- INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES ("Liam","1995-03-04",30000.00,26);
-- INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES ("Oliver","1997-03-04",54300.00,24);
-- INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES ("James","1996-03-24",25000.00,25);
-- INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES ("Lucas","1990-12-24",45000.00,31);
-- INSERT INTO Employee (EmpName, DOB, Salary, Age) VALUES ("Bryan","1994-12-24",65000.00,27);


select * from Student where id>0;