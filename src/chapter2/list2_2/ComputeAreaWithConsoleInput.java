package chapter2.list2_2;

import java.util.Scanner;

/**
 * @author : HaiqiangZheng
 * @create : 2022-09-25 16:10
 * @description :
 */
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
