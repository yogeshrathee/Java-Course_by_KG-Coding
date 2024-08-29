package org.example.JavaCourse.Challenge_14;


import org.example.JavaCourse.Challenge_14.Patterns.Pyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int input=sc.nextInt();
        Pyramid.pyramid1(input);
        System.out.println();
        Pyramid.pyramid2(input);
        System.out.println();
        Pyramid.pyramid3(input);
        System.out.println();
        Pyramid.pyramid4(input);
    }
}
