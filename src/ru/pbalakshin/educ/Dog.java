package ru.pbalakshin.educ;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 * Created by pbalakshin on 9/23/2016.
 */
public class Dog implements Readable {

    String input = "front-left front-right hind-right hind-left";

    @Override
    public int read(CharBuffer cb) throws IOException {
        cb.append(input);
        return -1; //should be that value as end of stream
    }
}
