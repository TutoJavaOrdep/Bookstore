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




--Inicio creacion de tablas
CREATE TABLE usuarios (
 BOOK_ID NUMBER(11,0) NOT NULL,
 TITLE VARCHAR(128) NOT NULL,
 AUTHOR VARCHAR(45) NOT NULL,
 PRICE FLOAT NOT NULL,
 PRIMARY KEY (BOOK_ID),
 CONSTRAINT  TITLE_UNIQUE UNIQUE (TITLE)
)TABLESPACE tbsAminExam;



--Inicio creacion de tablas

--tema
CREATE TABLE tema (
 tema_id NUMBER(10,0) NOT NULL,
 tema VARCHAR(50),
 PRIMARY KEY (tema_id)
)TABLESPACE tbsAminExam;

--pregunta
CREATE TABLE preguntas (
 pregunta_id NUMBER(10,0) NOT NULL,
 preguta VARCHAR(50),
 tema_id NUMBER(10,0) NOT NULL
)TABLESPACE tbsAminExam;

--respuesta
CREATE TABLE respuestas (
 respuesta_id NUMBER(10,0) NOT NULL,
 respuesta VARCHAR(50)
)TABLESPACE tbsAminExam;


--cuestionario
CREATE TABLE cuestionario (
 cuestionario_id NUMBER(10,0) NOT NULL,
 tema_id NUMBER(10,0) NOT NULL,
 pregunta_id NUMBER(10,0) NOT NULL,
 respuesta_id NUMBER(10,0) NOT NULL,
 status NUMBER(10,0),
 PRIMARY KEY (cuestionario_id),
 CONSTRAINT  cues_tema_preg_resp_UNIQUE UNIQUE (tema_id,pregunta_id,respuesta_id) 
)TABLESPACE tbsAminExam;









--examen
CREATE TABLE examen (
 examen_id NUMBER(10,0) NOT NULL, 
 usuario_id NUMBER(10,0),
 status NUMBER(10,0),
 PRIMARY KEY (examen_id)
)TABLESPACE TBSAMINEXAM;



--rel_examenes_usuario
CREATE TABLE rel_cues_exam (
 rel_cues_exam_id NUMBER(10,0) NOT NULL, 
 cuestionario_id NUMBER(10,0) NOT NULL,
 examen_id NUMBER(10,0) NOT NULL,
 PRIMARY KEY (rel_cues_exam_id)
)TABLESPACE TBSAMINEXAM;




--rollback
drop table tema;
drop table preguntas;
drop table respuestas;
drop table cuestionario;
drop table rel_cues_exam;









--Fin creacion de tablas
















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



CREATE SEQUENCE id_seq_BOOK
    INCREMENT BY 1
    START WITH 1;
    
    
    
	
	