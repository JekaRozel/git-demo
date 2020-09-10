import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		MobilePhone samsung = new MobilePhone();//объект 1
		samsung.cost = 320;
		samsung.model = "s9";
		samsung.weight = 15;
		
		MobilePhone iPhone = new MobilePhone();//объект 2
		iPhone.cost = 555;
		iPhone.model = "9s";
		iPhone.weight = 5;
		
		samsung.show();
		iPhone.show();
		
		
		int res = iPhone.costPhone2(10);
		
		System.out.println(res + " тут результат");
		
		
		MobilePhone lg = samsung.copy2();
		
		MobilePhone nokia = iPhone.copy2();
		
		
		
		
		
		
		
		
		
		
		
		/*samsung.copy(iPhone);
		
		samsung.show();
		iPhone.show();*/
		
		
		
		
		
		
		
	/*	samsung.costPhone(23);
		iPhone.costPhone(3);
		
		
		samsung.sum(43534, 54656856, "Это сумма");*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	System.out.println(iPhone.cost + " " + iPhone.model + " " + iPhone.weight);
		
		MobilePhone lg = samsung;
		
		samsung = null;
		lg = null;
		
		samsung = new MobilePhone();*/


		
		
	}

}
