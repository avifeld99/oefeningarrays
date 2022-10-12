package be.intecbrussel;

import java.util.Scanner;

public class MyArrays1 {

    public static void main(String[] args) {


        Scanner myScan = new Scanner(System.in);

        int[] myArr = new int[10];

        System.out.println("enter you 10 numbers: ");

        for (int index = 0; index < myArr.length; index++) {
            myArr[index] = myScan.nextInt();
        }

        for (int index = 0; index < myArr.length; index++) {
            System.out.println("number " + myArr[index]);
        }




    }
}
