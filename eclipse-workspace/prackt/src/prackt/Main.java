package prackt;

public class Main {

    public static void main(String[] args) {
        int x11 = 1;
        int y11 = 6;
        int x22 = 5;
        int y22 = 2;
        int x1 = 0;
        int y1 = 0;
        boolean answ = false;
        boolean c = false;
        if (x11 == x22 || y11 == y22) {
           answ = true;
        } 
        if (!c) {
        for (x1 = x11, y1 = y11; x1 >= 1 && x1 <= 8 && y1 >= 1 && y1 <= 8; y1++, x1++) {
            System.out.println(x1 + " | " + y1);
        	if (x1 == x22 && y1 == y22) {
                answ = true;
                c = true;
            }
        }
        System.out.println();
        for (x1 = x11, y1 = y11; x1 >= 1 && x1 <= 8 && y1 >= 1 && y1 <= 8; y1--, x1++) {
        	System.out.println(x1 + " | " + y1);
        	if (x1 == x22 && y1 == y22) {
                answ = true;
                c = true;
            }
        }
        System.out.println();
        for (x1 = x11, y1 = y11; x1 >= 1 && x1 <= 8 && y1 >= 1 && y1 <= 8; y1++, x1--) {
        	System.out.println(x1 + " | " + y1);
        	if (x1 == x22 && y1 == y22) {
                answ = true;
                c = true;
            }
        }
        System.out.println();
        for (x1 = x11, y1 = y11; x1 >= 1 && x1 <= 8 && y1 >= 1 && y1 <= 8; y1--, x1--) {
        	System.out.println(x1 + " | " + y1);
        	if (x1 == x22 && y1 == y22) {
                answ = true;
                c = true;
            }
        } 
        c = true;
        }
        if (answ == true) {
            System.out.println("YES");
        } else {
            System.out.print("NO");
        }
    }
}