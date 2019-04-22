package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userInput;
        String fizz = "Fizz";
        String buzz = "Buzz";

        System.out.print("number: ");
        userInput = scanner.nextInt();

        for (int i = 1; i <= userInput; i++){
            if (i% 3 == 0 && i % 5 == 0){
                System.out.println(fizz + buzz);
            } else if (i % 3 == 0){
                System.out.println(fizz);
            } else if ( i % 5 == 0){
                System.out.println(buzz);
            } else {
                System.out.println(i);
            }
        }

   }
}
