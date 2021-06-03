package Assignment1;
import java.util.Scanner;

public class Registration { // 1.3 user define class
	// 1.2 Pre-define Class
	Scanner s = new Scanner(System.in);
	String name;
	String contactNo;
	String email;
	int type;
	String time;
	String date;

	// 1.4 Constructor
	public Registration() { // constructor with no argument
		this.name = ""; // initialize name to null
		this.contactNo = ""; // initialize contactNo to null

		System.out.println("Please enter your personal information.");
	}

	public Registration(String n) { // constructor with 1 argument
		this.name = n;
		this.contactNo = ""; // initialize contactNo to null

		System.out.println("Name                     : " + n);
		System.out.println("Please complete your personal information.");

	}

	public Registration(String n, String contact, String email) { // constructor with 3 argument
		this.name = n;
		this.contactNo = contact;
		this.email = email;

		System.out.println("\n________________________Registration________________________");
		System.out.println("Name                            : " + n);
		
		// input the type of software, time and date by using scanner
		System.out.print("Enter Type of Package           : ");
		this.type = s.nextInt();
		System.out.print("Enter Time (day/night time)     : ");
		s.nextLine();
		this.time = s.nextLine();
		System.out.print("Enter Date to start the training: ");
		this.date = s.nextLine();
	}

	public void printInfo() {
		// display the customer information and software training information
		System.out.println("\n____________________Customer Information____________________");
		System.out.println("Name                      : " + this.name);
		System.out.println("Contact Number            : " + this.contactNo);
		System.out.println("Email Address             : " + this.email);
		
		if (this.type == 1)
			System.out.println("Type of Software Training : Excel" );
		else if (this.type == 2)
			System.out.println("Type of Software Training : Adobe Photoshop" );
		else if (this.type == 3)
			System.out.println("Type of Software Training : Adobe Premiere Pro" );
		else if (this.type == 4)
			System.out.println("Type of Software Training : Adobe Photoshop & Adobe Premiere Pro" );
		else if (this.type == 5)
			System.out.println("Type of Software Training : Excel & Adobe Photoshop & Adobe Premiere Pro" );
		else
			System.out.println("Please enter a valid number.");
		
		System.out.println("Time (day/night time)     : " + this.time);
		System.out.println("Date to start the training: " + this.date);

	}
}
