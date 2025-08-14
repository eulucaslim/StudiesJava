package application;

import services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values? ");
        int values = sc.nextInt();

        PrintService ps = new PrintService();

        for (int i = 0; i < values; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();

        System.out.println("First: " + ps.first());

        sc.close();
    }
}
