package org.example.JavaCourse.Challenge_13;

public class ArraySearching {
    public static void arraySearching(int number,int[] marks, int elementSearch){

        boolean found=false;

       for(int i=0;i<number;i++){
           if(marks[i] == elementSearch){
               System.out.println(elementSearch+" is present in index :: "+i);
               found=true;
               break;
           }
       }
       if(!found){
           System.out.println(elementSearch+" is not present in any index !!");
       }

    }
}
