package ru.pbalakshin.educ;

/**
 * Created by pbalakshin on 9/20/2016.
 */
public class Base {

    public void SetValue (){
        System.out.println("Method 1 = Set Values");
        this.GetValue();
    }

    public void GetValue (){
        System.out.println("Method 2 = Get Values");
    }


}
