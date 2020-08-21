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


drop table book;


 CREATE USER AdminExam
    IDENTIFIED BY 12345678
    DEFAULT TABLESPACE tbsAminExam
    QUOTA UNLIMITED ON tbsAminExam
    ACCOUNT LOCK;

SELECT 
    username, 
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


ALTER USER AdminExam IDENTIFIED BY 12345678 ACCOUNT UNLOCK;

	
SELECT 
    username, 
    default_tablespace, 
    profile, 
    authentication_type
FROM
    dba_users
WHERE 
    account_status = 'OPEN';
    
    
    
SELECT table_name
FROM user_tables
ORDER BY table_name;


SELECT table_name
FROM all_tables
WHERE  table_name ='BOOK'
ORDER BY table_name;


SELECT *
FROM all_tables
WHERE  table_name ='BOOK'
ORDER BY table_name;


SELECT 
 OWNER,
 TABLE_NAME,
 TABLESPACE_NAME,
 CLUSTER_NAME,
 STATUS
 
FROM dba_tables
WHERE  table_name ='BOOK'
ORDER BY table_name;

SELECT  OWNER,  TABLE_NAME,  TABLESPACE_NAME,  CLUSTER_NAME,  STATUS
FROM all_tables
WHERE  table_name ='BOOK'
ORDER BY table_name;






GRANT ALL PRIVILEGES TO AdminExam;


GRANT
  CREATE
  SELECT,
  INSERT,
  UPDATE,
  DELETE
ON
  AdminExam.books
TO
  AdminExam;


	
	