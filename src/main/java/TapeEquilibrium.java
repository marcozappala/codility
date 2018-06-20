public class TapeEquilibrium {
  public int solution(int[] A) {
    // write your code in Java SE 8
    //a = 3,1,2,4,3
    // aST arrayOfSumFromTop = 3, 3+1,3+1+2,....= 3, 4, 6, 10, 13
    // aSB arrayOfSumFromBottom = 13, 10, 9, 7, 3
    // aAD arrayOfAbsoluteDfferences = x,|aST[i] - aSB[i+1]|,x
    // find the max
    // total O(n)
    //Not clean code but i am time boxed.


    int[] aST =  new int[A.length];
    int[] aSB =  new int[A.length];

    aST = fillAST(A);
    aSB = fillASB(A);
    return findMinimum(A, aST, aSB);

  }


  private int[] fillAST(int[] A) {
    int[] aST =  new int[A.length];
    aST[0] = A[0];

    for (int i= 1; i < A.length; i++) {
      aST[i] = aST[i-1]+A[i];

    }
    return aST;
  }

  private int[] fillASB(int[] A) {
    int[] aSB =  new int[A.length];
    aSB[A.length -1] = A[A.length -1];

    for (int i = A.length -2; i > 0 ; i--) {
      aSB[i] = aSB[i+1]+A[i];

    }

    return aSB;
  }

  private int findMinimum(int[] A, int[] aST, int[] aSB) {
    int minimum = Integer.MAX_VALUE;
    for (int i= 0; i < (A.length -2); i++) {
      int difference = aST[i] - aSB[i+1];
      int absoluteDifference = difference < 0 ? difference * (-1) : difference;


      if (minimum >  absoluteDifference) {
        minimum = absoluteDifference;
      }
    }
    return minimum;
  }
}
