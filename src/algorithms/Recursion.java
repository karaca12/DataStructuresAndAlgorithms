package algorithms;

public class Recursion {
    public static void recursionExample() {
        /*
        recursion = when a thing applies itself to itself
        A recursive method calls itself.

        Advantages?
        -easier to read/write
        -easier to debug

        Disadvantages?
        -sometimes slower
        -uses more memory
         */

        walk(5);
//        walk(1000000); //this will throw StackOverFlowError
        System.out.println(factorial(7));
        System.out.println(power(2, 2));


    }


    private static void walk(int steps) {
        if (steps < 1) {
            return;
        }
        System.out.println("You take a step!");
        walk(steps - 1);
    }

    private static int factorial(int num) {
        if (num < 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    private static int power(int base, int exponent) {
        if (base == 0) {
            return 0;
        } else if (base == 1 || exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        }
        return base * power(base, exponent - 1);
    }

}
