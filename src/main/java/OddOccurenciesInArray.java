import java.util.HashMap;
import java.util.Map;

public class OddOccurenciesInArray {

  public int solution(int[] A) {
    // write your code in Java SE 8
    int unpaired = -1;
    Map<Integer, Integer> map = new HashMap<Integer,Integer>();

    for (int i = 0; i < A.length; i++) {
      if (map.get(Integer.valueOf(A[i])) != null) {
        map.remove(Integer.valueOf(A[i]));
      }
      else {
        map.put(Integer.valueOf(A[i]), Integer.valueOf(A[i]));
      }
    }

    return map.keySet().stream().findFirst().get();

  }
}

