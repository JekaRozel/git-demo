
public class BMW extends Car{

	private int weight;
	
	
	public BMW(int speed, String color, int weight){
		super(speed, color);
		this.weight = weight;
	}
	
	public BMW(int speed, int weight){
		super();
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/*@Override
	public void show() {
		super.show();
		System.out.print(" " + weight);
	}*/
	
	
	
	
	/*public void show(){
		super.show();
		System.out.print(" " + weight);
	}*/
}
