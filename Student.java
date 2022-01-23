package week1.day1;

public class Student {

	int rollNo = 206;
	
	public void college() {
		String clgName = "REC";
		System.out.println("I have done my UG in "+clgName);
	}
		
	private int getLockerPin() {
		int pin = 1234;
		return pin;
		
	}
	
	
	public static void main (String args[]) {
		Student obj = new Student();
		obj.college();
		System.out.println("My Roll No is "+obj.rollNo);
		int Pin = obj.getLockerPin();
		System.out.println(Pin);
		
	
		
	}
}
	
	

