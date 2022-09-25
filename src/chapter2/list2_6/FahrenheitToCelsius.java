package chapter2.list2_6;

import java.util.Scanner;

/**
 * @author : HaiqiangZheng
 * @create : 2022-09-25 19:33
 * @description :
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");


    }
}
