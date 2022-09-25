package chapter2.list2_10;

import java.util.Scanner;

/**
 * @author : HaiqiangZheng
 * @create : 2022-09-25 21:27
 * @description :
 */
public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount*100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters =  remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consist of");
        System.out.println("  "+numberOfOneDollars + " dollars");
        System.out.println("  "+numberOfQuarters + " quarters");
        System.out.println("  "+numberOfDimes + " nickels");
        System.out.println("  "+numberOfPennies + " pennies");

    }
}
