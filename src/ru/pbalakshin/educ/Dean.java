package ru.pbalakshin.educ;

import com.sun.corba.se.impl.orbutil.DenseIntMapImpl;

import java.util.Scanner;

/**
 * Created by pbalakshin on 9/20/2016.
 */
public class Dean {

    static int num = 0;

    Dean(){

    }

    Dean(int studentsNumber){
        this();
        Student[] students = new Student[studentsNumber];
    }

    public static void main(String[] args) {
        System.out.println("Please enter the number of required students:");

        int studentsNumber = 0;
            Scanner in = new Scanner(System.in);
        studentsNumber = in.nextInt();

        Dean dn1 = new Dean(studentsNumber);

        for (int i = 1; i <= studentsNumber; i++ ) {


            //System.out.println(dn1.);
        }
    }

    public static void getStudent(){

    }

}
