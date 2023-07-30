package basics.onnumbers;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scn.nextInt();
        convertToBinary(num);
        convertToOctal(num);
        convertToHex(num);
    }

    /**
     * divide by 2 and get remainder at each iteration
     * @param num
     */
    private static void convertToBinary(int num) {
        StringBuilder bl = new StringBuilder();
        do {
            int r = num % 2;
            bl.append(r);
            num = num / 2;
        } while (num != 0);
        System.out.println(bl.reverse());
    }

    /**
     * divide by 16 and get remainder at each iteration
     * @param num
     */
    private static void convertToOctal(int num) {
        StringBuilder bl = new StringBuilder();
        do {
            int r = num % 8;
            bl.append(r);
            num = num / 8;
        } while (num != 0);
        System.out.println(bl.reverse());
    }

    private static void convertToHex(int num) {
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        StringBuilder bl = new StringBuilder();
        do {
            int r = num % 16;
           /*if (r >= 10) r = r + 55;
            else r = r + 48;
            System.out.print((char)r);*/
            bl.append(hexchars[r]);
            num = num / 16;
        } while(num != 0);
        System.out.println(bl.reverse());
    }
}
