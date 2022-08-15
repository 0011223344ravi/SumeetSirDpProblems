package DP;

public class Fabonacci {
 public static int fib(int n ){

     if(n==0 || n ==1){
         return n ;
     }
     System.out.println("called method"+n);
     int fabN= fib(n-1);
     int fabN1= fib(n-2);
     int fibTotal = fabN1+fabN;
     return fibTotal;


 }


    public static int fibMemoized(int n , int qb [] ){

        if(n==0 || n ==1){
            return n ;
        }

        if(qb[n] !=0){
            return qb[n];
        }
        System.out.println("called method"+n);
        int fabN= fibMemoized(n-1, qb);
        int fabN1= fibMemoized(n-2,qb);
        int fibTotal = fabN1+fabN;
        qb [n]=fibTotal;
        return fibTotal;


    }
    public static void main(String[] args) {
        int qb [] = new int [11];
        int n = fib(10);
        int n1 = fibMemoized(10,qb);
        System.out.println(n);
        System.out.println(n1);
    }
}
