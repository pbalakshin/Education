package ru.pbalakshin.educ;

/**
 * Created by pbalakshin on 9/20/2016.

 Homework after Lesson2. Task 1.

 */
public class ConnectionManager {

    public static int i;
    public static Connection[] cons;// = new Connection[i];

    ConnectionManager(){
    }

    ConnectionManager(int i){
        cons = new Connection[i];
        for (int t = 0; t < cons.length; t++) {
            cons[t] = new Connection();
        }

        this.i = cons.length - 1; // Main issue, i started from 0
    }

    public static Connection GetConnection(){
        System.out.println("Start method GetStudent!");
        if(i >= 0) {
            System.out.println("i = " + i);

            return cons[i--];
        }

        else {
            System.out.println("Else path!");
            return null;
        }
    }

}
