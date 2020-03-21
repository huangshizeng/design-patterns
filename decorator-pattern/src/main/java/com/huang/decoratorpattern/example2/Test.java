package com.huang.decoratorpattern.example2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author hsz
 */

public class Test {

    public static void main(String[] args) throws Exception {
        File file = new File("f:/test.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        UpperCaseInputStream ucis = new UpperCaseInputStream(bis);
        int c;
        while ((c = ucis.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
