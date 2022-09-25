package chapter2.list2_8;

import java.util.Scanner;

/**
 * @author : HaiqiangZheng
 * @create : 2022-09-25 20:11
 * @description :
 */
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter purchase amount: ");
        double tax = input.nextDouble();
        System.out.println("Sales tax is $"+(int)(tax * 100) / 100.0);
    }
}
