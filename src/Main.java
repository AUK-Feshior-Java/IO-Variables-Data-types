import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Part 1. Syntax
        //Use variables of different types (int, double, char, boolean, String).
        int personAge = 17;
        double doubleExample = 101.1;
        char charExample = 'd';
        boolean IsStudent = true;
        String personName = "Vladislav";

        //Demonstrate operations with Numbers.
        int num1 = 12;
        double num2 = 15;
        num1 += 12;
        num2 = num2/2;
        double sum = num1+num2;
        double sub = num1-num2;
        double mult = num1*num2;
        double div = num1/num2;
        double divInt = (double)num1/5;
        //Printing
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(divInt);
        //********

        System.out.println("***************************");

        //Demonstrate String operations.
        String name = "Vladislav";
        String surname = "Shvets";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        for(int i=0;i<name.length();i++){
            System.out.print("-" + name.toCharArray()[i]);
        }
        System.out.println("-");

        System.out.println("First letter -> " + name.toCharArray()[0]);

        System.out.println(name + " " + surname);

        //Demonstrate Input/Output operations.
        //Output
        System.out.print("Hello ");
        System.out.println("World!");
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String enteredName = sc.nextLine();
        System.out.println("Your name is -> " + enteredName);


        //Demonstrate use of different comment types.

        //One line comment
        /*
        Multiline comment
        */
    }
}