import java.util.Scanner;

public class Main {

    public static void main (String args[]){
        /*без массивов, списков, циклов :(*/

        int number = 12345;
        int digitsSum = 0;


        digitsSum += number % 10; number = number / 10;
        digitsSum += number % 10; number = number / 10;
        digitsSum += number % 10; number = number / 10;
        digitsSum += number % 10; number = number / 10;
        digitsSum += number % 10; number = number / 10;

        System.out.println("Task1. Sum number:"+ digitsSum);


        int number2 =12345;
        System.out.println("Task2. Number : " + number2 + ", binaryNumber: ");
        binaryNumber(number2);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Task3. Please, enter count of number ");
        int count = scanner.nextInt();

        System.out.println("Please, enter count" + count +" numbers ");

        int i = 0 ;
        while(i < count)
        {

            int currentNumber = scanner.nextInt();
            i++;
        }
    }

    public static void binaryNumber(int number)
    {
        int ost;
        if (number < 2)
        {
            System.out.print( number);
            return;
        }

        System.out.print(number % 2);
        binaryNumber(number = number / 2);

    }
}
