package org.student;

import org.department.Department;

/*Assignment2:
=============
     Package   :org.college
     Class        :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Package   :org.department
     Class        :Department
     Methods   :deptName()
 
     Package   :org.student
     Class        :Student
     Methods   :studentName(),studentDept(),studentId()
  
Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.
*/

public class Student extends Department{
	public void studentName() {
		System.out.println("VANITHA");
	}
	public void studentDept() {
		System.out.println("EEE-C");
	}
	public void studentId() {
		System.out.println(132102);
	}
	public static void main(String[] args) {
		
     Student obj = new Student();
     obj.collegeName();
     obj.collegeCode();
     obj.collegeRank();
     obj.deptName();
     obj.studentName();
     obj.studentDept();
     obj.studentId();
	}

}
