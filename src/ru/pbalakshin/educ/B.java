package ru.pbalakshin.educ;

import java.util.ArrayList;

/**
 * Created by pbalakshin on 9/23/2016.
 */
public class B {

    ArrayList<U> listU = new ArrayList<U>();

    public void SaveU(U linkU) {
        listU.add(linkU);
    }

    public void ResetU(int positionToDel) {
        listU.remove(positionToDel);
        System.out.println("Reset from the list element #" + positionToDel);
    }

    public void InvokeAllU() {
        //U[] tempU = (U[]) listU.toArray(new U[listU.size()]); //Don't need to cast as we already define the lus of <U>s
        U[] tempU = listU.toArray(new U[listU.size()]);
        //for(int i=0; i < listU.size(); i++){
        for (int i = 0; i < tempU.length; i++) {
            System.out.println("Array element #" + i);
            tempU[i].Method1();
            tempU[i].Method2();
            tempU[i].Method3();
        }

    }

}
