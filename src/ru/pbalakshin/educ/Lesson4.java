package ru.pbalakshin.educ;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by pbalakshin on 9/26/2016.
 * <p>
 * 1.1 Review and understand how to select container for your needs:
 * http://i.stack.imgur.com/aSDsG.png
 * <p>
 * 2.1 Using Map<String,Integer> create program which calculates number of occurances of each word in text file.
 * Path to text file is provided as parameter.
 * 2.1.helper You may want to use Scanner class to read text file.
 * If you are stuck - take a look here: http://stackoverflow.com/questions/4574041/read-next-word-in-java
 * 2.2 Sort results in alphabetical order and print to console.
 * 2.3 Handle possible FileNotFoundException with try-catch.
 * 2.4 Throw custom NoCatsFoundInFileException custom exception if there are no word 'cat' or 'cats' in text file.
 * 2.5 (do if you have time) Use Logger object to write stack trace information for exceptions above.
 * Configure it so that it is written to log file instead of console.
 */
public class Lesson4 {
    public static void main(String[] args) {

        System.out.println("Please enter the path to file:");

        Scanner in = new Scanner(System.in);
        //String s = in.next();

        FileLoad f1 = new FileLoad();
        FileParse f2 = new FileParse();
        //f.Check(s);
        //System.out.println(in.next());
        //System.out.println(f1.Check(in.next()));

        f1.Check(in.next());
        //System.out.println(f2.Read(in.next()));
        f2.Read(in.next());

    }


}
