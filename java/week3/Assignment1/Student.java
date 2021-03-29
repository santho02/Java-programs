package week3.Assignment1;

public class Student extends Department {
	public void studentName(String stuName) {
		System.out.println("My name is "+stuName);
	}
	
public void studentDept(String stuDept) {
		System.out.println("I am in "+stuDept);
	}

public void studentId(int myId) {
	System.out.println("My id is "+myId);
}
	
	public static void main(String[] args) {
    Student stu=new Student();
    stu.collegeCode(123);
    stu.collegeName("SRM");
    stu.collegeRank(1);
    stu.deptName("IT");
    stu.studentName("Santhosh");
    stu.studentId(10);
    stu.studentDept("Information Technology");
	}
}

/*
Package   :org.student
Class        :Student
Methods   :studentName(),studentDept(),studentId()   
*/