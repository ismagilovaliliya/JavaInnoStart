public class Main {

    public static double f(double x){
        return x*x;
        //return Math.sin(x);
    }


    public static double integralByRectangles(double a, double b, int n){
        double h =(b-a)/(n); // шаг

        double result = 0;

        for(int k = 1; k < n; k++){

            double x2 = a + k*h;
            double x3 = a +(k+1)*h;

            result += (h/3)*(f(a) + 4*(f(x2) + f(x3)));
        }

        return result;
    }


    public static void printIntegralResultForN(double a, double b, int ns[]){
        for (int i = 0; i< ns.length; i++){
            System.out.println("For N= "+ ns[i] + ", result = " + integralByRectangles(a,b,ns[i]));
        }

    }

    public static void main(String args[]){

        int ns[] = {10,100,1000,10000,100000,1000000};
        printIntegralResultForN(0,10,ns);

    }
}
