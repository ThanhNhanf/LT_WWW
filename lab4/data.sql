CREATE DATABASE springboot_crud;
GO

USE springboot_crud;
CREATE TABLE students (
    id INT IDENTITY(1,1) PRIMARY KEY, -- IDENTITY tương ứng với AUTO_INCREMENT
    name NVARCHAR(100),
    email VARCHAR(100),
    age INT
);
