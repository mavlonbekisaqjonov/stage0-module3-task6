package lang.print.gaps.task6;

public class PrePostIncrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 12;
        int d = 15;

        // Use post-increment operator on a and c
        int x = ++a + b + c++ + d;
        System.out.println("Expected x is 40, x = " + x);

        // Print the updated values of a, b, c, and d
        System.out.println("The updated value of a = " + a + ", b = " + b + ", c = " + c + " and d = " + d);

    }
}
