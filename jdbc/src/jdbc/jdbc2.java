package jdbc;
import java.util.Scanner;
public class jdbc2 {
	private int STUD_ID;
	private String STUD_NAME;
	private int STUD_ROLLNO;
	private String STUD_ADDRESS;
	
	

	public int getSTUD_ID() {
		return STUD_ID;
	}



	public void setSTUD_ID(int sTUD_ID) {
		STUD_ID = sTUD_ID;
	}



	public String getSTUD_NAME() {
		return STUD_NAME;
	}



	public void setSTUD_NAME(String sTUD_NAME) {
		STUD_NAME = sTUD_NAME;
	}



	public int getSTUD_ROLLNO() {
		return STUD_ROLLNO;
	}



	public void setSTUD_ROLLNO(int sTUD_ROLLNO) {
		STUD_ROLLNO = sTUD_ROLLNO;
	}



	public String getSTUD_ADDRESS() {
		return STUD_ADDRESS;
	}



	public void setSTUD_ADDRESS(String sTUD_ADDRESS) {
		STUD_ADDRESS = sTUD_ADDRESS;
	}



	public static void main(String[] args) {
		try(Scanner scan=new Scanner(System.in);)
		{
			boolean isrunning=true;
			while(isrunning) {
				
			System.out.println("Enter Choice:");
			System.out.println("Insert");
			System.out.println("select all");
			System.out.println("select employee by an id");
			System.out.println("Delete student");
			System.out.println("update student");
			System.out.println("Exit");
			
			int choice=Integer.parseInt(scan.nextLine());
			
			int key = 0;
			switch(choice)
			{
			case 1:
				System.out.println(choice);
				break;
			case 2:
				System.out.println(choice);
				break;
			case 3:
				System.out.println(choice);
				break;
			case 4:
				System.out.println(choice);
				break;
			case 5:
				System.out.println(choice);
				break;
			case 6:
				isrunning=false;
				break;
			default:
				break;
					
			
			}}
		}
		

	}

}
