
public class Test {
	
	
	public static void meth(int n) throws Exception, ArithmeticException{
		try {
			System.out.println(56 / n);
		}finally {
			System.out.println("gggggggggggggggggggggggggggggggg");
		}
	}
	
	
	
	
	
	
	
	
	/*public static void meth(int n) {
		try {
			System.out.println(56 / n);
		}catch(ArithmeticException e) {
			System.out.println("������� �� ����");
			throw new ArithmeticException();
		}
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
/*	public static void meth(int n) {
		try {
			System.out.println(56 / n);
			int [] mas = new int[1];
			System.out.println(mas[5]);
		}catch(ArithmeticException e) {
			System.out.println("������� �� ���� 1");
			meth(n + 1);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����� �� ������� �������");
		}catch(Throwable e) {
			System.out.println("Throwable");
		}
		
	}*/
	
	//Throwable
	//Exception   Error
	
	

}
