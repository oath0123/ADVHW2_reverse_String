package com.example.lib;

import java.util.Scanner;


public class MyClass {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            for (int i = input.length(); i > 0; i--) {
                System.out.print(input.substring(i - 1, i));
            }
            System.out.println();
        }
    }
}
