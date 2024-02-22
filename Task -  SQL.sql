CREATE TABLE `employee_details`.`Empl` (
  `empno` INT NOT NULL,
  `ename` VARCHAR(45) NULL,
  `job` VARCHAR(45) NULL,
  `mgr` INT NULL,
  `hiredate` DATE NULL,
  `sal` DECIMAL(6,2) NULL,
  `comm` DECIMAL(6,2) NULL,
  `deptno` INT NULL,
  PRIMARY KEY (`empno`));
INSERT INTO employee_details.Empl VALUES
(8369, "SMITH", "CLERK", 8902, "1990-12-18", 800, NULL, 20),
(8499, "ANYA", "SALESMAN", 8698, "1991-02-20", 1600, 300, 30),
(8521, "SETH", "SALESMAN", 8698, "1991-02-22", 1250, 500, 30),
(8566, "MAHADEVAN", "MANAGER", 8839, "1991-04-02", 2985, NULL, 20),
(8654, "MOMIN", "SALESMAN", 8698, "1991-09-28", 1250, 1400, 30),
(8698, "BINA", "MANAGER", 8839, "1991-05-01", 2850, NULL, 30),
(8882, "SHIVANSH", "MANAGER", 8839, "1991-06-09", 2450, NULL, 10),
(8888, "SCOTT", "ANALYST", 8566, "1992-12-09", 3000, NULL, 20),
(8839, "AMIR", "PRESIDENT",null , "1991-11-18", 5000, NULL, 10),
(8844, "KULDEEP", "SALESMAN", 8698, "1991-09-08", 1500, 0, 30);
SELECT * FROM EMPLOYEE_DETAILS.EMPL;
DROP TABLE EMPLOYEE_DETAILS.EMPL;
SELECT ENAME, SAL FROM EMPLOYEE_DETAILS.EMPL
WHERE SAL>=2200
ORDER BY SAL ASC;


  


  
  
SELECT * FROM EMPLOYEE_DETAILS.EMPL
WHERE COMM=0 OR COMM IS NULL;
  
  
  
  
  
  
SELECT ENAME, SAL FROM EMPLOYEE_DETAILS.EMPL
WHERE SAL NOT BETWEEN 2500 AND 4000
ORDER BY SAL ASC; 




SELECT ENAME, JOB, SAL FROM EMPLOYEE_DETAILS.EMPL
WHERE JOB<>"MANAGER"
ORDER BY ENAME ASC;
  




SELECT ENAME FROM EMPLOYEE_DETAILS.EMPL
WHERE ENAME LIKE '__A%';




  
SELECT ENAME FROM EMPLOYEE_DETAILS.EMPL
WHERE ENAME LIKE '%T'; 

