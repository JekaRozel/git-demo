
public class Main {

	public static void main(String[] args) {
		
		
		
		//int a = 5, b = 3, c = 9, d = 12;
		
		int [] mas = {3423,5,437,54643,52435,32,5436,457,65,75464,325432,42};
		//int [] mas = new int[5]; // [0, 0, 0, 0, 0]
								//   0  1  2  3  4
		mas[2] = 4353;
		
		/*for(int i = 0; i < mas.length; i++){
			mas[i] = (int)(Math.random() * 11) + 5;
		}*/
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + "\t");
		}
		
		for(int i = 0; i < mas.length; i++){          // i = 1
			for(int j = i + 1; j < mas.length; j++){  // j = 2
				if(mas[i] < mas[j]){
					int temp = mas[i];
					mas[i] = mas[j];
					mas[j] = temp;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + "\t");
		}
/*		
		mas[0] > mas[1]
		mas[0] > mas[2]
		mas[0] > mas[3]
				
		mas[1] > mas[2]
		mas[1] > mas[3]*/
		/*int max = mas[0];  // 12
		for(int i = 0; i < mas.length; i++){
			if(mas[i] > max){  // mas[i] = 6
				max = mas[i];
			}
		}
		System.out.println();
		System.out.println(max);*/
		
		/*System.out.println(Math.random());  // [0; 1)
		System.out.println(Math.random());  // (max - min + 1) + min      [5, 15]
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println((int)(Math.random() * 11) + 5);
		System.out.println((int)(Math.random() * 11) + 5);
		System.out.println((int)(Math.random() * 11) + 5);
		System.out.println((int)(Math.random() * 11) + 5);
		System.out.println((int)(Math.random() * 48) - 15);    // [-15; 32]
*/		
	
/*		System.out.println((int)(Math.pow(5, 5)));
		System.out.println(Math.sqrt(3125));
		System.out.println(Math.round(3.56));*/

	}
	

}
