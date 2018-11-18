package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] a = new int[3][5];
        Random rnd = new Random();
        for (int i=0;i < a.length;i++) {
            for (int j=0;j < a[i].length;j++) {
                a[i][j]=rnd.nextInt(9) +1;
            }
        }
        for (int i=0; i < a.length; i++) {
            System.out.println(" ");
            for (int j=0; j<a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
