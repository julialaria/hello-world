package com.ironhack.main;

import java.util.Arrays;

public class main<array1, reversed> {
    public static void main(String[] args) {
        int[] numList = {5, 4, 3, 2, 1};
        int first = numList[0];

        for (int i =0; i<numList.length; i++){
            if (i+1 == numList.length) {
                numList[i] = numList[i] * first;
            }
            else {
                numList[i] = numList[i] * numList[i + 1];
            }
        }

        for (int i =0; i<numList.length; i++) {
            System.out.println(numList[i]);
        }

        int [] arrayEx2 = {1,2,3,4,5};

        for (int i=arrayEx2.length-1; i >= 0 ; i--){
                System.out.println (arrayEx2[i]);
            }
    }

    }














