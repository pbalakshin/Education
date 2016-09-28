package ru.pbalakshin.educ;

import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by pbalakshin on 9/27/2016.
 */
public class FileParse {

    public TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

    public void Read(String s) {
        File file = new File(s);
        Scanner sc2 = null;

        String str = new String();

        try {
            sc2 = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Scanner sc2 = new Scanner(file);

        while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
            while (s2.hasNext()) {
                String s1 = s2.next();
                System.out.println(s1);
                str = s1;
            }
        }

        //return str;
    }

    public void Print() {

    }
/*
*/

}
