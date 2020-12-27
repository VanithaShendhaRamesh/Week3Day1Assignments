package org.system;
/*Assignment4:
==============
Method OverLoading
      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/
public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id only");
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("id and name");
	}
	public void getStudentInfo(String email, Long phoneNumber) {
		System.out.println("email and phonenumber");
	}
	public static void main(String[] args) {
		
		Students obj=new Students();
		obj.getStudentInfo(132102);
		obj.getStudentInfo(123102, "vanitha");
		obj.getStudentInfo("vanitha@gmail.com" , 9837532332L);
	}

}
