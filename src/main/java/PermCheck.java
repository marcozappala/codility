import java.util.Map;

public class PermCheck {
  public int solution(int[] A) {
    Map<Integer, Integer> map = new HashMap<>();

    map = buildMapFromArray(A);

    if (map ==null) {
      return 0;
    }
    return 1;

  }

  private Map<Integer, Integer> buildMapFromArray(int[] A) {
    Map<Integer, Integer> map = new HashMap<>();
    for ( int i=0; i< A.length; i++) {
      if ((A[i] > A.length) || map.get(Integer.valueOf(A[i])) != null) {
        return null;
      }
      map.put(Integer.valueOf(A[i]), Integer.valueOf(A[i]));
    }
    return map;
  }
}
