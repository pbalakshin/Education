package ru.pbalakshin.educ;

/**
 * Created by pbalakshin on 9/20/2016.

Task 1.
        1.1 Create class Connection with one field, custom constructor and one method. Create also overloaded method.
        Names and logic doesn't matter here - just make is so that you are able to initialize new Connection object.
        1.2 Create class ConnectionManager which should have static array of Connection objects which are initialized in custom constructor.
        Custom constructor should have a parameter which defines number of array elements.
        1.3 Create static method GetConnection in ConnectionManager which returns link to one (and new each time) of Connection objects from the array above
        until there are no unused objects. When there are no available Connection objects anymore it should return null.
        1.4 Instantiate ConnectionManager correctly and demonstrate how it returns objects (and null) in main method.
        Is it possible to change you program so that you don't need to create new object with ConnectionManager type? How?
        You need to set access modificators (public/private) correctly so that in main method you can't break anything even if you want :)

 Task 2.
        2.1 Create base (base meaning we will be extending it further, nothing more) class with two methods
        (they just write different things to console).
        2.2 Invoke second method in first method.
        2.3 Create derived class from base class and redefine second method.
        2.4 Create object of derived class and make upcasting to base class. Invoke first method - which methods are executed and from which classes?

 */

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("START of TASK 2!");
        ConnectionManager cm1 = new ConnectionManager(3);
        System.out.println("Initialization completed!!");

        for (int k = 0; k < 4; k++){
            Connection c1 = cm1.GetConnection();
            System.out.println(c1);
        }

        System.out.println("Work Done");

        System.out.println("START of TASK 3!");

        Base b1 = new Base();
        BaseExtended b1n = new BaseExtended();

        System.out.println("b1.SetValue(): ");
        b1.SetValue();
        System.out.println("b1.GetValue(): ");
        b1.GetValue();
        System.out.println("b1n.GetValue(): ");
        b1n.GetValue();

        // Should be upcasting
        Base b2 = (Base) b1n;
        System.out.println("b2.SetValue(): ");
        b2.SetValue();
    }

}