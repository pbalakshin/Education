package ru.pbalakshin.educ;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        BigInteger fibPrevious, fibCurrent, fibNext;

        System.out.println("Please enter the length of required Fibonacci sequence:");

        int fibOrder = 0;
        while (fibOrder <= 0) {

            Scanner in = new Scanner(System.in);
            fibOrder = in.nextInt();
        }

        fibPrevious = new BigInteger("0");
        fibCurrent = new BigInteger("1");;

        for (int i = 1; i <= fibOrder; i++ ) {
                fibNext = fibPrevious.add(fibCurrent);
                System.out.println(i + " element = " + fibCurrent);
                fibPrevious = fibCurrent;
                fibCurrent = fibNext;
        }

    }
}
