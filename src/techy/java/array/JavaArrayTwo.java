package techy.java.array;

import java.util.Scanner;

public class JavaArrayTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] number = new double[5];

        double sum = 0;

        System.out.println("Please Enter any 5 numbers : ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }


        for (int i = 0; i < number.length; i++) {

            sum = sum + number[i];
        }


        System.out.println("The sum is : "+sum);

    }

}