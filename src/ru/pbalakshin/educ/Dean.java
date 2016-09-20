package ru.pbalakshin.educ;

import com.sun.corba.se.impl.orbutil.DenseIntMapImpl;

import java.util.Scanner;

/**
 * Created by pbalakshin on 9/20/2016.
 */
public class Dean {

    static int num = 0;
    static Student[] students;

    Dean(){

    }

    Dean(int studentsNumber){
        this();
        Student[] students = new Student[studentsNumber];
    }

        //for (int i = 1; i <= studentsNumber; i++ ) {


            //System.out.println(dn1.);
        //}

    public static Student getStudent(){
        return students[num--];
    }

}
