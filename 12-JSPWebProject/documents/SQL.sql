-- create database and initial data;

Drop database IF EXISTS LoginDB;
CREATE DATABASE LoginDB;
Use LoginDB;

CREATE TABLE  If Not exists LoginTB (
   id INT NOT NULL AUTO_INCREMENT,
   username varchar(200) DEFAULT NULL,
   password varchar(30) DEFAULT NULL,
   email varchar(200) DEFAULT NULL,
   PRIMARY KEY (`id`)
);

SELECT * FROM LoginTB; 