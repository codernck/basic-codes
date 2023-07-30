package basics.onnumbers;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int num = scn.nextInt();
        checkEven06(num);
    }

    /**
     * Check if number is divisible by two
     * @param num
     */
    private static void checkEven01(int num) {
        if (num % 2 == 0) {
            System.out.println(num+" is even");
        } else {
            System.out.println(num+" is odd");
        }
    }

    /**
     * Check if number is divisible by two short-circuit operator
     * @param num
     */
    private static void checkEven02(int num) {
        String res = "";
        res = (num % 2 == 0)?"even":"odd";

        System.out.println(num+" is "+res);
    }

    /**
     * Using bitwise-OR
     * if even number than number increases by one
     * if odd number than number remains same
     * @param num
     */
    private static void checkEven03(int num) {
        String res = (num | 1) > num? "even":"odd";
        System.out.println(num +" is "+res);
    }


    /**
     * Using bitwise-AND
     * if even number than result is zer0
     * if odd number than result is one
     * @param num
     */
    private static void checkEven04(int num) {
        String res = (num & 1) == 0? "even":"odd";
        System.out.println(num +" is "+res);
    }


    /**
     * Using bitwise-XOR
     * if even number than number is increased by one
     * if odd number than number is decreased by one
     * @param num
     */
    private static void checkEven05(int num) {
        String res = (num ^ 1) == num + 1? "even":"odd";
        System.out.println(num +" is "+res);
    }

    /**
     * Convert to binary
     * LSB - Least significant bit(last right digit)
     * if even number than results LSB is zero
     * if odd number than results LSB is one
     * @param num
     */
    private static void checkEven06(int num) {
        String res = Integer.toBinaryString(num).endsWith("0")?"even":"odd";
        System.out.println(num +" is "+res);
    }

}
