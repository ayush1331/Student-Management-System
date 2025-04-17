CREATE DATABASE IF NOT EXISTS student_management;
USE student_management;
CREATE TABLE IF NOT EXISTS Students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    gender VARCHAR(10),
    email VARCHAR(100) UNIQUE,
    phone_number VARCHAR(20),
    address VARCHAR(255),
    admission_date DATE,
    course VARCHAR(50)
);
CREATE TABLE IF NOT EXISTS Admissions (
    admission_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT NOT NULL,
    admission_date DATE NOT NULL,
    course VARCHAR(50) NOT NULL,
    fee_paid DECIMAL(10, 2),
    FOREIGN KEY (student_id) REFERENCES Students(student_id)
);
CREATE TABLE IF NOT EXISTS Attendance (
    attendance_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT NOT NULL,
    date DATE NOT NULL,
    status VARCHAR(20) NOT NULL,
    FOREIGN KEY (student_id) REFERENCES Students(student_id)
);3
CREATE TABLE IF NOT EXISTS Grades (
    grade_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT NOT NULL,
    course VARCHAR(50) NOT NULL,
    test_name VARCHAR(50),
    marks_obtained DECIMAL(5, 2),
    total_marks DECIMAL(5, 2),
    grade VARCHAR(10),
    FOREIGN KEY (student_id) REFERENCES Students(student_id)
);
CREATE TABLE IF NOT EXISTS Users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL
);