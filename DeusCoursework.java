package Deus;

import java.util.*;

public class DeusCoursework {

	public static void main(String[] args) {
		String name;
		String dadName;
		String momName;
		int score = 0;
		Scanner in =  new Scanner(System.in);
		
		System.out.println("Enter you name: ");
		name = in.nextLine();
		
		if(name.equals("Devis")) {
			System.out.println("Thats right, " + name + " is your name.");
			score++;
		}else {
			System.out.println("It'sa lie...!!!! " + name + " is not your name");
		}
		
		System.out.println("Enter your father's name: ");
		dadName = in.nextLine();
		if(dadName.equals("Deus")) {
			System.out.println("Thats right, " + dadName + " is your father's name.");
			score++;
		}else {
			System.out.println("It'sa lie...!!!! " + dadName + " is not your father's name");
		}
		
		System.out.println("Enter your mother's name: ");
		momName = in.nextLine();
		if(momName.equals("Stidia")) {
			System.out.println("Thats right, " + momName + " is your mother's name.\"");
			score++;
		}else {
			System.out.println("It's a lie...!!!! " + momName + " is not your mother's name");
		}
		
		System.out.print("success, " + name + "you have succed all " + score + " aaquestions right!!");
		
		
		
		

	}

}
