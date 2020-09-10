
public class Test {
	
	public int count;
	public static Test [] mas;
	
	static {
		System.out.println("static");
		
	}
	
	public static void createMas(int n) {
		mas = new Test[n];
		for(int i = 0; i < mas.length; i++) {
			mas[i] = new Test();
			mas[i].count = (int)(Math.random() * 10) + 1;
		}
	}
	
	public static void showMas() {
		for(int i = 0; i < mas.length; i++) {
			System.out.println(mas[i].count );
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public int a;
	public String b;
	public static int c;

	public static void show() {
		System.out.println("hello");
	}
	
	*/
	
}
