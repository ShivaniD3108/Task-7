package com.java.task7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Employee{
	int empcode;
	String empname;
	int empage;
	int esalary;
	public Employee(int empcode, String empname, int empage, int esalary) {
		super();
		this.empcode = empcode;
		this.empname = empname;
		this.empage = empage;
		this.esalary = esalary;
	}
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
}
	public class insertQuery {
	static final String URL="jdbc:mysql://localhost:3306/emp";
	static final String USER="root";
	static final String PASSWORD="Shiv3108*";
	
public static void main(String []args) {
	List<Employee> employee=new ArrayList<Employee>();
	employee.add(new Employee(101,"Jenny",25,10000));
	employee.add(new Employee(102,"Jacky",30,20000));
	employee.add(new Employee(103,"Joe",20,40000));
	employee.add(new Employee(104,"John",40,80000));
	employee.add(new Employee(105,"Shameer",25,90000));

	String QUERY="INSERT INTO emp"+"(empcode,empname,empage,esalary) VALUES"+"(?,?,?,?)";
	//Step 1:Importing Driver 
		try {
			//Class-static class;forName-method in Class static class
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		/*Step 2:Establishing connection using connection interface(As Interface could not be instantiated DriverManager class is used)
		DriverManager is a class in Connection Interface which contains the getConnection method
		The 3 parameters cannot be frequently passed while connecting the DB so it is passed using static Connection*/
	try(Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
			//Exception thrown to handle getConnection
			PreparedStatement pst=con.prepareStatement(QUERY)){
			for(Iterator<Employee> iterator=employee.iterator();iterator.hasNext();) {
				Employee emp=(Employee) iterator.next();
				pst.setInt(1,emp.getEmpcode());
				pst.setString(2,emp.getEmpname());
				pst.setInt(3, emp.getEmpage());
				pst.setFloat(4, emp.getEsalary());
				pst.addBatch();
			}
			int[] update=pst.executeBatch();
			System.out.println(Arrays.toString(update));
			}catch(SQLException e) {
			System.out.println(e.getMessage());
			}
}
}