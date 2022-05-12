package com.example.bingoboard;

import java.security.SecureRandom;  //class to produce each random number for each round

    public class BingoNumber {
        int[] r = new int[75];  //creates an array
        int i;
        public BingoNumber() {
            for (int i = 0; i < 75; i++) { // fills array with values 1 through 75
                r[i] = i + 1;
            }
            SecureRandom rndint = new SecureRandom();
            for (int i = 0; i < 1000; i++) {        //mixes the array randomly 1000 times to get a random order of numbers
                int rng1 = rndint.nextInt(75);
                int rng2 = rndint.nextInt(75);
                int a = r[rng1];
                int b = r[rng2];
                r[rng1] = b;
                r[rng2] = a;
            }
        }
        public int NewNumber (){
            return r[i++];
        } //returns the first number in the randomly mixed array, then the second, and so on

    }


