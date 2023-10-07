package src.main.java.session1;

public class FizzBuzz {

    public static void fizzBuzz(int n) {
        if (n < 0) {
            System.out.println("error");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.println(i + ": FizzBuzz");
                } else {
                    System.out.println(i + ": Buzz");
                }
            } else {
                if (i % 3 == 0) {
                    System.out.println(i + ": Fizz");
                }
            }
        }
    }
}
