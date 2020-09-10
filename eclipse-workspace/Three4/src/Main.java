
public class Main {

	public static void main(String[] args) {
		
		int [][] mas = new int[5][];
		mas[0] = new int[7];
		mas[1] = new int[2];
		mas[2] = new int[8];
		mas[3] = new int[4];
		mas[4] = new int[12];
		
		for(int i = 0; i < mas.length; i++) {  // i = 0
			for(int j = 0; j < mas[i].length; j++) {  // j = 2
				mas[i][j] = (int)(Math.random() * 100) + 1;    // [1;10]    (max - min + 1) + min
 			}
		}
		
		for(int i = 0; i < 5; i++) {  
			for(int j = 0; j < mas[i].length; j++) { 
				System.out.print(mas[i][j] + "\t");
 			}
			System.out.println();
		}
		
		
		
		
		int [] array = {3453,534,53446,3457,567,56,856,756745};
		
		int[][] array2 = {{34534,534,5345},{234234,234,23},{23432423,423,423}};
		
		
		
		
		
		/*int [][] mas = new int[5][5];
		
		for(int i = 0; i < mas.length; i++) {  // i = 0
			for(int j = 0; j < mas[i].length; j++) {  // j = 2
				mas[i][j] = (int)(Math.random() * 100) + 1;    // [1;10]    (max - min + 1) + min
 			}
		}

		
		for(int i = 0; i < mas.length; i++) {  
			for(int j = 0; j < mas[i].length; j++) { 
				System.out.print(mas[i][j] + "\t");
 			}
			System.out.println();
		}
		
		int max = mas[0][0];
		for(int i = 0; i < mas.length; i++) {  
			for(int j = 0; j < mas[i].length; j++) { 
				if(max < mas[i][j]) {
					max = mas[i][j];
				}
 			}
		}
		System.out.println(max);
		
		for(int i = 0; i < mas.length; i++) {   // i = 0
			for(int j = 0; j < mas[i].length; j++) { // j = 0
				for(int k = j + 1; k < mas[i].length; k++) { // k = 2
					if(mas[i][j] > mas[i][k]) {
						int temp = mas[i][j];
						mas[i][j] = mas[i][k];
						mas[i][k] = temp;
					}
	 			}
 			}
		}
		
		for(int i = 0; i < mas.length; i++) {  
			for(int j = 0; j < mas[i].length; j++) { 
				System.out.print(mas[i][j] + "\t");
 			}
			System.out.println();
		}*/
	}

}
