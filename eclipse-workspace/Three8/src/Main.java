
public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.speed = 60;
		car.color = "black";
		
		car.show();
		
		System.out.println();
		BMW bmw = new BMW(45, 435);
		bmw.color = "white";
		bmw.speed = 160;
		bmw.setWeight(2000);
		
		bmw.show();

	}
	
	

}
