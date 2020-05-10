package home.prac.coding;

public class UsingStatic {
	
	 int rollno;
	 String name;
	 static String school="BSHS";
	  public UsingStatic(int roll,String name,String school) {
		  this.rollno=roll;
		  this.name=name;
		  this.school=school;
		
	}
	  public UsingStatic(int roll,String name) {
		  this.rollno=roll;
		  this.name=name;
	  }
	@Override
	public String toString() {
		return "UsingStatic [rollno=" + rollno + ", name=" + name + ", school=" + school + "]";
	}
	
	
	

}
