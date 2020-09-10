package byBooks;
import java.util.Scanner;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
import java.util.Random;

public class Listing {

	
	
	//	public static void main(String[] args) {
//		Random rnd = new Random(System.currentTimeMillis ());
//		int secret = 1 + rnd.nextInt(10);
//		while (true) {
//		System.out.print("Number from 1 to 10: ");
//		Scanner scr = new Scanner(System.in);
//		int num = scr.nextInt();
//		if (secret != num) {
//		System.out.print("Try again. \n");		
//		} else {
//		System.out.print("That right!!!");
//		break;
//			} 
//		}
//	} 
}
//}
//public class Listing4_2 {
//	public static void main(String[] args) {
//		int userData;
//		String userInput;
//		userInput = JOptionPane.showInputDialog(null, "Put number from 1 to 3");
//		userData = Integer.parseInt(userInput);
//		if (userData>0 & userData<4) {
//		JOptionPane.showMessageDialog(null, "Your numbe is "+userData);
//		} else {
//			JOptionPane.showMessageDialog(null, "Your number is incorrect");
//		}
//	}
//}
//
//public class Listing4_1 {
//	public static void main(String[] args) {
//		int userData;
//		String userInput;
//		userInput = JOptionPane.showInputDialog("Put number 1 - 3:");
//		userData = Integer.parseInt(userInput);
//		switch(userData){
//			case 1:
//				JOptionPane.showMessageDialog(null, "Your number is: 1.");
//				break;
//			case 2:
//				JOptionPane.showMessageDialog(null, "Your number is 2.");
//				break;
//			case 3:
//				JOptionPane.showMessageDialog(null, "Your number is 3.");
//				break;
//			default:
//				JOptionPane.showMessageDialog(null, "Your number is out of");
//			}
//		}
//	}
//	  Scanner scr = new Scanner(System.in);
//      int a = scr.nextInt();
//      int count = 0;
//      int mas [] = new int[a];
//      for (int i=0; i>mas.length; i++){
//          if (mas[a]>9)
//        	if (100>mas[a])
//        	  if (a%2==0) 
//          System.out.print(mas[a]+" ");
//          count++;
//          
//      }
////      if (count==0) {
////          System.out.println("-1");
////      }
//      scr.close();
//  }
//}

//public class Listing3_2 {
//	public static void main(String[] args) {
//		int yearNow, yearBorn, userAge;
//		String userData;
//		userData = JOptionPane.showInputDialog ("What year is now?");
//		yearNow = Integer.parseInt(userData);
//		userData = JOptionPane.showInputDialog ("What is your year?"); 
//		yearBorn = Integer.parseInt(userData);
//		userAge = yearNow - yearBorn;
//		JOptionPane.showMessageDialog(null, "Your age: "+ userAge);
//}
//}
//
//public class Listing3_1 {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		String name, surName;
//		int yearBorn, yearNow;
//		System.out.print("Your name: ");
//		name = input.nextLine();
//		System.out.print("Your shure name: ");
//		surName = input.nextLine();
//		System.out.print("What year is now?");
//		yearNow = input.nextInt();
//		System.out.print("What year was you born?");
//		yearBorn = input.nextInt();
//		System.out.println("Hello, "+name+" "+surName+"!");
//		System.out.println("Your age is: "+(yearNow-yearBorn)+".");
//		}
//}
