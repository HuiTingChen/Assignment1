package Assignment1;
public class Finance {// 1.3 user define class
	// 1.2 Pre-define Class
	String employee;
	int classes;
	double totalSalary;
	String type;
	double price;
	double income;
	double profit;
	int num; // number of participants

	// 1.4 Constructor
	public Finance() { // constructor with no argument
		this.employee = ""; // initialize employee name to null
		this.classes = 0; // initialize classes to 0

		System.out.println("Please enter the employee information.");
	}

	public Finance(String e) { // constructor with 1 argument
		this.employee = e;
		this.classes = 0; // initialize classes to 0

		System.out.println("Employee Name            : " + e);
		System.out.println("Please enter the total conducted classes of the employee.");
	}

	public Finance(String e, int cl, String t, int n) { // constructor with many argument
		this.employee = e;
		this.classes = cl;
		this.type = t;
		this.num = n;
		
		//define the price of different type of software training
		if (this.type.equals("Excel")) {
			price = 600;
		} else if (this.type.equals("Adobe Photoshop")) {
			price = 1600;
		} else if (this.type.equals("Adobe Premiere Pro")) {
			price = 2000;
		} else
			System.out.println("Please enter a valid type of software training.");
	}	
	
	public void printInfo(){
		//calculate Employee salary
		totalSalary = totalSalary(price, num);
		
		//For calculate and display income and profit of a particular type of software training
		income = totalIncome(price, num);
		profit = profit(income, totalSalary);

		System.out.println("________________Profit for " + this.type +"________________");
		System.out.printf("Total Income             : RM %.2f", income);
		System.out.printf("\nTotal Expenses           : RM %.2f", totalSalary);
		System.out.printf("\nTotal Profit             : RM %.2f", profit);
	}

	public double totalSalary(double p, int n) { // calculate total salary of employee by number of participants
		return p * 3 / 5 * n; // the employee can get 3/5 of the income of that particular type of software training
	}

	public double totalIncome(double p, int n) { // calculate total income of a particular type of software training
		return p * n;
	}

	public double profit(double income, double totalS) { //calculate profit of a particular type of software training 
		profit = income - totalS;
		return profit;
	}

}
