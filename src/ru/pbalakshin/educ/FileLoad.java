package ru.pbalakshin.educ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by pbalakshin on 9/27/2016.
 */
public class FileLoad {

    // D:\Work\input_file_for_lesson_4_homework.txt
    public void Check(String s) {

        String s_new = "";
        try (BufferedReader br = new BufferedReader(new FileReader(s))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                //System.out.println(sCurrentLine);
//                s_new = sCurrentLine;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

//        return s_new;
    }
}
