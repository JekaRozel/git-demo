
public class MobilePhone {
	
	public int cost; //поле класса
	public String model;
	public int weight;
	

	public void show() {
		System.out.println(cost + " " + model + " " + weight);
	}
	
	public void costPhone(int n) {
		System.out.println(n * cost);
	}
	
	public int costPhone2(int n) {
		int result = n * cost;
		return result;
	}
	
	public void sum(int a, int b, String s) {
		System.out.print(a + b + "\t");
		System.out.println(s);
	}
	
	public void copy(MobilePhone ob) {
		ob.cost = this.cost;
		ob.model = this.model;
		ob.weight = this.weight;
	}
	
	public MobilePhone copy2() {
		MobilePhone ob = new MobilePhone();
		ob.cost = this.cost;
		ob.model = this.model;
		ob.weight = this.weight;
		return ob;
	}
}
