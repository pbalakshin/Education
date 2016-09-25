package ru.pbalakshin.educ;

/**
 * Created by pbalakshin on 9/23/2016.
 */
public class A {

    public U returnU() {
        return new U() { // Is it possible to write this way? I mean to return exact U right here.

            @Override
            public void Method1() {
                System.out.println("Anonymous Inner Class Method1 - Override");
            }

            @Override
            public void Method2() {
                System.out.println("Anonymous Inner Class Method2 - Override");
            }

            @Override
            public void Method3() {
                System.out.println("Anonymous Inner Class Method3 - Override");
            }

        };

    }
}
