package chapter2.list2_3;

import java.util.Scanner;

/**
 * @author : HaiqiangZheng
 * @create : 2022-09-25 16:16
 * @description :
 */
public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);

    }
}
