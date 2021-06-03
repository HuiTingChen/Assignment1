package Assignment1;

public class Marketing {// 1.3 user define class
	// 1.2 Pre-define Class
	String instagram;
	String facebook;
	double discount;
	
	// 1.4 Constructor
	public Marketing() {// constructor with no argument
		this.instagram = ""; //initialize instagram to null
		this.facebook = ""; //initialize facebook to null
	}
	
	public Marketing(String insta) {// constructor with 1 argument
		this.instagram = insta;
		this.facebook = "";//initialize facebook to null
		
		System.out.println("*For more information and reference please visit \n -" + insta );
	}
	
	public Marketing(String insta,String fb,double dis) {// constructor with 2 argument
		this.instagram = insta;
		this.facebook = fb;
		this.discount = dis;
		
		System.out.println("You will get " + dis + "% discount if you join all 3 of the software training.");
		System.out.println("*For more information and reference please visit \n -" + insta + "\n -" + fb);
	}
}


