package org.example.JavaCourse.Challenge_14.Patterns;

public class Pyramid {
    public static void pyramid1(int number){
        int x=0;
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number-i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=(2*i-1);j++){
                System.out.print("* ");
            }


            for(int j=1;j<=number-i;j++){
                System.out.print("  ");
            }
            System.out.println();
        }

    }


    public static void pyramid2(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                if(i==number || j==number || i==1 || j==1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pyramid3(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number-i;j++){
                System.out.print("  ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }

            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    public static void pyramid4(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number-i;j++){
                System.out.print("   ");
            }

            for(int j=1;j<=(2*i-1);j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=number-1;i>=1;i--){
            for(int j=1;j<=number-i;j++){
                System.out.print("   ");
            }

            for(int j=1;j<=(2*i-1);j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
