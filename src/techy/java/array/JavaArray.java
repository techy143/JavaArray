package techy.java.array;

public class JavaArray {

    public static void main (String [] agrs){


        int [] number = new int[5];
        int len = number.length;


        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        int sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("sum = " +sum);

        System.out.println(number[1]);
        System.out.println("Array size = " +len);









    }


}
