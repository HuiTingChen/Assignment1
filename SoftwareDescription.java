package Assignment1;
public class SoftwareDescription {// 1.3 user define class
	// 1.2 Pre-define Class
	int type; // type of software training
	String time; // day or night time
	double fee;
	double totalFee;

	// 1.4 Constructor
	public SoftwareDescription() { // constructor with no argument
		this.type = 0; // initialize type to 0
		this.time = ""; // initialize time to null
		
		System.out.println("Please select the desire type of software training.");
	}

	public SoftwareDescription(int t) { // constructor with 1 argument
		this.type = t;
		this.time = ""; // initialize time to null
		
		System.out.println("Please select the desire time for software training.");
	}

	public SoftwareDescription(int t, String tm) { // constructor with 2 argument
		this.type = t;
		this.time = tm;
		
		System.out.println("\n___________________________Details__________________________");

		// Description for type of software training
		if (this.type == 1) {
			System.out.println("Excel");
			System.out.println("This is a 2 day training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial on how to use Excel"
					+ "\n- calculate finance report ");
			
			this.fee = 600;
			totalFee = this.fee;
			System.out.println("Conduct by               : Ahmad" );
			System.out.printf("Total Fee                : RM %.2f", totalFee);
			
		} else if (this.type == 2) {
			System.out.println("Adobe Photoshop");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing photo"
					+ "\n- designing poster");
			
			this.fee = 1600;
			totalFee = this.fee;
			System.out.println("Conduct by               : Jakson Lee");
			System.out.printf("Total Fee                : RM %.2f", totalFee);
			
		} else if (this.type == 3) {
			System.out.println("Adobe Premiere Pro");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing video"
					+ "\n- adding effects on the video");
			
			this.fee = 2000;
			totalFee = this.fee;
			System.out.println("Conduct by               : Vincen");
			System.out.printf("Total Fee                : RM %.2f", totalFee);
			
		} else if (this.type == 4) {
			//details for photoshop
			System.out.println("Adobe Photoshop");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing photo"
					+ "\n- designing poster");
			
			System.out.println("Conduct by               : Jakson Lee");
			System.out.println();
			
			//details for premiere pro
			System.out.println("Adobe Premiere Pro");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing video"
					+ "\n- adding effects on the video");
			
			System.out.println("Conduct by               : Vincen");
			
			//total fee
			System.out.println();
			this.fee = 1600 +2000;//1600 for photoshop , 2000 for premiere pro
			totalFee = this.fee -20;//join 2 classes of software training will get RM20 cash back
			System.out.printf("Total Fee                : RM %.2f", totalFee);
			
		} else if (this.type == 5) {
			//details for excel
			System.out.println("Excel");
			System.out.println("This is a 2 day training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial on how to use Excel"
					+ "\n- calculate finance report ");
			
			System.out.println("Conduct by               : Ahmad");
			System.out.println();
			
			//details for photoshop
			System.out.println("Adobe Photoshop");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing photo"
					+ "\n- designing poster");
			
			System.out.println("Conduct by               : Jakson Lee");
			System.out.println();
			
			//details for premiere pro
			System.out.println("Adobe Premiere Pro");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing video"
					+ "\n- adding effects on the video");
			
			System.out.println("Conduct by               : Vincen");
			
			//total fee
			System.out.println();
			this.fee = 600 + 1600 + 2000; //600 for excel, 1600 for photoshop , 2000 for premiere pro
			totalFee = (this.fee -30) * (1-0.05);//join 3 classes of software training will get RM30 cash back and 5% discount
			System.out.printf("Total Fee                : RM %.2f", totalFee);
			
			
		} else
			System.out.println("Please enter a valid type of software training.");
		System.out.println();

		// Description for time of software training
		if (this.time.equals("day time")) {
			System.out.println("This software training will be started from 10.00a.m.-13.00p.m.");
	
		} else if (this.time.equals("night time"))
			System.out.println("This software training will be started from 19.00p.m.-22.00p.m.");

		else
			System.out.println("Please enter a valid schedule time.");


	}
}
