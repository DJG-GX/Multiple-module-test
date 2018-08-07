package com.gxwebmanager.solutions.Child1;

import java.io.File;
import java.io.InputStreamReader;

public class App{

    public static void main(String[] args) {
        System.out.println("some simple print statement");
        System.out.println("print statement");

        String path = "C:\\Users\\daang\\Documents\\Github\\Multiple-module-test\\Child1\\src\\main\\java\\com.gxwebmanager.solutions.Child1\\App.java";
        int idx = path.indexOf("src");

        String pathss = path.substring(0, idx);
        System.out.println(pathss);

    }
}