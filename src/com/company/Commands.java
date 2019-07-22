package com.company;

import java.util.Scanner;

public class Commands {


    private Vector vector1;
    private Vector vector2;
    private Vector result;

    Scanner scanner = new Scanner(System.in);


    public void serve() {
        System.out.println("You can use 'help' ");
        while (true) {
            System.out.print("--> ");
            String command = scanner.nextLine();
            switch (command.toUpperCase()) {
                case "HELP":
                    System.out.println("print");
                    System.out.println("add");
                    System.out.println("sum");
                    System.out.println("sub");
                    System.out.println("MultiplyNumber");
                    System.out.println("MultiplyVector");
                    System.out.println("exit");
                    break;
                case "ADD":
                    input();
                    break;
                case "PRINT":
                    System.out.println(vector1);
                    System.out.println(vector2);
                    break;
                case "SUM":
                    result = vector1.sum(vector2);
                    print(command);
                    break;

                case "SUB":
                    result = vector1.sub(vector2);
                    print(command);
                    break;

                case "MULTIPLYVECTOR":
                    result = vector1.multiplyVector(vector2);
                    print(command);
                    break;

                case "MULTIPLYNUMBER":
                    double number = scanner.nextDouble();
                    System.out.println("Input number: " + number);
                    result = vector1.multiplyNumber(number);
                    scanner.nextLine();
                    print(command);
                    break;
                case "EXIT":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Unexpected value: " + command);
                    break;
            }

        }
    }

    private void print(String command) {
        System.out.println(command + " " + result);
    }


    public void input() {
        System.out.println("Input x1: ");
        double x1 = scanner.nextDouble();
        System.out.println("Input y1: ");
        double y1 = scanner.nextDouble();
        System.out.println("Input z1: ");
        double z1 = scanner.nextDouble();
        System.out.println("Input x2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Input y2: ");
        double y2 = scanner.nextDouble();
        System.out.println("Input z2: ");
        double z2 = scanner.nextDouble();
        vector1 = new Vector(x1,y1,z1);
        vector2 = new Vector(x2,y2,z2);
        scanner.nextLine();
    }
}