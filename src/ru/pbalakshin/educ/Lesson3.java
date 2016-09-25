package ru.pbalakshin.educ;

import java.util.Scanner;

/**
 * Created by pbalakshin on 9/21/2016.
 * <p>
 * Task 1.
 * 1.1 Take a look on java.util.Scanner class. Make sure you read examples of it's use and what method next() does.
 * 1.2 Scanner's constructor uses objects that implements Readable interface.
 * Please read very short documentation for this Interface and it's only method 'read'.
 * 1.3 Make your own class (or just take Dog) so that we can pass it as argument.
 * 1.4 When calling method 'next' for Scanner object created using constructor with Dog argument it should return Dog's legs like these:
 * "front-left", "front-right", "hind-right", "hind-left" (order doesn't matter).
 * <p>
 * Task 2.
 * 2.1 Create interface U with three methods.
 * 2.2 Create class A with method which returns U by creating anonymous inner class.
 * 2.3 Create class B which has array of U. It also has SaveU method which takes and save link U in the array.
 * ResetU method reset link in the array on position specified by argument.
 * InvokeAll method goes through the array and invokes all U's methods.
 * 2.4 In main create several A objects and one B object. Populate B object with U links what were created by A objects.
 * Delete few U links from B. Call InvokeAll.
 * <p>
 * <p>
 * Make sure to follow naming convensions. Here is the reference:
 * http://www.oracle.com/technetwork/java/codeconventions-150003.pdf
 */
public class Lesson3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new Dog());

        System.out.println("Part 1:");

        /*
        String firstLeg = sc.next();
        String secondLeg = sc.next();
        String thirdLeg = sc.next();
        String forthLeg = sc.next();

        System.out.println("First leg is " + firstLeg);
        System.out.println("Second leg is " + secondLeg);
        System.out.println("Third leg is " + thirdLeg);
        System.out.println("Forth leg is " + forthLeg);
        */

        while (sc.hasNext()) {
            System.out.println("Leg is " + sc.next());
        }

        // closing the scanner stream
        sc.close();

        System.out.println("Part 2:");

        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        B b1 = new B();
        b1.SaveU(a1.returnU());
        b1.SaveU(a2.returnU());
        b1.SaveU(a3.returnU());

        b1.InvokeAllU();

        b1.ResetU(1);

        b1.InvokeAllU();

    }
}
