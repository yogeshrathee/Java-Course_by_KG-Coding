package org.example.JavaCourse.Challenge_13;

import java.util.Scanner;

public class InputReader {
    static Scanner sc=new Scanner(System.in);
    public static int inputReader(){
        return sc.nextInt();

        }
    public static int[] inputMarksList(int number){
        return new int[number];
    }
}
