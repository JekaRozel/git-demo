
package faangSchool;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
    	String dumbledore = "Dumbledore";
    	String mcgonagall = "McGonagall";
    	String snape = "Snape";
    	String lupin = "Lupin";
    	String hugrid = "Hugrid";
    	String comma = ", ";
    	String teachers = "School teachers: ";
    	
    	System.out.println(teachers + dumbledore + comma + mcgonagall + comma + snape + comma + lupin + comma + hugrid);
    	
    	int grade1 = new Random().nextInt(10);
    	int grade2 = new Random().nextInt(10);
    	
    	System.out.println(grade1);
    	System.out.println(grade2);
    }
}