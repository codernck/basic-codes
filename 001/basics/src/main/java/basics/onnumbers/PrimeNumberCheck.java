package basics.onnumbers;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scn.nextInt();
        if (checkPrime03(num)) {
            System.out.println(num+" is Prime");
        } else {
            System.out.println(num+" is Not Prime");
        }
    }

    /**
     * Divide the number with numbers in range of 2 to n-1 in loop
     * if remainder is zero it's not prime
     * else its prime
     */
    private static boolean checkPrime01(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    /**
     * Divide the number with numbers in range of 2 to n-1 in loop
     * if remainder is zero it's not prime
     * else its prime
     */
    private static boolean checkPrime02(int num) {
        for (int i = 2; i <= Math.sqrt(num); /* i * i <= num; */ i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    /**
     * Using Seive of Erathosthenes
     * we make array of all numbers ranging from 0 to number
     * initially we assume each number is prime
     * we strike of numbers which are multiples of prime
     * ex: 4,6,8(multiples of 2) than 9,12,15(multiples of 3) and so on
     * last remaining numbers are prime numbers
     * @param num
     * @return
     */
    private static boolean checkPrime03(int num) {
        boolean table[] = new boolean[num + 1];
        Arrays.fill(table, true); // fill entire array with true
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (table[i]) {
                for (int j = 2 * i; j <= num; j = j+i) {
                    table[j] = false;
                }
            }
        }

        // print all statuses
        /*for (int i =2; i <= num; i++) {
            System.out.println(i+""+table[i]);
        }*/
        //final check
        if(table[num] == true) return true;
        else return false;
    }
}
