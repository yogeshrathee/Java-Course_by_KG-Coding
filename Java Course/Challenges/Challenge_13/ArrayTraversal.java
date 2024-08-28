package org.example.JavaCourse.Challenge_13;

import java.util.Arrays;

public class ArrayTraversal {
    public static void arrayList(int number, int[] marks) {

        for(int i=0;i<number;i++){
            System.out.print("Enter the marks of "+(i+1)+" student :: ");
            marks[i]= InputReader.inputReader();
        }
        System.out.println(Arrays.toString(marks));
    }
}
