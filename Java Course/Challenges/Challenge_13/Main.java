package org.example.JavaCourse.Challenge_13;

public class Main {
    public static void main(String[] args) {
        System.out.print("Total Students:: ");
        int number=InputReader.inputReader();
        int[] marks=InputReader.inputMarksList(number);
        ArrayTraversal.arrayList(number,marks);

        System.out.print("enter the search element :: ");
        int elementSearch=InputReader.inputReader();
        ArraySearching.arraySearching(number,marks,elementSearch);

    }
}
