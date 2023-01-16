import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main (String[] args){

        System.out.println("HomeWork. Choose number [1,2,3,4,5,6,7]");
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1){
            System.out.println("1. ArraySum");
            //сумма элеметов массива
            arraySum();
        }
        if (n == 2){
            System.out.println("2. Revers");
            //разворот массива
            revers();
        }
        if (n == 3){
            System.out.println("3. Arrys Average");
            //среднее арифитичсеикое
            arrayAverage();
        }
        if (n == 4){
            System.out.println("4. Change Min Max");
            //замена макс и мин местами
            changeMinMax();
        }
        if (n == 5){
            System.out.println("5. Bubble Sort");
            //соритировка пузьковым методом
            bubbleSort();
        }
        if (n == 6){
            System.out.println("6. Number Transp");
            //преобразование массива в число
            numberTranp();
        }
        if (n == 7){
            System.out.println("7. Insert Array");
            //заполнение по спирали
            insertArray();
        }

    }

    public static void arraySum(){

        System.out.println("1.Input count:");
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        int arraySum = 0;

        for (int i = 0; i < array.length; i++){
            System.out.println("Input number:");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array :" + Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            arraySum =  arraySum + array[i];
        }
        System.out.println("ArraySum: " + arraySum);
    }

    public static void revers(){

        System.out.println("2. Input count:");
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        int arrayRevers[] = new int[n];

        for (int i = 0; i < array.length; i++){
            System.out.println("Input number:");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array :" + Arrays.toString(array));

        /*Вывод в зеркальном представлении*/
        for (int i = array.length - 1, j=0; i >= 0; i--){
            int number = array[i];
            arrayRevers[j] = number;
            j++;
        }
        System.out.println("Array revers: " + Arrays.toString(arrayRevers));

    }

    public static void arrayAverage(){

        System.out.println("3. Input count:");
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        int arrayAverage = 0;
        int arraySum = 0;

        for (int i = 0; i < array.length; i++){
            System.out.println("Input number:");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array :" + Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            arraySum =  arraySum + array[i];
        }

        arrayAverage = arraySum / n;

        System.out.println("Array average: " + arrayAverage);
    }

    public static void changeMinMax(){

        System.out.println("4. Input count:");
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        int maxNumber = 0;
        int minNumber = 0;
        int indexMaxNumber = 0;
        int indexMinNumber = 0;

        for (int i = 0; i < array.length; i++){
            System.out.println("Input number:");
            array[i] = scanner.nextInt();
            maxNumber = array[0];
            minNumber = array[0];
        }

        System.out.println("Array :" + Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            if ( array[i] >=  maxNumber) {maxNumber = array[i]; indexMaxNumber = i;}
            if ( array[i] <=  minNumber) {minNumber = array[i]; indexMinNumber = i;}
        }

        System.out.println("Array maxNumber:" + maxNumber + " ,indexMaxNumber: " + indexMaxNumber);
        System.out.println("Array minNumber:" + minNumber + " ,indexMinNumber: " + indexMinNumber);

        array[indexMaxNumber] = minNumber;
        array[indexMinNumber] = maxNumber;

        System.out.println("Array :" + Arrays.toString(array));
    }

    public static void bubbleSort(){

        System.out.println("5. Input count:");
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < array.length; i++){
            System.out.println("Input number:");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array :" + Arrays.toString(array));

        for (int i = 0; i < array.length; i++)
            for ( int j = array.length -1; j > i; j--){
                if (array[j] < array [j-1]) {
                    int numberJ = array[j];
                    int numberJ1 = array [j-1];

                    array[j] = numberJ1;
                    array[j-1] = numberJ;

                }

            }
        System.out.println("Array :" + Arrays.toString(array));
    }

    public static void numberTranp(){
        int array[] = {4, 2, 3, 5 ,7};
        int number = 0;

        System.out.println("Array :" + Arrays.toString(array));

        for(int i = 0; i< array.length-1; i++){
            number =number + array[i]*(int)(Math.pow(10, (array.length-1)-i));
        }

        System.out.println("number: " +number);

    }

    public static void insertArray(){

        System.out.println("7. Input size m:");

        Scanner scanner =  new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println("Input size n:");
        int n = scanner.nextInt();

        int[][] resultArray = new int[m][n];
        int array[] = new int[m*n];

        System.out.println("Input array :");
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Array :" + Arrays.toString(resultArray));

        int k = 0;

        for (int i = 0; i < m-1; i++)
            for (int j = 0; j < n-1; j++)
            {
                int currentNumber = array[k];
                resultArray[i]][j] = currentNumber;
                k++;
            }

        System.out.println("Array :" + Arrays.toString(resultArray));

    }
}
