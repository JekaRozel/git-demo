package first;

public class BeerSong {
	
	public static void beerBottle() {
	String word;
	int beerNum = 99;
	
	while (beerNum > 0) {
		int a = beerNum % 10;
		word = "бутылок";
		if (a == 1 && beerNum != 11) {
			word = "бутылка";
		} if ((a == 2 && beerNum != 12) || (a == 3 && beerNum != 13) || (a == 4 && beerNum != 14)) {
			word = "бутылки";
		}

		System.out.println(beerNum + " " + word + " " + " пива на стене");
		System.out.println(beerNum + " " + word + " " + " пива на стене");
		System.out.println(beerNum + " " + word + " пива");
		System.out.println("Возьми одну.");
		System.out.println("Пусти по кругу.");
		beerNum = beerNum - 1;
		if (beerNum == 0) {
			System.out.println("Нет бутылок пива на стене.");
		}
	}
	}
}
