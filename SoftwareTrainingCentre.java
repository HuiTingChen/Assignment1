package Assignment1;

public class SoftwareTrainingCentre { // 1.3 user define class
	// 1.2 Pre-define Class
	String companyName;
	int numtype; //number of type of software training that are available
	String companyContactNo;
	
	// 1.4 Constructor
	public SoftwareTrainingCentre() {// constructor with no argument
		companyName = ""; //initialize companyName to null
		numtype = 0; //initialize numtype to 0
	}
	
	public SoftwareTrainingCentre(String cn) {// constructor with 1 argument
		companyName = cn;
		numtype = 0;//initialize numtype to 0
		
		System.out.println("__________Welcome to " + cn + "__________");
		System.out.println("Please enter the number of type of software training that are available.");
	}
	
	public SoftwareTrainingCentre(String cn,int num,String Cmpcont) {// constructor with many argument
		companyName = cn;
		numtype = num;
		companyContactNo = Cmpcont;

		System.out.println("__________Welcome to " + cn + "__________");
		System.out.println("Company Contact Number: " + Cmpcont);
		System.out.println("There are " + num + " types of Software Training available at this moment.");
	}

	public void printInfo() {
		System.out.println("Select one of the packages:" + 
						   "\n1 - Excel" +
						   "\n2 - Adobe Photoshop" +
						   "\n3 - Adobe Premiere Pro" +
						   "\n4 - Adobe Photoshop & Premiere Pro" +
						   "\n5 - All 3 types "); 
		
	}
}
