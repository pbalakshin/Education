package ru.pbalakshin.educ;

import java.util.Scanner;

/**
 * Created by pbalakshin on 9/20/2016.
 */
public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("Please enter the number of required students:");

        int studentsNumber = 0;
        Scanner in = new Scanner(System.in);
        studentsNumber = in.nextInt();

        System.out.println(studentsNumber);

        Dean dn1 = new Dean(studentsNumber);

        dn1.getStudent();
        System.out.println(studentsNumber);
    }

}