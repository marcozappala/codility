public class PermMissingElement {
    public int solution(int[] A) {
      if (A.length ==0) {
        return 0;
      }
      return ((A.length+1) * (A.length+2)/2) - sumAll(A, 0);
    }

    private int sumAll(int[] A, int starting) {
/*        if (starting == A.length) {
            return 0;
        }
        return A[starting] + sumAll(A, starting +1);*/
      int sum =0;
      for (int i=0; i< A.length; i++) {
        sum +=A[i];
      }
      return sum;
    }
}
