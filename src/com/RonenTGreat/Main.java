package com.RonenTGreat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number;
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("You enter " + number + ".\n");

        for(int i = 1; i <= number; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
