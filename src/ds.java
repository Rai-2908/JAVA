import java.util.*;
/*
class ds {
    public static void main(String[] args) {
        System.out.println("Available Products:-");
        System.out.println("1. Coke :- $1.5");
        System.out.println("2. Sprite :- $1.25");
        System.out.println("3. Water :- $1.0");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code of product:- ");
        int a = sc.nextInt();
        System.out.println("Enter Amount :- ");
        double b = sc.nextDouble();
        
        double coke = 1.5; 
        double sprite = 1.25; 
        double water = 1.0;
        
        if(a == 1 && b >= coke){
            System.out.println("Change return:- " + (b - coke));
        }
        else if (a == 2 && b >= sprite){
            System.out.println("Change return:- " + (b - sprite));
        }
        else if (a == 3 && b >= water){
            System.out.println("Change return:- " + (b - water));
        }
        else{
            System.out.println("Not enough Money");
        }
    }
} */
import java.util.Scanner;

public class ds{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid please enter a positive integer.");
            scanner.close();
            return;
        }

        System.out.println("Pattern:");

        for (int i = 1; i <= n; i++) {
            int number = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number += i;
            }
            System.out.println();
        }

        scanner.close();
    }
}