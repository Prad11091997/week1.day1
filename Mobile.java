package week1.day1;

public class Mobile {
	long mobNum = 9884837253L;


//sendMsg, makeCall, saveContact
public void sendMsg() {
	String message = "Ashwin";
			System.out.println("Hi Ashwin");
}
private long makeCall() {
	long number = 8680820891L;
	return number;
}
public long saveContact() {
	long num = 6383206692L;
	return num;
	
}
public static void main(String args[]) {
	Mobile obj = new Mobile();
	obj.sendMsg();
	long num1 = obj.makeCall();
	System.out.println("Please talk to our dean for further information regarding the course "+num1);
	long num2 = obj.saveContact();
	System.out.println("and kindly save my friend Raghu's contact number "+num2);

	
	
}

}




