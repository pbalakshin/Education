package ru.pbalakshin.educ;

/**
 * Created by pbalakshin on 9/20/2016.
 */
public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("START!");
        ConnectionManager cm1 = new ConnectionManager(3);
        System.out.println("Initialization completed!!");


        Connection c1 = cm1.GetConnection();
        System.out.println(c1);
        System.out.println("Work Done");
    }

}