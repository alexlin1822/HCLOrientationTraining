
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

INSERT INTO Student (first_name, last_name, email) VALUES ("Liam","Green","Liamgreen@gmail.com");
INSERT INTO Student (first_name, last_name, email) VALUES ("Oliver","Brown","Oliver@hotmail.com");
INSERT INTO Student (first_name, last_name, email) VALUES ("James","Smith","jamesS@gmail.com");


select * from Student where id>0;