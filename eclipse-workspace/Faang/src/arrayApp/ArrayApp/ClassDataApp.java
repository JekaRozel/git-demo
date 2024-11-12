package arrayApp.ArrayApp;

public class ClassDataApp {
	public static void main(String[] args) {
		int maxSize = 100;
		ClassDataArray arr;
		arr = new ClassDataArray(maxSize);
		arr.insert("One1", "ONE", 241);
		arr.insert("One2", "ONE", 242);
		arr.insert("One3", "ONE", 243);
		arr.insert("One4", "ONE", 244);
		arr.insert("One5", "ONE", 245);
		arr.insert("One6", "ONE", 246);
		arr.insert("One7", "ONE", 247);
		arr.insert("One8", "ONE", 248);
		
		arr.displayA();
		
		String searchKey = "One6";
		Person found;
		found = arr.find(searchKey);
		if (found != null) {
			System.out.println("Found ");
			found.displayPerson();
		} else {
			System.out.println("Can't find " + searchKey);
		}
		
		System.out.println();
		System.out.println("Deleting One3, One6 and One8");
		arr.delete("One3");
		arr.delete("One6");
		arr.delete("One8");
		
		arr.displayA();
	}
}
