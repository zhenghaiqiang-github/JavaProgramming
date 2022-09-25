package chapter2.list2_4;

import java.util.Scanner;

/**
 * @author : HaiqiangZheng
 * @create : 2022-09-25 19:16
 * @description :
 */
public class ComputeAreaWithConstant {
    public static void main(String[] args) {

        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius:");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
