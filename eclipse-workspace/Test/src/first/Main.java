package first;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenth = scanner.nextInt();
        int[] mas = new int[lenth];
        mas[0] = 0;
        for (int i = 1; i < lenth; i++) {
            mas[i] = scanner.nextInt();
            System.out.println(mas[i] + " ");
        } 
        mas[0] = scanner.nextInt();
        for (int i : mas) {
        	System.out.print(i + " | ");
        }
        // TODO Auto-generated method stub
//		System.out.println("Hello!");
//		String a = "abcdefghijklmnopqrstwxyz";
//		String b = new String("abcdefghijklmnopqrstwxyz");
//		System.out.println(a==b);
//		b = b.intern();
//		System.out.println(a==b);
//		System.out.println(a.hashCode());
//		System.out.println(a.indexOf('c'));
//		System.out.println(a.substring(4,6));
//		BeerSong.beerBottle();
//		Shuffle1.shuf();
//int a = 12;
//System.out.println(a%100);
//System.out.println((a%100)/10);	
	}

}
