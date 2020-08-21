CREATE DATABASE 'Bookstore';
USE Bookstore;

CREATE TABLE `book` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `author` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`book_id`),
  UNIQUE KEY `book_id_UNIQUE` (`book_id`),
  UNIQUE KEY `title_UNIQUE` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1



CREATE TABLESPACE tbsAminExam
   DATAFILE 'tbsAminExam.dbf'
   SIZE 20m;
   
  
  
  
  
CREATE TABLE book (
 BOOK_ID NUMBER(11,0) NOT NULL,
 TITLE VARCHAR(128) NOT NULL,
 AUTHOR VARCHAR(45) NOT NULL,
 PRICE FLOAT NOT NULL,
 PRIMARY KEY (BOOK_ID),
 CONSTRAINT  TITLE_UNIQUE UNIQUE (TITLE)
)TABLESPACE tbsAminExam;





 CREATE USER AdminExam
    IDENTIFIED BY 12345678
    DEFAULT TABLESPACE tbsAminExam
    QUOTA UNLIMITED ON tbsAminExam
    ACCOUNT LOCK;

SELECT 
    username, 
    default_tablespace, 
    profile, 
    authentication_type
FROM
    dba_users;
	
	

SELECT 
    username, 
    default_tablespace, 
    profile, 
    authentication_type
FROM
    dba_users
WHERE 
    account_status = 'OPEN';




GRANT CREATE SESSION TO AdminExam;




	
