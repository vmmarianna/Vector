package com.company;

import java.util.Scanner;

public class Commands {

    private Scanner scanner = new Scanner(System.in);
    private Vector x;
    private Vector y;
    private Vector z;
    private Vector c;


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
                    System.out.println("multiply");
                    System.out.println("exit");
                    break;
                case "ADD":
                    input();
                    break;
                case "PRINT":
                    break;
                case "SUM":


                    break;
                    /*
                case "SUB":
                    z = x.sub(y);
                    print(command);
                    break;

                case "MULTIPLY":
                    z = x.multiply(y);
                    print(command);
                    break;
                    */
                case "EXIT":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Unexpected value: " + command.toUpperCase());
                    break;
            }

        }
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

       x = new Vector(x1,y1,z1);
        y = new Vector(x2,y2,z2);
        scanner.nextLine();
    }
}