package Basics;

import java.util.Scanner;

/**
 * Created by pc on 2017/6/1.
 */
public class PrintGame {
    public static void printStar(){
        int i,j,k;
        for (i=1;i<=5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void printStarR() {
        int i,j,k,n;
        Scanner input = new Scanner(System.in);
        System.out.print("please print level: ");
        n = input.nextInt();
        for (i=1;i<=n;i++){
            for (j=1;j<i;j++)
                System.out.print(" ");
            for (k=1;k<=2*(n-i)+1;k++)
                System.out.print("*");
            System.out.print("\n");

        }


    }

    public static void printStarHalf() {
        int i,j,k,n;
        Scanner input = new Scanner(System.in);
        System.out.print("please print level: ");
        n = input.nextInt();
        for (i=1;i<=n;i++){
            for (k=1;k<=n-i+1;k++)
                System.out.print("*");
            for (j=1;j<i;j++)
                System.out.print(" ");

            System.out.print("\n");

        }
    }

    public static void printNineNine(){
        int i,j;
        for (i=1;i<10;i++)
        {
            for (j=1;j<=i;j++)
                System.out.print(j+"*"+i+"="+i*j+"\t");
            System.out.print("\n");
        }

    }
    public static void main(String[] args) {
        printStar();
        //printStarR();
       // printStarHalf();
        printNineNine();
        String stra="1,2,a,4,5";
        String[] a=stra.split(",");
        for (String i:a){
            System.out.print(i);
        }
    }
}
