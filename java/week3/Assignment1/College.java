package week3.Assignment1;

public class College {

	public void collegeName(String name) {
		System.out.println("My college name is "+name);
	}
	
	public void collegeCode(int code) {
		System.out.println("Our University code is "+code);
	}
	
     public void collegeRank(int rank) {
    	 System.out.println("My College will always in "+rank+"Place");
     }     
}

/*Package   :org.college
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