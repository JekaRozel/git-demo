package arrayApp.ArrayApp;

public class LowArrayApp {
	
	public static void main(String[] args) {
		LowArray arr;
		arr = new LowArray(100);
		int nElems = 0;
		int j;
		
		arr.setElem(0, 77);
		arr.setElem(1, 99);
		arr.setElem(2, 44);
		arr.setElem(3, 55);
		arr.setElem(4, 22);
		arr.setElem(5, 88);
		arr.setElem(6, 11);
		arr.setElem(7, 00);
		arr.setElem(8, 66);
		arr.setElem(9, 33);
		nElems = 10;
		
		for (j = 0; j < nElems; j++) {
			System.out.print(arr.getElem(j) + " ");
		}
		System.out.println("");
		
		int searchKey = 21;
		for(j = 0; j < nElems; j++ ) {
			System.out.print(j + " | ");
			if(arr.getElem(j) == searchKey) {
				System.out.println(".");
				break;
			}
		}
		if( j == nElems) {
			System.out.println("Can't find " + searchKey);
			}
		else {
			System.out.println("Found " + searchKey);
		}
		
		for (j = 0; j < nElems; j++) {
			if(arr.getElem(j) == 556) {
				break;
			}
		}
		if (j == nElems) {
			System.out.println("No such element ");
		} else {
		for (int k = j; k < nElems-1; k++) {
			arr.setElem(k, arr.getElem(k+1));
		}
		nElems--;
		
		for(j=0; j<nElems; j++) {
			System.out.print(arr.getElem(j) + " ");
		}
		System.out.println("");
		}
	}
}
