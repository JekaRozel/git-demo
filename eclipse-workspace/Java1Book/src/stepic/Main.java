package stepic;
import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	    	   
	           Scanner scan = new Scanner(System.in);
	           int n = scan.nextInt();
	           int [] m = new int[n];
	           for (int i=0; i < m.length; i++) {
	               m[i] = scan.nextInt();
	           }
	           int count = 0;
	           for (int i=0; i< m.length-1; i++) {
	          
	                   if (m[i]>m[i+1]){
	                       count++;
	                  
	               }
	           }
	           System.out.print(count);
	       }
	   }