package com.jspiders.factory.main;



import java.util.Scanner;

import com.jspiders.factory.Mobile.Mobile;
import com.jspiders.factory.object.Nothing1;
import com.jspiders.factory.object.OnePlus11;
import com.jspiders.factory.object.Pixel8;
import com.jspiders.factory.object.SamsungS22;

public class Mobilefactory {

	static Mobile mobile;
	
	public static void main(String[] args) {
		try {
			factory().order();
			
		} catch (NullPointerException e) {
			System.out.println("select a Valid product");
		}
		
		
	}
	

		private static  Mobile factory() {
			
			System.out.println("==Products==");
			System.out.println("1.SamsungS22\n"
					+"2.OnePlus11\n"
					+"3.Pixel8\n"
					+"4.Nothing");
			
			Scanner scanner=  new Scanner(System.in);
			int choice=scanner.nextInt();
			
			
			scanner.close();
			
			switch (choice) {
			case 1:
				mobile=new SamsungS22();
				return mobile;

			case 2:
				mobile=new OnePlus11();
				return mobile;
			case 3:
				mobile=new Pixel8();
				return mobile;
			case 4:
				mobile=new Nothing1();
				return mobile;
			default:
				System.out.println("Invalid option");
				return mobile;
			}
		
	}

}
