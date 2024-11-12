show databases;

create database medicaldb;
USE medicaldb;

CREATE TABLE patient(
		ID int PRIMARY KEY AUTO_INCREMENT,
        firstName varchar(100),
        lastName varchar(100),
        gender varchar(10),
        patientType varchar(50),
        age int(5),
        email varchar(50),
        message varchar(100)
        );
        
DROP TABLE patient;

INSERT INTO patient(firstName, lastName, gender, patientType, age, email, message) 
VALUES('Nisarg', 'Patel','MALE', 'Appointment', 22, 'nisargpatel@gmail.com', 'Hello');


SELECT * FROM patient;


CREATE TABLE patient_test(id int PRIMARY KEY AUTO_INCREMENT, name varchar(100);

INSERT INTO patient(firstName, lastName, gender, patientType, age, email, message)
	VALUES('Nisarg','Patel','MALE','Appointment',23, 'nisargpatel@gmail.com', 'Hi');

SELECT * FROM patient;
DELETE FROM patient WHERE id=2;

UPDATE patient SET firstName='Nisarg', lastName= 'Patel' ,gender='MALE', patientType='Emergency', age = 25, email = 'nisarg@yahoo.com', message = 'hello everyone' WHERE id=1;


ALTER TABLE patient_test AUTO_INCREMENT = 1;
