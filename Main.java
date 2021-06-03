package Assignment1;
public class Main {

	public static void main(String[] args) {
		SoftwareTrainingCentre st = new SoftwareTrainingCentre("Chen Software Training Centre", 3, "04-5986302");
		st.printInfo(); // display packages
		System.out.println();
		
		Marketing mar = new Marketing("https://www.facebook.com","https://www.instagram.com",5);
		Registration regis = new Registration("Ali", "017-2368643","ali123@gmail.com");
		regis.printInfo();//display registration information
		
		SoftwareDescription descrip = new SoftwareDescription(3, "day time");
		System.out.println();
		
		Instructor ins = new Instructor("Adobe Premiere Pro", "Vincen",4,45);
		ins.printInfo();//display employee information

		System.out.println();
		System.out.println();
		Finance fin = new Finance("Vincen", 4, "Adobe Premiere Pro", 45);
		fin.printInfo();//display income,expenses,profit
	}
}
