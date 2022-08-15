package DP;

public class ClimbStairs {

    public static int countPath (int  n   , int qb  [] ){

         if(n==0){
             return 1;
         }

        if(n <0){
            return 0;
        }

        if(qb[n] !=0){
            return qb[n];
        }
        int nm1 = countPath(n-1, qb);
        int nm2 = countPath(n-2, qb);
        int result  = nm1+nm2;
            qb[n] = result;
        return result;

    }


    public int countPathOtherWays(int n) {
    int dp [] = new int [n+1];
      dp[0] =1;
         for(int i =1; i<=n ; i++){

        if(i==1){
            dp[i] = dp[i-1]  ;
        }

        else {
            dp[i] = dp[i-1]  +dp[i-2];

        }

    }
         return dp[n];

}
    public static void main(String[] args) {
     int n = 44;
        int qb [] = new int [n+1];
        System.out.println(countPath(n,qb));
    }
}
