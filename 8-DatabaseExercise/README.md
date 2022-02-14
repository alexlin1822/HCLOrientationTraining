# HCL Orientation Training

## 8-DatabaseExercise  
    JDBC exercise  


## Testing DATA  

1 - INSERT  
    RECORD DATA:  
    Kelly  
    2000-01-01  
    54321.0  
    22  

2- SELECT ALL  
    No testing data need.  

3 - SELECT  
    CONDITION: Salary>50000 and EmpName like 'B%' and age>24  

4 - UPDATE  
    VALUE: Salary=12345  
    CONDITION: Salary>40000  

5 - DELETE  
    CONDITION: EmpID>3  


## Description  

Java programs should be like as a Menu Driven Programs ,maven based use My SQL database.  
  
In the Employee table empId field should be incremented automatically  
  
Write a Employee Management application to do the given below operations. Assume Employee has attributes as EmpID,EmpName,DOB,Salary,Age  
1.To Insert the record in Employee DB input through command line arguments.  
2.To retrieve all the Employee information.  
3.To retrieve any employee record input given through command line arguments.  
4.To update any particular employee record  input given through command line arguments.  
5.To delete any particular employee record  input given through command line arguments.  
6.Lets say you retrieve all the employee information then you need to filter the records by the condition sal>5000 and employee name starts with B and age >21  
  
after implementation of these menus driven program, you can further improve the program with the help of stream ,lambda expression and functional interface.  
  
Use maven project, proper java coding convention ,exception handling wherever you feel you can use Java 8 also.  
  
### Log4j and Junit  
  
1.Implement the Log4j features use the the FIleAppender ,Pattern Layout create a log file and capture all the suitable required information in the log file  
  
2.For the Different CRUD methods ,you have to write separate JUNIT test cases for all the methods implemented in the JDBC ,use the related assertions conditions for this.  
  