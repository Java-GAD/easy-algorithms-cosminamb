package src.main.java.session1;

public class PrintingPatterns {


    /*
    1
    2 3
    4 5 6
    7 8 9 10
     */
    public static void printingPatternTriangle(int rows) {
        int cnt = 1;
        for (int i = 1; i <= rows; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
        }
    }

    public static void printingHexagon(int rows){

    }
}
