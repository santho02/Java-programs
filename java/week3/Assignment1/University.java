package week3.Assignment1;

public abstract class University {

	public void pg() {
		System.out.println("I am not a pg graduate");
	}
	public void ug() {
		
	}

}

/*
     AbstractClass     :University
     Methods              : pg()(implemented method), ug() (unimplemented method)

     Class        :College extends University
     Methods   :ug()

Description:
ug() is just a templete in University Abstract class and You have to implement the method ug() in College class.
Execute both ug() & pg()
 */
