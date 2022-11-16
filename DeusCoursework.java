package Deus;

import java.util.*;

public class barigye {

	public static void main(String[] args) {
		String CGP;
		String Tuition paid;
		String Valid id;
		String Nationality;
		int score = 0;
		Scanner in =  new Scanner(System.in);
		
		System.out.println("Enter CGP: ");
		CGP= in.nextLine();
		
		if(CGP.equals(">=3.0")) {
			System.out.println("Second class lower", " + CGP+ " Ready for graduation.");
			score++;
		}else {
			System.out.println("failure,"..!!!! " + CGP+ "Retake");
		}
		
		System.out.println("Enter Tuition paid': ");
		Tuition paid= in.nextLine();
		if(Tuition paid.equals(">=100%")) {
			System.out.println("Allowed," + Tuition paid + " you can go for graduation '.");
			score++;
		}else {
			System.out.println("pay upto 100%'...!!!! " + Tuition paid + " visit finance office '");
		}
		
		System.out.println("Valid id': ");
		Valid id= in.nextLine();
		if(Valid id.equals("<=4years")) {
			System.out.println("permitted, " + valid id+ " success.\"");
			score++;
		}else {
			System.out.println("suspended'...!!!! " + Valid id + " Invalid id'");
		}Scanner in =  new Scanner(System.in);
		
		System.out.println("Enter Nationality: ");
		Nationality= in.nextLine();
		
		if(Nationality.equals("Ugandan")) {
			System.out.println("Free to graduate", " + Nationality+ " enjoy your uganda.");
			score++;
		}else {
			System.out.println("Pay more money,"..!!!! " + Nationality+ "Its must to pay");
		}
		
		System.out.print("Best wishes, " + CGP + "You are ready for graduation and upgrading" + score + " Thank you for your time!!");
		
		
		
		

	}

}
