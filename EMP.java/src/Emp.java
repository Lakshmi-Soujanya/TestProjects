import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Emp {
	
	/*
	Emp(){
		
		System.out.println("Object created");
	}
	*/
	String ename;
	int sal;
	String Dob;
	public void getdetails(){
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try{
		//int c=1/0; for getting catch to be executed
		System.out.println("Enter employee name");
		ename=br.readLine();
		System.out.println("Enter Employee salary");
		sal=Integer.parseInt(br.readLine());
		//difference between above and below line
		//sal=br.read();
		System.out.println("enter Employee DOB");
		Dob=br.readLine();
	}
	catch(Exception ex){
		System.out.println("Exception caused");
	}
	System.out.println("Emp name :"+ename);
	System.out.println("Salary  :"+sal);
	System.out.println("DOB      :"+Dob);		
	}
	public static void main(String[] args) {
Emp e=new Emp();
e.getdetails();// if we put this as comment output text is blinking and not asking for the data.it is not showing any error either compile time or runtime.
	
	}

}
