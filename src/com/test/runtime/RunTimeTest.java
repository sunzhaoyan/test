package com.test.runtime;

import java.io.IOException;

public class RunTimeTest {
    public static void main(String[] args) {
        try {
            String cmd = "C:\\Users\\szy\\Desktop\\1.bat";
            Process process = Runtime.getRuntime().exec(cmd);
            System.out.println(process);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
