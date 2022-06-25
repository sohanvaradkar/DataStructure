package com.coding;

import java.util.Scanner;

public class ProductMultiply {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        System.out.println("Please input the number");
        numberOfProducts(a);
    }
    public static void numberOfProducts(int n){
        int product = 1;

        while (n != 0)   {
            product = product * (n % 10);
            n = n / 10;
        }

        if(product > 10) {
            System.out.println("Intermediate result="+product);
            numberOfProducts(product);
        }
        else
            System.out.println("Final 1 digit product="+product);

    }
}

