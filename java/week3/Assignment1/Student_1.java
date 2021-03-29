package week3.Assignment1;

public class Student_1 {
   public void getStudentInfo(int id) {
	   System.out.println("My id is "+id);
   }
   
    public void getStudentInfo(String name) {
	   System.out.println("My name is "+name);
   }

    public void getStudentInfo(String name, int id) {
	   System.out.println("My name is "+name+ " and my id is "+id);
}
    
     public void getStudentInfo(int phonenumber, String email) {
	   System.out.println("My mail-id is "+email+" and My Phone number is "+phonenumber);
}

	public static void main(String[] args) {
		Student_1 stu=new Student_1();
		stu.getStudentInfo(123);
		stu.getStudentInfo("Santhosh");
		stu.getStudentInfo("Santhosh Kumar", 111);
	    stu.getStudentInfo(92829430, "nobro007@gmail.com");
	}
 
}
/*
Assignment4:
==============

      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
 */
