
public /*final*/ class Car {
	
	public int speed;
	public String color;
	public static final int MAX = 333;
	
	public Car(int speed, String color){
		this.speed = speed;
		this.color = color;
	}
	
	public Car(int speed){
		this.speed = speed;
	}
	
	public Car(){
	}
	
	public void show(){
		System.out.print(speed + " " + color);
	}
	
	public final void test(){
		
	}

}
