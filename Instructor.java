package Assignment1;
public class Instructor {// 1.3 user define class
	// 1.2 Pre-define Class
	String type; // type of software training
	String instructor;
	double fee;
	double salary;
	double totalSalary;
	int classes;
	int num;

	// 1.4 Constructor
	public Instructor() { // constructor with no argument
		this.type = ""; // initialize type to null
		this.instructor = ""; // initialize instructor to null

		System.out.println("Please select the type of software training.");
	}

	public Instructor(String t) { // constructor with 1 argument
		this.type = t;
		this.instructor = ""; // initialize instructor to null

		System.out.println("Please select the instructor name.");
	}

	public Instructor(String t, String i,int cl, int n) { // constructor with many argument
		this.type = t;
		this.instructor = i;
		this.classes = cl;
		this.num = n;

		if (this.type.equals("Excel")) {
			fee = 600;
		} else if (this.type.equals("Adobe Photoshop")) {
			fee = 1600;
		} else if (this.type.equals("Adobe Premiere Pro")) {
			fee = 2000;
		} else
			System.out.println("Please enter a valid type of software training.");
	}
	
	public void printInfo(){//Employee information with total salary
		totalSalary = totalSalary(fee, num);
		System.out.println("____________________Employee Information____________________");
		System.out.println("Employee Name               : " + this.instructor);
		System.out.println("Type of Software Training   : " + this.type);
		System.out.println("Total number of participants: " + this.num);
		System.out.println("Total conducted classes     : " + this.classes);
		System.out.printf("Total Salary                : RM %.2f", totalSalary);
				
	}
	
	public double totalSalary(double p, int n) { // calculate total salary of employee by number of participants
		return p * 3 / 5 * n; //the employee can get 3/5 of the income of that particular type of software training
	}

}
